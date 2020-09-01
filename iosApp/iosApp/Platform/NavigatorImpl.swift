//
//  NavigatorImpl.swift
//  iosApp
//
//  Created by Yogesh N Ramsorrrun on 28/08/2020.
//  Copyright © 2020 orgName. All rights reserved.
//

import UIKit
import SwiftUI
import shared

class NavigatorImpl: Navigator {

    var navigationController: UINavigationController {
        let window = UIApplication.shared.windows.first!
        return window.rootViewController as! UINavigationController
    }
    
    func goToDetails(githubRepo: GithubRepo) {
        let view = DetailsView(repo: githubRepo)
        let controller = UIHostingController(rootView: view)
        navigationController.pushViewController(controller, animated: true)
    }
    
    func goToUrl(url: String) {
        // todo
    }
    
    func goToMain() {
        // todo
    }
    
}

