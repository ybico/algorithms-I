/******************************************************************************
 *  Compilation:  javac-algs-4 DynamicConnectivity.java
 *  Execution:    java-algs-4 DynamicConnectivity
 *
 * Program reads the value of N followed by a
 * sequence of pairs of integers (each in the range 0 to N-1 ), calling
 * find() for each pair. If the two sites in the pair are already con-
 * nected, it moves on to the next pair; if they are not, it calls union()
 * and prints the pair.
 *
 * % java DynamicConnectivity < tinyUF.txt
 ******************************************************************************/

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.UF;

public class DynamicConnectivity {
    public static void main(String[] args) {

        int N = StdIn.readInt();

        UF uf = new UF(N);
        while (!StdIn.isEmpty()) {

            int p = StdIn.readInt();

            int q = StdIn.readInt();

            if (!uf.connected(p, q)) {

                uf.union(p, q);

                StdOut.println(p + " " + q);

            }

        }

    }

}
