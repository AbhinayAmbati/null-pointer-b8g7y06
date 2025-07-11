
class SubClass //  This is a sub class
{

    private int n; // This is a private variable which can not be accessed other classes directly 
    private String s; // This is a private variable which can not be accessed other classes directly

    public String getS() // This is a public get method which returns the value of s when the method is called
    {
        return s; // returns the value of x
    }

    public int getN() // This is a public get method which returns the value of n when the method is called
    {
        return n; // returns the value of n
    }

    public void setN(int n) 
    // This is a set method which sets the value to the private n variable by other classes by passing parameters to the set method
    {
        this.n = n;
        // here this.n refers to the current object instance variable and n refers to the parameter passed by the other class 
    }

    public void setS(String s)
    // This is a set method which sets the value to the private s variable by other classes by passing parameters to the set method

    {
        this.s = s;
        // here this.s refers to the current object instance variable and s refers to the parameter passed by the other class 

    }

    public void printSettersValue() 
    // This method prints values of priavte variables when the method is called
    {
        System.out.println("Value of n is : " + n + "\n" + "Value of s is : " + s);
        // Printing the values of the pprivate variables
    }

} 


public class SetNumAndGetNum // Main Class
{

    public static void main(String[] args) // main method
    {
        
        SubClass s = new SubClass(); // Instance of the sub class

        s.setN(1); // Passing the parameter of value 1 to the setN method of class SubClass
        s.setS("LCJPCXK"); // Passing the parameter of value LCJPCXK to the setS method of class SubClass
        s.printSettersValue(); 
        // Calling the printSettersValue method to print the values that we passed in the parameters
        
    }
    
}
