//
//  MainContainer.swift
//  iosApp
//
//  Created by Yogesh N Ramsorrrun on 24/08/2020.
//  Copyright © 2020 orgName. All rights reserved.
//

import Foundation
import Swinject
import shared
import Combine

class MainContainer {

    static let sharedContainer = MainContainer()

    let container = Container()

    private init() {
        setupDefaultContainers()
    }

    private func setupDefaultContainers() {

        container.register(GithubRepoMapper.self) { _ in GithubRepoMapper() }
        container.register(GithubService.self) { resolver in
            return GithubService(githubRepoMapper: resolver.resolve(GithubRepoMapper.self)!)
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
