# FlightGear controller - project by Roe Tamir and Itay Gradenwits.

## Intro:
We created an android app to control flight simulator using the app Flight Gear.  
The app enable to connect to a flight gear server which running on a computer at your local network, and control the flight simulator using seek bars and a joystick. 

## How to run:
Open Flight Gear and go to ``` Settings/Additional Settings ``` and write ```--telnet=socket,in,10,127.0.0.1,6400,tcp``` in there.  
Go to Fly section in the Flight Gear app.  
Open the FG Controller directory as an android project from an IDE (Android Studio for example) and press run, that would run our app on your computer.  
For better experience we recommend to connect an android device to your computer and choose to run the app from it and not from your computer. 
You can do it by choosing in your IDE.  

## How to connect to the simulation from the app:
First you need to make sure that the flight gear app and the controller app are running on computers that are on the same network.
Than at the controller app you need to insert the Ip and the port of the computer that runs flight gear. The port is 6400 and
you can find the Ip of this computer by running ```ipconfig``` on cmd for windows or ```ifconfig``` on terminal for Linux.
After you insert the ip and port press ```connect``` and the connection we'll be made.

## How to control the simulation:
First open FG and go to ```Fly``` than connect the app to the simulation like we explained above.   
After that we need to activate the engine. Press ```cecna``` and in there press ```auto fly```.   
Now the plane engine start working, Slowly increase the throttle of the plane with the vertical seek bar. You need to always stabilize the plane before it airs, you can do it with the horizontal seek Bar.
After the plane airs use the joystick to control its movement.

## MVVM Architecture

### The view:
The view is the part in the code that responsible of the graphic experience of the user.   
In our project in the package ```view``` you'll find 2 classes: ```Joystick``` and ```MainActivity```.
Those classes responsible of the code behind of the view.   
```Joystick``` is a custom view controller we wrote, and ```MainActivity``` is the main class of the app.
In Main Activity we hold reference to a ViewModel object, just like in the MVVM Architecture. We'll bind data from the graphic controllers we have to the viewModel fields.      
The xml file ```activity_main.xml``` is the file responsible of the graphic part of the view. It set the attributes of the graphic controllers which set the way the screen looks.

### The ViewModel:
The ```view_model``` package contains the class ```ViewModel``` this class role is to be kind of a pipe between the model and the view. Therefore we need to bind data from the view to the viewModel fields and call the model functionality while necessary.    
The viewModel hold a reference to a model object and uses it while necessary.

### The Model:
The  ```model``` package contains the class ```Model```.This class responsible to connect the FG server and send it data.   
The connection and communication must be in a separate thread to not stuck the UI.   
Therefore we hold a reference to a threadPool object that manage the functionally in a separate thread.
