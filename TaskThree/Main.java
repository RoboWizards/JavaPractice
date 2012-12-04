package TaskThree;

/**
 *
 * @author Joe Kent
 */
public class Main {
    
    public static void main(String[] args){
        //To call a method, type the name followed by (); This will call the method (Which executes the code inside the method)
        printString();
    }
    
    //To create a method, give it an acessor type (public, private, static) and a return type (void if it doesn't return, otherwise add an object (String, int, double, etc))
    //Next give it a name followed my () to indicate it's a method. Inside the () you can add paramaters. Then add curly braces to start & close the method
    public static void printString(){
        System.out.println("Hello World!");
    }
    
}
