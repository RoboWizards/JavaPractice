JavaPractice
============

Repo to practice java &amp; robot programming


# List of tasks
These are tasks to complete in order to get a grasp of Java basics & move onto programming robot. After you complete each task you should commit it saying you "Completed Task [X]". After you complete a group of tasks, push your code your branch. This repo will have commented code on how to complete each task if you need extra assistance.

### Basics
* Print to console "Hello World".
* Multiply 2 numbers & print the result (Do this with int, double, and float).
* Create a private method for printing to console, and call it from main().
* Add a string paramater to that method which it will print. Then call this method from the main() method.
* Create a constructor & initlize a boolean value.
* Create a new class & add a constructor. Then make an object of it inside your main class.
* Add a public method to your new object & call it from your main class.
* Create a new class with a static method to return a string. From your main method call the method & print the returned string.

### Intermediate
* Create a new class called "Robot". Inside add 2 variables for X & Y position (By default 0), along with getter methods and methods to move the robot (Increase or decrease values).
* Create a new instance of the "Robot" in your main class & move the robot foward. Then print out the current position.
* Have the robot instance drive in all 4 directions & print out the coordinates after each drive.
* Created a boolean in the Robot Class called "Enabled", and set it to false by default. Then add 2 public methods for changing the enabled state. Along with making your move methods check the robot is enabled
* Make a private start() method in your main class, and call it from the constructor. In the start method enable the robot & have it drive foward 4 times, using a for loop.
* Next create a private stop() method and call it at the end of the start method. (For fun, add a movement call after the stop() to see if it still drives. If you programmed it right it shoudln't).
* Create a new class called Joystick. Add a constructor which requires an int for the port number. Then, create a public final int which gets set to the argument passed in the constructor. (Also, the member variable should be named the same as the constructor variable. Hint: Use this.)
* Create a new instance of the joystick & supply a port number in your class.


### Robot Programming
Congrats! You're ready to programming the robot. 
* Create a simple robot template with TankDrive functionality.
* Add an autonomous program that drives forward & backwards.
* Add turning to this autonomous program.
* Add in pneumatic functionality.
* Create 2 buttons to lower & raise the door.
* Make a new autonomous program that drives foward, lowers the door, drives backward, and raises the door.
* Make a new autonomous program that drives foward, turns left, lowers the door, raises the door, and goes back to the start position.
* Create a private method to handle lowering & raising the door. Then call these from your autonomous program & opcontrol.

**All done!**