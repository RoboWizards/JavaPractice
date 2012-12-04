package Task4;

/**
 *
 * @author Joe Kent
 */
public class Main {
    
    public static void main(String[] args){
        //Now that we added a String paramater, you need to supply one when calling it. This can be done by puting the name of a String variable
        //or adding your own text in ""
        printString("Hello World!");
    }
    
    //To add a paramter, add the type & name to use. This variable is only acessible from inside the method.
    public static void printString(String text){
        System.out.println(text);
    }
    
}
