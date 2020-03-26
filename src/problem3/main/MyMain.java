package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.node.Node;
import problem5.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue myPriorityQueue = new MyPriorityQueue();
        //Adding 5 Students by hard-coding
        //The Queue enqueues them according to ascending Roll Number as given for example in Problem Statement
        myPriorityQueue.enqueue(new Node(new Student(15,"wdad")));
        myPriorityQueue.enqueue(new Node(new Student(500,"wdad")));
        myPriorityQueue.enqueue(new Node(new Student(50,"wdad")));
        myPriorityQueue.enqueue(new Node(new Student(11,"wdad")));
        myPriorityQueue.enqueue(new Node(new Student(55,"wdad")));
        myPriorityQueue.printQueue();
    }
}
