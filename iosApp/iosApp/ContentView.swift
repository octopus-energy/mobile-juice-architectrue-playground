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
    
    @State private var text: String = "Test"
    
    var body: some View {
        VStack {
            Text(text)
            Button("Update text") {
                self.text = "Take 2"
            }
        }
    }
    
    init() {
//        self.viewModel.viewStateStream().collect(collector: Kotlinx_coroutines_coreFlowCollector) { (KotlinUnit?, Error?)
//            body.
//        }
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
