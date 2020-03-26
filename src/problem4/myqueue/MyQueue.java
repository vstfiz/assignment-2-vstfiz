package problem4.myqueue;

import problem1.node.TreeNode;

import static problem1.mybst.MyBinarySearchTree.preOrder;
import static problem1.mybst.MyBinarySearchTree.preOrderString;

public class MyQueue {

    private Node rear;
    private Node front;
    private int size;

    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }
    //Custom Enqueue method that takes root of the tree as parameter.
    public void enqueue(TreeNode root) {
        preOrder(root);
        String[] data = preOrderString.toString().split(" ");
        for(int i =0;i<data.length;i++){
            Node node = new Node(Integer.parseInt(data[i]));
            if (front == null) {
                rear = node;
                front = node;
                size++;
            } else {
                rear.setNext(node);
                rear = node;
                size++;
            }
        }
    }

//    void preOrder(NodeBST root){
//        if(root != null)
//        {
//            this.preOrderString.append(root.key+" ");
//            preOrder(root.getLeft());
//            preOrder(root.getRight());
//        }
//    }

    public void printQueue(){
        Node temp = this.front.getNext();
        for(int i =0;i<this.size-1;i++){
            if(i!=this.size-2){
                System.out.print(temp.getData()+"--->");
                temp = temp.getNext();
            }
            else{
                System.out.println(temp.getData());
            }
        }
    }
}
