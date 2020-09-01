//
//  ActivityIndicatorView.swift
//  iosApp
//
//  Created by Yogesh N Ramsorrrun on 28/08/2020.
//  Copyright © 2020 orgName. All rights reserved.
//

import Foundation
import SwiftUI

struct ActivityIndicator: UIViewRepresentable {
    
    @Binding var isAnimating: Bool
    let style: UIActivityIndicatorView.Style
    
    func makeUIView(context: UIViewRepresentableContext<ActivityIndicator>) -> UIActivityIndicatorView {
        return UIActivityIndicatorView(style: style)
    }
    
    func updateUIView(_ uiView: UIActivityIndicatorView, context: UIViewRepresentableContext<ActivityIndicator>) {
        uiView.isHidden = !isAnimating
        isAnimating ? uiView.startAnimating() : uiView.stopAnimating()
        print("updating activity view to \(isAnimating)")
        print("Activity indicator is hidden? \(uiView.isHidden)")
    }
}
