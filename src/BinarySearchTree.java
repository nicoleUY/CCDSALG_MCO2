public class BinarySearchTree {
    private class Node {
        String value;
        int count;
        Node left, right;

        public Node(String value) {
            this.value = value;
            this.count=1;
        }
    }

    private Node root;

    public void create(String[] values) {
        for (String value : values) {
            insert(value);
        }
    }
    public void create() {
        root = null;
    }


    public void destroy() {
        root = null;
    }

    public void insert(String value) {

        root = insert(root, value);
    }

    private Node insert(Node node, String value) {
        if (node == null) {
            return new Node(value);
        }

        if (value.compareTo(node.value) < 0) {
            node.left = insert(node.left, value);
        } else if (value.compareTo(node.value) > 0)  {
            node.right = insert(node.right, value);
        }else{
            node.count++;
        }

        return node;
    }

    public boolean contains(String value) {
        return contains(root, value);
    }

    private boolean contains(Node node, String value) {
        if (node == null) {
            return false;
        }

        if (value.equals(node.value)) {
            return true;
        } else if (value.compareTo(node.value) < 0) {
            return contains(node.left, value);
        } else {
            return contains(node.right, value);
        }
    }
    public void displayInOrder() {
        displayInOrder(root);
    }

    private void displayInOrder(Node node) {
        if (node == null) {
            return;
        }

        displayInOrder(node.left);
        System.out.print(node.value + " ");
        displayInOrder(node.right);
    }
    public void displayCounts() {
        displayCounts(root);
    }

    private void displayCounts(Node node) {
        if (node == null) {
            return;
        }

        displayCounts(node.left);
        System.out.println(node.value + ": " + node.count);
        displayCounts(node.right);
    }

}




