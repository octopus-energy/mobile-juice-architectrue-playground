## What is this?
A project for experimenting on tools and architecture for the mobile electric juice apps

## What does it use?
The project is built with kotlin multiplatform which allows the re-use of code between platforms. Initially that will just be between iOS and Android, but in the future it could include anything from desktop to web to watch to backend

## Howzit architected?
In order to maximise code reuse the app uses clean architecture and separates the app into layers. In order to make this possible dependency injection is used heavily.

#### Native 
**Ui** - This is 100% native. iOS uses can use SwiftUi. Android can use Jetpack Compose. Minimal logic is maintained in this layer. This layer is concerned only with rendering ViewStates.  
**Platform implementations** - Interfaces from higher layers will be implemented using platform sdks and libraries

#### Shared
**ViewModels** - Architected in the MVI pattern and accept a events from the UI and expose a stream of ViewStates for the UI to listen to and render.  
**Domain** - Contains usecases, entities, and interfaces implemented by other layers.  
**Repositories** - The repository pattern is used for data caching and hiding the source of data. There is a one-to-one relationship between repositories and data objects.  
**Services** - Any data source is classified as its own service, this layer will map data sources into the domain entity model.


#### Running Android
Should run as is. Just click build.

Add the TabNine plugin to have basic code completion in swift code within android studio. 

#### Running iOS
A little more setup to do here

**Add the shared framework**
- Open the iOS folder in xcode
- Double click the root to open target settings
- In General -> Frameworks, Libraries, Embedded Content click +
- Click Add Other and add file
- Navigate to shared -> build -> xcode-frameworks
- Select shared.framework
- In the next dialog, select the Create folder references option and make sure that the Copy items if needed checkbox isn't checked. 

**Tell xcode where framework is**
- Navigate to Build settings -> All
- Type 'Framework Search Paths' into the search field
- Add the framework path to this section '$(SRCROOT)/../shared/build/xcode-frameworks'

**Pack the framework on each build**
- Navigate to Build Phases
- Click +
- Add new run script phase
- Add the following 
```
cd ..
./gradlew :shared:packForXCode -PXCODE_CONFIGURATION=${CONFIGURATION}
```
- Move the script to run directly after Dependencies

**Add Kotlin Xcode plugin**
- This basicaly helps debugging and reading .kt files within Xcode
- Go to https://github.com/touchlab/xcode-kotlin and download and unzip file. 
- Open up terminal and set your location to the unzipped folder 
- Type the following command in the terminal and press enter:  ./setup.sh
- Do the same for this command: sudo ./colorsetup.sh
- When prompted with a warning from Xcode, click to 'load bundle' 
