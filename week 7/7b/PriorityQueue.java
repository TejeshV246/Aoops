// PriorityQueue.java
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PriorityQueue<T> {
    private List<T> heap;
    private Comparator<? super T> comparator;

    public PriorityQueue(Comparator<? super T> comparator) {
        this.heap = new ArrayList<>();
        this.comparator = comparator;
    }

    public void add(T item) {
        heap.add(item);
        siftUp(heap.size() - 1);
    }

    public T remove() {
        if (heap.isEmpty()) {
            throw new RuntimeException("Priority queue is empty");
        }
        T result = heap.get(0);
        T lastItem = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, lastItem);
            siftDown(0);
        }
        return result;
    }

    public T peek() {
        if (heap.isEmpty()) {
            throw new RuntimeException("Priority queue is empty");
        }
        return heap.get(0);
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    private void siftUp(int index) {
        T item = heap.get(index);
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            T parent = heap.get(parentIndex);
            if (comparator.compare(item, parent) <= 0) break;
            heap.set(index, parent);
            index = parentIndex;
        }
        heap.set(index, item);
    }

    private void siftDown(int index) {
        int size = heap.size();
        T item = heap.get(index);
        int half = size / 2;
        while (index < half) {
            int childIndex = 2 * index + 1;
            T child = heap.get(childIndex);
            int rightIndex = childIndex + 1;
            if (rightIndex < size && comparator.compare(heap.get(childIndex), heap.get(rightIndex)) < 0) {
                childIndex = rightIndex;
                child = heap.get(childIndex);
            }
            if (comparator.compare(item, child) >= 0) break;
            heap.set(index, child);
            index = childIndex;
        }
        heap.set(index, item);
    }
}
