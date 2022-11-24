package mission1.problem5;

public class HeapSort {

    Heap heap;

    public HeapSort() {
        heap = new MinHeap();
    }

    public void insertHeap(int i) {
        heap.add(i);
    }

    public void printHeap() {
        System.out.println(heap.toString());
    }

    public int getHeapSize() {
        return heap.size();
    }

    public int deleteHeap() {
        return heap.delete();
    }
}
