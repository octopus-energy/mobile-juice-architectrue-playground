import SwiftUI
import shared

struct ContentView: View {
    
    let viewModel = DetailsViewModel(
        navigator: NavigatorImpl(),
        dispatcherProvider: DispatcherProvider(),
        gitRepoRepository: CurrentRepoRepository()
    )

    @State private var textToDisplay: String = "Inital text"
    
    var body: some View {
        VStack {
            Text(textToDisplay).onAppear() {
                print("Appeared")
                self.viewModel.setNewViewStateCallback(callback: { viewState -> Void in
                    print(viewState)
                    self.textToDisplay = viewState.toolbarTitle
                    print("New State Received")
                })
            }
            Button("Launch async") {
                self.textToDisplay = "Action triggered"
                self.viewModel.onAction(action: DetailsViewModel.UiActionLaunchAsync())
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
