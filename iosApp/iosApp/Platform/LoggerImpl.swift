//
//  LoggerImpl.swift
//  iosApp
//
//  Created by Yogesh N Ramsorrrun on 28/08/2020.
//  Copyright © 2020 orgName. All rights reserved.
//

import Foundation
import shared

class LoggerImpl: Logger {
    func log(message: String) {
        NSLog(message)
    }
}
