package mission1.problem5;

import java.util.List;
import java.util.Vector;

public abstract class Heap {
    protected List<Integer> heap;
    public Heap() {
        this.heap = new Vector<>();
    }
    protected int getParentIndex(int i) {
        if (i==0) {
            return 0;
        }
        return (i-1)/2;
    }
    protected int getLeftChildIndex (int i) {
        return 2*i +1;
    }
    protected int getParent(int i) {
        return heap.get(getParentIndex(i));
    }
    protected int getLeftChild(int i) {
        if (getLeftChildIndex(i) < size()) {
            return heap.get(getLeftChildIndex(i));
        }
        return 0;
    }

    protected int getRightChild(int i) {
        if (getRightChildIndex(i) < size()) {
            return heap.get(getRightChildIndex(i));
        }
        return 0;
    }

    protected int getRightChildIndex(int i) {
        return 2*i +2;
    }

    protected void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    protected void add(int number) {
        heap.add(number);
        int index = heap.size()-1;
        heapifyUp(index);
    }

    protected int delete() {
        int root = heap.get(0);
        heap.set(0, heap.get(size()-1));
        heap.remove(size()-1);
        heapifyDown(0);
        return root;
    }

    public int size() {
        return heap.size();
    }

    protected String print() {
        return String.format("출력 : [%d]", delete());
    }

    protected abstract void heapifyUp(int index);

    abstract protected void heapifyDown(int index);
}
