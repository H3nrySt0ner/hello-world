package edu.pcc.cis.helloworld;
import java.util.Date;

/**
 * Class to print out "Hello World!"
 *
 * HS: Created HelloWorld class
 * HS: imported java.util.Date
 * HS: added line to print out date in main method
 *
 * @author henry Stoner
 */

public class HelloWorld {

    /**
     * method main prints out "Hello World!"
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(new Date());
    }
}
