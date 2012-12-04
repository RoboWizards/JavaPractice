package Task8;

/**
 *
 * @author Joe Kent
 */
public class StringHelper {
    
    //Public allows it to be acesible outside the class
    //Static makes it so you can call this method, without having an instance of an object (You can do StringHelper.getText()  
    //instead of StringHelper stringHelper = new StringHelper();  stringHelper.getText();  )
    //String replaces void to show it returns a string (text)
    //The return method is the string the method gives to whatever calls it (So if Main calls this method, it will respond to it with the string Hello World
    public static String getText(){
        return "Hello World!";
    }
    
}
