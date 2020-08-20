import SwiftUI
import shared
import Swinject

struct ContentView: View {
    
    var mainViewModel: MainViewModel!

    @State private var textToDisplay: String = "Inital text"
    
    var body: some View {
        VStack {
            Text(textToDisplay).onAppear() {
                print("Appeared")
                self.mainViewModel.nativeViewStateStream().watch() { state in
                    print("New State Received")
                    print(state.debugDescription)
                }
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
    }
}


class MainContainer {

    static let sharedContainer = MainContainer()

    let container = Container()

    private init() {
        setupDefaultContainers()
    }

    private func setupDefaultContainers() {

        container.register(GithubRepoMapper.self) { _ in GithubRepoMapper() }
        container.register(GithubService.self) { resolver in
            return GithubServiceImpl(githubRepoMapper: resolver.resolve(GithubRepoMapper.self)!)
        }
        container.register(GithubRepoManager.self) { resolver in
            return GithubRepoManager(githubService: resolver.resolve(GithubService.self)!)
        }

        container.register(Navigator.self) { _ in NavigatorImpl() }
        container.register(Announcer.self) { _ in AnnouncerImpl() }
        container.register(Logger.self) { _ in LoggerImpl() }
        container.register(DispatcherProvider.self) { _ in DispatcherProvider() }

        container.register(MainViewModel.self) { resolver in
            let repoManager = resolver.resolve(GithubRepoManager.self)!
            let navigator = resolver.resolve(Navigator.self)!
            let announcer = resolver.resolve(Announcer.self)!
            let dispatchProvider = resolver.resolve(DispatcherProvider.self)!
            let logger = resolver.resolve(Logger.self)!
            return MainViewModel(githubRepoManager: repoManager, navigator: navigator, announcer: announcer, dispatcherProvider: dispatchProvider, logger: logger)
        }
    }
}

class LoggerImpl: Logger {
    func log(message: String) {
        NSLog(message)
    }
}
