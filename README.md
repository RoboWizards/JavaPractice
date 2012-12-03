JavaPractice
============

Repo to practice java &amp; robot programming


# List of tasks
These are tasks to complete in order to get a grasp of Java basics & move onto programming robot. After you complete each task you should commit it saying you "Completed Task [X]". After you complete a group of tasks, push your code your branch. This repo will have commented code on how to complete each task if you need extra assistance.

### Basics
1. Print to console "Hello World".
2. Multiply 2 numbers & print the result (Do this with int, double, and float).
3. Create a private method for printing to console, and call it from main().
4. Add a string paramater to that method which it will print. Then call this method from the main() method.
5. Create a constructor & initlize a boolean value.
6. Create a new class & add a constructor. Then make an object of it inside your main class.
7. Add a public method to your new object & call it from your main class.
8. Create a new class with a static method to return a string. From your main method call the method & print the returned string.

### Intermediate
9. Create a new class called "Robot". Inside add 2 variables for X & Y position (By default 0), along with getter methods and methods to move the robot (Increase or decrease values).
10. Create a new instance of the "Robot" in your main class & move the robot foward. Then print out the current position.
11. Have the robot instance drive in all 4 directions & print out the coordinates after each drive.
12. Created a boolean in the Robot Class called "Enabled", and set it to false by default. Then add 2 public methods for changing the enabled state. Along with making your move methods check the robot is enabled
13. Make a private start() method in your main class, and call it from the constructor. In the start method enable the robot & have it drive foward 4 times, using a for loop.
14. Next create a private stop() method and call it at the end of the start method. (For fun, add a movement call after the stop() to see if it still drives. If you programmed it right it shoudln't).
15. Create a new class called Joystick. Add a constructor which requires an int for the port number. Then, create a public final int which gets set to the argument passed in the constructor. (Also, the member variable should be named the same as the constructor variable. Hint: Use this.)
16. Create a new instance of the joystick & supply a port number in your class.


### Robot Programming
Congrats! You're ready to programming the robot. 

17. Create a simple robot template with TankDrive functionality.
18. Add an autonomous program that drives forward & backwards.
19. Add turning to this autonomous program.
20. Add in pneumatic functionality.
21. Create 2 buttons to lower & raise the door.
22. Make a new autonomous program that drives foward, lowers the door, drives backward, and raises the door.
23. Make a new autonomous program that drives foward, turns left, lowers the door, raises the door, and goes back to the start position.
24. Create a private method to handle lowering & raising the door. Then call these from your autonomous program & opcontrol.
25. Create a method that drives the robot in a direction, but uses the inverse of the pramater. Then create an autonomous program that drives in a circle using your new method. Have fun!

**All done!**