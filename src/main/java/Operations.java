import java.util.LinkedList;
import java.util.List;

public class Operations {

    private List<Integer> getListOfNodesSubtree(Node node) {
        List<Integer> listOfNodes = new LinkedList<>();
        getListOfNodesSubtreeRecursively(listOfNodes, node);
        return listOfNodes;
    }

    private void getListOfNodesSubtreeRecursively(List<Integer> list, Node node) {
        if (node != null) {
            list.add(node.getValue());
            getListOfNodesSubtreeRecursively(list, node.getRightChild());
            getListOfNodesSubtreeRecursively(list, node.getLeftChild());
        }
    }

    public double median(Node node) {
        List<Integer> listOfNodes = getListOfNodesSubtree(node);
        int[] sortedNodes = listOfNodes.stream().sorted().mapToInt(element -> element).toArray();

        double median;
        if (sortedNodes.length % 2 == 0)
            median = ((double) sortedNodes[sortedNodes.length/2] + (double) sortedNodes[sortedNodes.length/2 - 1]) / 2.0;
        else
            median = sortedNodes[sortedNodes.length/2];
        return median;
    }

    public double avg(Node node) {
        List<Integer> listOfNodes = getListOfNodesSubtree(node);
        int sum = getSum(listOfNodes);
        int count = listOfNodes.size();
        return (double) sum / (double) count;
    }

    public int sum(Node node) {
        List<Integer> listOfNodes = getListOfNodesSubtree(node);
        return getSum(listOfNodes);
    }

    private int getSum(List<Integer> listOfNodes) {
        return listOfNodes.stream().reduce(0, Integer::sum);
    }
}