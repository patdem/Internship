import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("SumTest - check values for sum")
public class SumTest {
    static Node root, node1, node2, node3, node4, node5, node6, node7, node8, node9;
    static Operations operations = new Operations();

    @BeforeAll
    static void setup() {
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
    }

    @Test
    @DisplayName("Sum for root")
    public void checkSumValueForRoot() {
        assertEquals(38.0, operations.sum(root));
    }

    @Test
    @DisplayName("Sum for odd amount of nodes")
    public void checkSumValueForOddAmountOfNodes() {
        assertEquals(10.0, operations.sum(node1));
    }

    @Test
    @DisplayName("Sum for even amount of nodes")
    public void checkSumValueForEvenAmountOfNodes() {
        assertEquals(23.0, operations.sum(node2));
    }

    @Test
    @DisplayName("Sum for leaf")
    public void checkSumValueForLeaf() {
        assertEquals(2.0, operations.sum(node3));
    }

    @Test
    @DisplayName("Sum for node with one child")
    public void checkSumValueForNodeWithOneChild() {
        assertEquals(13.0, operations.sum(node8));
    }
}