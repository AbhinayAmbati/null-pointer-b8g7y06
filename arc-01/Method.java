/* JAVA Methods are block of code that perform a specific task
 * A method helps to reuse code also improves efficiency and organization.
 * All methods in java must belong to a class
 * Methods are similar to functions and expose the behaviour of objects.
 */

// Creating a class to implement working of method
public class Method{

    // Method to print a message
    // Here printMessage is a simple method, it does not have any parameters and no return values.
    public void printMessage()
    {
        System.out.println("Hello, World!"); 
        // Prints "Hello, World!" in the console when the method is called.
    }

    /*
        Syntax to write a method 
        <access_modifier> <return_type>  <method_name> <list_of_parameters> {
           // body
        }
    */

    public static void main(String[] args) {

        // Creating the instance of method class
        Method m = new Method();

        // calling the method
        m.printMessage();
    }
}

/*
    access_modifier : 
                    public
                    private
                    protecte
                    default
    return_type :
                the type of value returned, if no value returned we use void
    method_name :
                method names follows java naming conventions. They follow camelCase naming convention.
    Parameters  :
                A list of input values (ooptional) . We use empty paranthesis if no parameters required.
    Exception List :
                    The exceptions the methods might throw (Optional)
    Method Body : 
                It contains the logic to be executed. (optional in the case of abstract methods)
*/