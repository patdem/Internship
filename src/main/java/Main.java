public class Main {
    public static void main(String[] args) {
        Node root, node1, node2, node3, node4, node5, node6, node7, node8, node9;

        root = new Node(5);

        node1 = new Node(3);
        node2 = new Node(7);

        node3 = new Node(2);
        node4 = new Node(5);
        node5 = new Node(1);
        node6 = new Node(0);

        node7 = new Node(2);
        node8 = new Node(8);

        node9 = new Node(5);

        root.setLeftChild(node1);
        root.setRightChild(node2);

        node1.setLeftChild(node3);
        node1.setRightChild(node4);

        node2.setLeftChild(node5);
        node2.setRightChild(node6);

        node6.setLeftChild(node7);
        node6.setRightChild(node8);

        node8.setRightChild(node9);

        Operations operations = new Operations();

        System.out.println("Operations for root");
        System.out.println("Sum = " + operations.sum(root));
        System.out.println("Avg = " + operations.avg(root));
        System.out.println("Median = " + operations.median(root));
    }
}