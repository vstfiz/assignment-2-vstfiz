package problem4.myqueue;

public class MyBST {
        public NodeBST root;
        public MyBST() {
            this.root = null;
        }

        public void insert(int key) {
            root = insertRec(root, key);
        }

        NodeBST insertRec(NodeBST root, int key) {
            if (root == null) {
                root = new NodeBST(key);
                return root;
            }
            if (key < root.key)
                root.left = insertRec(root.left, key);
            else if (key > root.key)
                root.right = insertRec(root.right, key);
            return root;
        }
}
