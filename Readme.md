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