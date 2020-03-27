/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

import java.util.ArrayList;

//executable class
public class MyMain {
    public static void main(String[] args) {
        //Let us create a list of students
        ArrayList<Student> studentList = new ArrayList<Student>();
        //hard coding some student value
        studentList.add(new Student(1, "A", 1, 0));
        studentList.add(new Student(2, "B", 2, 2));
        studentList.add(new Student(3, "C", 1, 1));
        studentList.add(new Student(4, "D", 2, 2));
        studentList.add(new Student(5, "E", 0, 0));
        studentList.add(new Student(6, "F", 2, 1));
        studentList.add(new Student(7, "G", 1, 1));
        studentList.add(new Student(8, "H", 2, 1));
        studentList.add(new Student(9, "I", 0, 0));
        studentList.add(new Student(10, "J", 0, 0));
        studentList.add(new Student(11, "K", 2, 1));
        //creating a queue
        MyCircularQueue studentqueue = new MyCircularQueue();
        studentqueue.enqueue(studentList);
        //printing queue
        // A,F,H,K should be present in the queue
        studentqueue.printQueue();


    }
}
