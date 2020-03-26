package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        //taking hard-coded inputs
        tree.add(51);
        tree.add(39);
        tree.add(31);
        tree.add(54);
        tree.add(92);
        tree.add(42);
        tree.add(21);
        tree.add(10);
        tree.add(26);
        tree.add(52);
        tree.add(36);
        tree.add(47);
        tree.add(82);
        tree.add(5);
        tree.add(62);
        MyQueue queue = new MyQueue();
        //Enqueing from the tree pre order succesors of each node
        queue.enqueue(tree.root);
        //Printing the Queue
        queue.printQueue();
    }
}
