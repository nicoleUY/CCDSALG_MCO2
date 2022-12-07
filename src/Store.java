
public class Store {
    static Substring sns=new Substring();
    static BinarySearchTree bst= new BinarySearchTree();

    public static void main(String[] args) {
        String[] test=sns.kmerArrayCreation("taccaccaccatag",6);
        bst.create(test);
        bst.displayInOrder();
        System.out.println();
        bst.displayCounts();
    }
}
