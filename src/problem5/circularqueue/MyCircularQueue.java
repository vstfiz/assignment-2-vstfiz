/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem3.node.Node;

//to implement circular queue
public class MyCircularQueue {
    private Node rear;
    private Node front;
    private int size;

    public MyCircularQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(Node addData) {

    }

    public int getSize() {
        return size;
    }

    public void printQueue() {
        Node temp = this.front;
        for (int i = 0; i < this.size; i++) {
            if (i != this.size - 1) {
                System.out.print(temp.getData().toString() + "--->");
                temp = temp.getNext();
            } else {
                System.out.println(temp.getData().toString());
            }
        }
    }
}
