import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@DisplayName("NodeTest - check values of nodes and its children")
public class NodeTest {
    static Node root, node1, node2, node3, node4, node5, node6, node7, node8, node9;

    @BeforeAll
    public static void setup() {
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
    @DisplayName("Values of nodes")
    public void checkValuesOfNodes() {
        assertEquals(5, root.getValue());
        assertEquals(3, node1.getValue());
        assertEquals(7, node2.getValue());
        assertEquals(2, node3.getValue());
        assertEquals(5, node4.getValue());
        assertEquals(1, node5.getValue());
        assertEquals(0, node6.getValue());
        assertEquals(2, node7.getValue());
        assertEquals(8, node8.getValue());
        assertEquals(5, node9.getValue());
    }

    @Test
    @DisplayName("Values of not null children")
    public void checkValuesOfNotNullChildren() {
        assertEquals(3, root.getLeftChild().getValue());
        assertEquals(7, root.getRightChild().getValue());

        assertEquals(2, node1.getLeftChild().getValue());
        assertEquals(5, node1.getRightChild().getValue());

        assertEquals(1, node2.getLeftChild().getValue());
        assertEquals(0, node2.getRightChild().getValue());

        assertEquals(2, node6.getLeftChild().getValue());
        assertEquals(8, node6.getRightChild().getValue());

        assertEquals(5, node8.getRightChild().getValue());

    }

    @Test
    @DisplayName("Values of null-children")
    public void checkValuesOfNullChildren() {
        assertNull(node3.getLeftChild());
        assertNull(node3.getRightChild());

        assertNull(node4.getLeftChild());
        assertNull(node4.getRightChild());

        assertNull(node5.getLeftChild());
        assertNull(node5.getRightChild());

        assertNull(node7.getLeftChild());
        assertNull(node7.getRightChild());

        assertNull(node8.getLeftChild());

        assertNull(node9.getLeftChild());
        assertNull(node9.getRightChild());
    }
}