package Task2;

/**
 *
 * @author Joe Kent
 */
public class Main {
    
    public static void main(String[] args){
        //Create an int variable
        // <type> <variable name> (initilize) 
        int number1 = 5;
        int number2 = 6;

        //Create double variable. These can use decimals (int cannot)
        double number3 = 10;
        double number4 = 25;

        //Create a float variable
        float number5 = 0.2f;
        float number6 = 0.4f;        
        
        //Create a new variable that is equal to the product of 2 other variables of the same type
        //Ex: make a new variable for the sum of number1 & number2
        //+ - / * are all supported in Java for math operations
        int intTotal = number1 * number2;
        double doubleTotal = number3 * number4;
        float floatTotal = number5 * number6;
        
        //Print out each result
        //Use + when seperating 2 different things (ex: string + number)
        //Remember! Anything inside "" is a string (plain text)
        System.out.println("Int Total = " + intTotal);
        System.out.println("Double Total = " + doubleTotal);
        System.out.println("Float Total = " + floatTotal);
        
    }
    
}
