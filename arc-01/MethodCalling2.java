// Method calling Method two

class Test{ // This is a sub class
    
    public static int i = 0; // variable i has a static keyword , shared across all instances

    Test() // This is a constructor of Test class 
    {
        i++; // when ever a instance of class Test is created variable i increments by 1 time 
    }

    public static int get() // This is a static get method used to return the value of the variable i
    {
        return i; // return keyword returns the value of variable i
    }

    public int m1() // M1 method in test class
    {
        System.out.println("Inside the method m1"); //  Prints the message when the method is called
        this.m2(); // Calls other method in the same class
        return 1; // returns the value 1
    }

    public void m2() // M2 method in test class
    {
        System.out.println("Inside method m2"); // Prints the message when the method is called
    }
}



public class MethodCalling2{ // Main class 
    public static void main(String[] args) // Starting point of the java file
    {

        Test t = new Test(); // Creating the instance for the test class

        int i = t.m1(); // Stores the value that is returned by the m1 method in variable i

        System.out.println("Control returned after m1 " + i); // Printing the variable i value

        int o = Test.get(); 
        // Calling get method directly by the class name and storing the return value of get method in variable o
        // get() method returns the value of i, i value is no.of instances created

        System.out.println("No of instances created " + o); // Printing the value of variable o
    }
}