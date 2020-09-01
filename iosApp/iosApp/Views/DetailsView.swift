//
//  DetailsView.swift
//  iosApp
//
//  Created by Yogesh N Ramsorrrun on 25/08/2020.
//  Copyright © 2020 orgName. All rights reserved.
//

import SwiftUI
import shared

struct DetailsView: View {
    
    let repo: GithubRepo
    var body: some View {
        Button(action: {
            if let url = URL(string: self.repo.url) {
                UIApplication.shared.open(url)
            }
        }) {
            Text(repo.name)
        }
    }
}

struct DetailsView_Previews: PreviewProvider {
    static var previews: some View {
        DetailsView(repo: GithubRepo(id: 1, name: "Joe", url: "www.google.com"))
    }
}
