
import java.util.*;
public class Signup {
	private Node root;
    public Signup() {
        this.root = null;
    }// end of default cons
    public Signup(Node root) {
		this.root = root;
	}// end of over loaded cons
	public void insert(int key, RegisterUser data) {
        root = insert(root, key, data);
    }// end of insert method
    private Node insert(Node root, int key, RegisterUser data) {
        if (root == null) {
            return new Node(key, data);
        }// end of if block
        if (key < root.key) {
            root.left = insert(root.left, key, data);
        } else if (key > root.key) {
            root.right = insert(root.right, key, data);
        } else {
            // Key already exists in the tree, update its data
            root.data = data;
        }

        return root;
    }// end of insert method
    //**********************************************************
    // search method
    //**********************************************************
    public Object search(int key) {
        Node node = search(root, key);
        return (node != null) ? node.data : null;
    }// end of search method
    private Node search(Node root, int key) {
        if (root == null || root.key == key) {
            return root;
        }

        if (key < root.key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }
    public void delete(int key) {
        root = delete(root, key);
    }// end of remove
    private Node delete(Node root, int key) {
        if (root == null) {
            
            return null;
        }// end of if block

        if (key < root.key) {
            // The key to be deleted is in the left subtree
            root.left = delete(root.left, key);
        } else if (key > root.key) {
            // The key to be deleted is in the right subtree
            root.right = delete(root.right, key);
        } else {
            // Found the node to be deleted
            if (root.left == null && root.right == null) {
                // Case 1: Node has no children
                root = null;
            } else if (root.left == null) {
                // Case 2a: Node has one child on the right
                root = root.right;
            } else if (root.right == null) {
                // Case 2b: Node has one child on the left
                root = root.left;
            } else {
                // Case 3: Node has two children
                Node temp = findMin(root.right);
                root.key = temp.key;
                root.data = temp.data;
                root.right = delete(root.right, temp.key);
            }
        }

        return root;
    }

    private Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    public void update(int key, RegisterUser user1) {
        Node nodeToUpdate = search(root, key);

        if (nodeToUpdate != null) {
            nodeToUpdate.data = user1;
        }
    }
    public void printInOrder() {
        printInOrderHelper(root);
    }

    private void printInOrderHelper(Node root) {
        if (root == null) {
            return;
        }

        printInOrderHelper(root.left);
        System.out.println(root.data);
        printInOrderHelper(root.right);
    }
    public boolean isUserValid(String username, String password) {
        return isUserValid(root, username, password);
    }

    private boolean isUserValid(Node node, String username, String password) {
        if (node == null) {
            return false;
        } else if (node.data.getUsername().equals(username) && node.data.getPassword().equals(password)) {
            return true;
        } else if (username.compareTo(node.data.getUsername()) < 0) {
            return isUserValid(node.left, username, password);
        } else {
            return isUserValid(node.right, username, password);
        }
    }
	   
}// end of class
