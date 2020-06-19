import SwiftUI
import shared

struct ContentView: View {
    var body: some View {
        Text(PlatformKt.platformName)
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
