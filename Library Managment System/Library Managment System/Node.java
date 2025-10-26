

public class Node {
    int key;
    RegisterUser data;
    Node left;
    Node right;

    public Node(int key, RegisterUser data) {
        this.key = key;
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
