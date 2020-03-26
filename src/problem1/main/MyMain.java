/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        Scanner scanner = new Scanner(System.in);
        // taking only 7 inputs for simple demonstration with value 1,2,3,4,5,6,7
        int i = 7;
        while(i>0){
            tree.add(scanner.nextInt());
            i--;
        }
        /*tree looks like
                    4
                  /  \
                2      6
               / \    / \
              1   3  5   7
           */

        //For Only Left Children 4,2,1,5 should be printed , for that we call printLeftChild()
        //defined in MyBinarySearchTree.java

    }
}
