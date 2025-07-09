/*
    Method calling allows you to reuse code and organize our program effectively.
    The method needs to be called for use its fuctionality.
    There can be three situations when a method is called : 
    A method returns to the code that invoked it in : 
    * It completes all the statements in the methods
    * It reaches the return statement
    * Throws an exception
*/

// Method calling using object of a class

import java.util.*; 
// import is a statement that tells the java compiler to import all the classes and interfaces from the java.util package
// java.util is a package that contains utility classes such as data structures and tools
// ( * ) the wildcard symbol that means import everything from that package

class Add{ // Add is a sub class

    public int addTwoNumbers(int a, int b) 
    // addTwoNumbers is a mehtod which gets two parameters as the input a,b
    // return type of the method is int as it returns the datatype int 
    
    {
        return a+b; // return is a keyword which returns the value that it has
        // in this method it returns the value of a + b , which is of type int
        // So the return of the method is ( int ) 
    }

}

public class MethodCalling { // Method calling is a Main Class. 

    public static void main(String[] args){

        Scanner s = new Scanner(System.in); 
        // This is a Scanner class used to take the inputs from the user
        // Here we created a object for the scanner class class to use its methods to take the inputs

        int x = s.nextInt(); // We use the object of the scanner class to take input of the variable x of type int 
        int y = s.nextInt(); // We use the object of the scanner class to take input of the variable y of type int

        Add a  = new Add(); // creating a object for the class Add
        
        // Using the object of the class Add we can call its methods present in that class

        int result = a.addTwoNumbers(x, y); // calling the method using the object of the class

        /* 
            addTwoNumbers() in this method we pass two parameters called x and y
            we call the method with help of the Add class object a.addTwoNumber()
            And the method is return type , which returns the value after completion of the method
            The return value is assigned to the variable called result of type ( int )
            Cuase the method returns the value of type ( int ) 
        */

        System.out.println(result); 
        // Here we are printing the value of the variable result that has the return value of the method

        s.close(); //  Closing the scanner class.


    }
    
}
