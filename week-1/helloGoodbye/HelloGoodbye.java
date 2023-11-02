/******************************************************************************
 *  Compilation:  javac HelloGoodbye.java
 *  Execution:    java HelloGoodbye Kevin Bob
 *
 *  Reads in two names entered as a command-line arguments and prints
 *  "Hello Kevin and Bob."
 *  "Goodbye Bob and Kevin."
 *
 *  % java HelloGoodbye Kevin Bob
 *  Hello Kevin and Bob.
 *  Goodbye Bob and Kevin.
 *
 ******************************************************************************/

public class HelloGoodbye {
    public static void main(String [] args) {
        System.out.println("Hello " + args[0] + " and " + args[1] + ".");
        System.out.println("Goodbye " + args[1] + " and " + args[0] + ".");
    }
}
