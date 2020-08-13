import SwiftUI
import shared

struct ContentView: View {
    
    let navigatorHere: Navigator = NavigatorImpl()
    let dispatcherProviderHere: DispatcherProvider = DispatcherProvider()
    let currentRepoRepositoryHere: CurrentRepoRepository = CurrentRepoRepository()
    lazy var viewModel = DetailsViewModel(
        navigator: navigatorHere,
        dispatcherProvider: dispatcherProviderHere,
        gitRepoRepository: currentRepoRepositoryHere
    )
    
    let closure : () -> Kotlinx_coroutines_coreFlowCollector = {
        class Testie: Kotlinx_coroutines_coreFlowCollector {
            func emit(value: Any?, completionHandler: @escaping (KotlinUnit?, Error?) -> Void) {
                print(value.debugDescription)
            }
        }
        print("Closure")
        return Testie()
    }
    let completionHandler: (KotlinUnit?, Error?) -> Void = { (_, _) -> Void in
        print("Complete")
    }
    
    @State private var textToDisplay: String = "Test"
    
    var body: some View {
        VStack {
            Text(textToDisplay).onAppear() {
                print("Appeared")
                self.textToDisplay = "mm scrumptious"
                var mutatingSelf = self
                mutatingSelf.viewModel.viewStateStream().collect(
                    collector: mutatingSelf.closure(),
                    completionHandler: self.completionHandler
                )
            }
            Button("Update text") {
                self.textToDisplay = "Take 2"
                var mutatingSelf = self
                mutatingSelf.viewModel.onAction(action: DetailsViewModel.UiActionChangeTitle())
//                self.textToDisplay = mutatingSelf.viewModel.lastViewState.toolbarTitle
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
