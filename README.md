# AdvancedProgramming2_milestone3 - project by Roe Tamir and Itay Gradenwits.

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
