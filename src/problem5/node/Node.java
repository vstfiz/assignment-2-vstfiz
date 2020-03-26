package problem5.node;

import problem5.student.Student;

// to define node properties
public class Node {
    private Student student;
    private problem3.node.Node next;

    public Node(Student student) {
        this.student = student;
        next = null;
    }

    public Student getData() {
        return student;
    }

    public void setData(Student student) {
        this.student = student;
    }

    public problem3.node.Node getNext() {
        return next;
    }

    public void setNext(problem3.node.Node next) {
        this.next = next;
    }
}
