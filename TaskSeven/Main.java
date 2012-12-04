package TaskSeven;

/**
 *
 * @author Joe Kent
 */
public class Main {
    
    ExampleObject exampleObject;
    
    public Main(){
        exampleObject = new ExampleObject();
        //To call a method in an object, add a dot seperator after the variable name & find the method name. NetBeans should autocomplete this for you.
        exampleObject.exampleMethod();
    }
    
    public static void main(){
        new Main();
    }
    
}
