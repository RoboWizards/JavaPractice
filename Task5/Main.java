package Task5;

/**
 *
 * @author Joe Kent
 */
public class Main {
    
    //Declare a variable but do not initilize it. This means its current no.
    boolean value;
    
    //Constructor is done by making an acessor type (Public, private, etc) followed by name & any required paramaters
    public Main(){
        //When the constructor is called it will set the boolean value to true;
        value = true;
    }
    
    public static void main(String args[]){
        //To create a new instant of something, you can do new ClassNameGoesHere then () which would include any needed paramaters followed by ;
        //If you wish to save this instance you can do
        // Main main = new Main();  
        //It's just like making a normal variable but its using the class name. This is called an object.
        new Main();
    }
    
}
