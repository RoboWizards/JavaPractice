package Task8;

/**
 *
 * @author Joe Kent
 */
public class Main {
    
    /** I suggest reading the string helper class first **/
    
    public static void main(String[] args){
        //Because .getText() returns a string, you can provide the method as the output to println. Why? Because You can view StringHelper.getText() as
        //String someStringVariable = "Hello World";  SInce the method returns a string
        System.out.println(StringHelper.getText());
        
        //Or if you wish to store the variable, just set the string equal to it
        String text = StringHelper.getText();
    }
    
}
