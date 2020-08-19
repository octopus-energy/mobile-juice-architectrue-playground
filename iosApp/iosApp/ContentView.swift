import SwiftUI
import shared

struct ContentView: View {
    
    let mainViewModel = MainViewModel(
        githubRepoManager: GithubRepoManager(githubService: GithubServiceImpl(githubRepoMapper: GithubRepoMapper())),
        navigator: NavigatorImpl(),
        announcer: AnnouncerImpl(),
        dispatcherProvider: DispatcherProvider()
    )

    @State private var textToDisplay: String = "Inital text"
    
    var body: some View {
        VStack {
            Text(textToDisplay).onAppear() {
                print("Appeared")
                self.mainViewModel.setNewViewStateCallback(callback: { viewState -> Void in
                    print("New State Received")
                    print(viewState)
                    self.textToDisplay = viewState.loadingIsVisible.description
                })
            }
            Button("Launch async") {
                self.textToDisplay = "Action triggered"
                self.mainViewModel.onAction(action: MainViewModel.UiActionLoadReposClicked())
            }
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
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
        print("announcement: " + text)
    }
}
