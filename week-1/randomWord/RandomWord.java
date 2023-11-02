/***********************************************************************************************************
 * Compilation:  javac-algs4 RandomWord.java
 * Execution:    java-algs4 RandomWord
 *
 * Reads in all the strings entered and prints randomly, only one of them
 *
 * To run this program in system's terminal (ubuntu 20.04)
 * =======================================================
 * Run java-algs4 RandomWord
 * Type in some words, e.g: Apple, Orange, Banana, Grape, Apricot
 * Hit Enter then Ctrl + d to terminate while loop
 *      or
 * Hit Ctrl + d twice to also terminate the while loop
 *      https://introcs.cs.princeton.edu/java/stdlib/javadoc/StdIn.html#:~:text=Using%20standard%20input
 * Random output: e.g, Orange
 *
 * To run this program within IntelliJ Idea Community IDE (ubuntu 20.04):
 * ======================================================================
 * Create a new directory within your program's root and name it "lib" then include file algs4.jar within it
 * Build -> Recompile 'RandomWord.java'
 * or
 * LIFT -> Recompile 'RandomWord.java' or just Ctrl + e
 * then
 * Run -> Run RandomWord
 * or
 * LIFT -> Run RandomWord with Arguments, or just Ctrl + b
 *         it will open a dialog box, don't type anything, just hit OK button.
 *         Program runs while IDE opens its own terminal.
 *         Within the IDE's terminal type in some words, e.g:
 *              Apple, Orange, Banana, Grape, Apricot
 *         Hit Enter key
 *         Hit Ctrl + d
 *  Random output: e.g, Grape
 **********************************************************************************************************/

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;


public class RandomWord {

    public static void main(String[] args) {

        String surviving = "";

        int index = 0;

        while (!StdIn.isEmpty()) {

            String champion = StdIn.readString();

            index++;

            boolean trueOrFalse = StdRandom.bernoulli(1.0 / index);

            if (trueOrFalse) {

                surviving = champion;

            }

        }

        // StdOut.println(); // print empty new line to avoid output being next to the input

        StdOut.println(surviving); // print the random word

    }

}
