import SwiftUI
import shared

struct ContentView: View {
    
    let navigatorHere: Navigator = NavigatorImpl()
    lazy var viewModel = DetailsViewModel(navigator: navigatorHere)
    
    var body: some View {
        Text("\(text())")
    }
    
    func text() -> String {
        var mutatableSelf = self
        return mutatableSelf.viewModel.lastViewState.toolbarTitle
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
    
}
