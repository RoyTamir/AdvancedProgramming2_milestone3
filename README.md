# FlightGear controller - project by Roe Tamir and Itay Gradenwits.

## Intro:
We created an adroid app to controll flight simulator using the app Flight Gear.  
The app enable to connect to a flight gear server which running on a computer at your local network, and control the flight simulator using seekbars and a joystich. 

## How to run:
Open Flight Gear and go to ``` Settings/Additional Settings ``` and write ```--telnet=socket,in,10,127.0.0.1,6400,tcp``` in there.  
Go to Fly section in the Flight Gear app.  
Open the FG_Controller directory as an an android project from an IDE (Android Studio for example) and press run, that would run our app on your computer.  
For better experience we recomend to connect an android device to your computer and choose to run the app from it and not from ypur computer. 
You can do it by choosing in your IDE.  

## How to connect to the simulation from the app:
First you need to make sure that the flight gear app and the controller app are running on computers that are on the same network.
Than at the controller app you need to insert the ip and the port of the computer that runs flight gear. The port is 6400 and
you can find the ip of this computer by running ```ipconfig``` on cmd for windows and ```ifconfig``` on terminal for linux.
After you insert the ip and port press ```connect``` and the connection we'll be made.

## How to controll the simulation:



## MVVM Architecture

### The view:
The view is the part in the code that responsible of the graphic expirience of the user.   
In our project in the package ```view``` you'll find 2 classes: ```JoyStick``` and ```MainActivity```.
Those classes responsible of the code behind of the view.   
```JoyStick``` is a custom view controller we wrote, and ```MainActivity``` is the main class of the app.
In Main Activity we hold reprence to a ViewModel object, just like in the MVVM Architecture. We'll bind data from the grapic controllers we have to the viewModel fields.      
The xml file ```activity_main.xml``` is the file responsible of the grapic part of the view. It set the attributes of the graphic controllers which set the way the screen looks.

### The ViewModel:
The ```view_model``` package is acontains the classs ```ViewModel``` this class role is to be kind of a pipe between the model and the view. Therfore we need to bind data from the view to the viewModel fieds and call the model functionality while neccessery.    
The viewModel hold a reference to a model object and uses it while neccessery.

### The Model:
The  ```model``` package contains the class ```Model```.This class responsible to connect the FG server and send it data.   
The connection and communication must be in a sepreate thread to not stuck the UI.   
Therefore we hold a reference to a threadPool object that manage the functionalliy in a seperate thread.
