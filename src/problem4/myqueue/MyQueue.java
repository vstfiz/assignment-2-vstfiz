package problem4.myqueue;
public class MyQueue {
    public StringBuilder preOrderString;
    private Node rear;
    private Node front;
    private int size;

    public MyQueue() {
        preOrderString = new StringBuilder();
        front = null;
        rear = null;
        size = 0;
    }
    //Custom Enqueue method that takes root of the tree as parameter.
    public void enqueue(NodeBST root) {
        preOrder(root);
        String[] data = this.preOrderString.toString().split(" ");
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

    void preOrder(NodeBST root){
        if(root != null)
        {
            this.preOrderString.append(root.key+" ");
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

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
