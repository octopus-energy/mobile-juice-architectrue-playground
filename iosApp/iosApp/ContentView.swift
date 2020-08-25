import SwiftUI
import shared

struct ContentView: View {
    
    var mainViewModel: MainViewModel!
    
    @State private var textToDisplay: String = "Inital text"
    @State private var repos = [GithubRepo]()
    @State var isLoading = false {
        didSet {
            print("isLoading is \(self.isLoading)")
        }
    }
    
    var body: some View {
        NavigationView {
            VStack {
                VStack(alignment: .center, spacing: 0.0) {
                    ActivityIndicator(isAnimating: self.$isLoading, style: .large) //Linking activity indicator to isLoading property and its changes (Binding)
                    Text("Hello World!")
                    Text(textToDisplay).onAppear() {
                        print("Appeared")
                        self.mainViewModel.nativeViewStateStream().watch() { state in //Watching the viewModel not individual properties
                            print("New State Received")
                            if let state = state {
                                self.repos = state.results
                                self.isLoading = false //Changing property in turn changes activity indicator
                            }
                        }
                    }
                    Button(action: {
                        self.textToDisplay = "Action triggered"
                        self.mainViewModel.onAction(action: MainViewModel.UiActionLoadReposClicked())
                        self.isLoading = true //Call returns so quickly that activity indicator
                    }) {
                        Text("Launch Async")
                            .font(.body)
                            .padding()
                            .frame(maxWidth: .infinity)
                            .background(Color.orange)
                            .cornerRadius(40)
                            .padding()
                        
                    }
                    
                }
                .background(Color.white)
                RepoList(repos: repos)
            }
            .navigationBarTitle(Text("Repo Loader!"), displayMode: .inline)
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        var contentView = ContentView()
        contentView.mainViewModel = MainContainer.sharedContainer.container.resolve(MainViewModel.self)
        return contentView
    }
}

class NavigatorImpl: Navigator {
    
    func goToDetails(githubRepo: GithubRepo) {
        // todo
    }
    
    func goToUrl(url: String) {
        // todo
    }
    
    func goToMain() {
        // todo
    }
    
}

class AnnouncerImpl: Announcer {
    func announce(text: String) {
    }
}


class LoggerImpl: Logger {
    func log(message: String) {
        NSLog(message)
    }
}

extension GithubRepo: Identifiable { }

struct RepoList: View {
    var repos: [GithubRepo]
    var body: some View {
        List(repos) { repo in
            NavigationLink(destination: DetailsView(repo: repo)) {
                Image(systemName: "photo")
                Image(systemName: "play")
                Text(repo.name)
            }
        }
    }
}

struct ActivityIndicator: UIViewRepresentable {
    
    @Binding var isAnimating: Bool
    let style: UIActivityIndicatorView.Style
    
    func makeUIView(context: UIViewRepresentableContext<ActivityIndicator>) -> UIActivityIndicatorView {
        return UIActivityIndicatorView(style: style)
    }
    
    func updateUIView(_ uiView: UIActivityIndicatorView, context: UIViewRepresentableContext<ActivityIndicator>) {
        uiView.isHidden = !isAnimating
        isAnimating ? uiView.startAnimating() : uiView.stopAnimating()
        print("updating activity view to \(isAnimating)")
        print("Activity indicator is hidden? \(uiView.isHidden)")
    }
}
