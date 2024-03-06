import java.util.ArrayList;
import java.util.LinkedList;

public class ListPerformanceComparison {
    public static void main(String[] args) {

        int[] inputSizes = {1000, 10000, 100000};

        for (int size : inputSizes) {
            System.out.println("Input Size: " + size);
            ArrayList<Integer> arrayList = new ArrayList<>();
            LinkedList<Integer> linkedList = new LinkedList<>();


            long startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                arrayList.add(i);
            }
            long arrayListInsertionTime = System.nanoTime() - startTime;

            startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                linkedList.add(i);
            }
            long linkedListInsertionTime = System.nanoTime() - startTime;

            System.out.println("Insertion Time:");
            System.out.println("ArrayList: " + arrayListInsertionTime + " ns");
            System.out.println("LinkedList: " + linkedListInsertionTime + " ns");


            startTime = System.nanoTime();
            for (int i = size - 1; i >= 0; i--) {
                arrayList.remove(i);
            }
            long arrayListDeletionTime = System.nanoTime() - startTime;

            startTime = System.nanoTime();
            for (int i = size - 1; i >= 0; i--) {
                linkedList.removeLast();
            }
            long linkedListDeletionTime = System.nanoTime() - startTime;

            System.out.println("Deletion Time:");
            System.out.println("ArrayList: " + arrayListDeletionTime + " ns");
            System.out.println("LinkedList: " + linkedListDeletionTime + " ns");


            startTime = System.nanoTime();
            for (Integer _ : arrayList) {
                
            }
            long arrayListTraversalTime = System.nanoTime() - startTime;

            startTime = System.nanoTime();
            for (Integer _ : linkedList) {
            
            }
            long linkedListTraversalTime = System.nanoTime() - startTime;

            System.out.println("Traversal Time:");
            System.out.println("ArrayList: " + arrayListTraversalTime + " ns");
            System.out.println("LinkedList: " + linkedListTraversalTime + " ns");
            System.out.println("-----------------------");
        }
    }
}
