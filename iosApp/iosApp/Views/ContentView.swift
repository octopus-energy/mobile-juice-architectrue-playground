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
            VStack {
                VStack(alignment: .center, spacing: 0.0) {
                    ActivityIndicator(isAnimating: self.$isLoading, style: .large) //Linking activity indicator to isLoading property and its changes (Binding)
                    Text("Hello World!")
                    Text(textToDisplay)
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
                        List(repos) { repo in
                    Button(action: {
                        self.mainViewModel.onAction(action: MainViewModel.UiActionRepositoryClicked(githubRepo: repo))
                    }) {
                        HStack {
                            Image(systemName: "photo")
                            Image(systemName: "play")
                            Text(repo.name)
                        }
                    }
                }
            }
            .onAppear() { //can be considered a viewWillAppear
                self.setupViewStateObserver()
            }.navigationBarTitle("OI OI")
    }
    
    func setupViewStateObserver() {
        //Watching the viewModel's viewState not individual properties (MVI)
        mainViewModel.nativeViewStateStream().watch() { newState in
            guard let newState = newState  else { return }
            print("New State Received")
            self.repos = newState.results
            self.isLoading = newState.loadingIsVisible
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
