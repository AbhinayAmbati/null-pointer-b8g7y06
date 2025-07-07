/*  JAVA is developed by SUN MICRO SYSTEMS IN 1995
    It is platform independent, which means we can write code once and run in any system,
    using JVM (JAVA VIRTUAL MACHINE).
    Java follows object-oriented programming, this makes code clean and reusable.
*/

public class HelloWorld /*defines a class name hello world , in java every program must be inside a class*/ 
{
    
    public static void main(String[] args) /*it is the entry point of any java application, 
    it tells the JVM where to start executing of the program.  */
    {
        System.out.println("Hello, World!"); /* prints the message to the console */
    } // in java curly braces are used write a block of code.

    // In java indentation is not mandatory but it is important for readability.
    // One more important point is java relies on braces, not spaces for grouping the statements. 

    
}

// this is a single line comment.

 /*
    * This is a multi-line comment.
*/

/* 
 *  Naming Conventions
 * In java class names starts with capital letters for example HelloWorld.
 * Method and variable names start with lowercase letter and use camelCase like printMessage.
 * Constants are always written in capital letters with underscores like MAX_SIZE.
*/


/* How does a java file execute ? 
 * We wirte a program in HelloWorld.java, the JAVA compiler compile it into bytecode HelloWorld.class .
 * The JVM (Java Virtual Machine) reads the .class file and interprets (converts the program) into byte code.
 * JVM converts bytecode to machine readable code i.e binary (11100-111-11111010110) and then execute the program. 
*/