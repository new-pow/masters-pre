package mission1.problem5;

public class MinHeap extends Heap{
    @Override
    protected void heapifyUp(int index) {
        int parent = getParent(index);
        int parentIndex = getParentIndex(index);

        if (index==0) {
            return;
        }
        if (heap.get(index) < parent) {
            swap(index, parentIndex);
            heapifyUp(parentIndex);
        }
    }

    @Override
    protected void heapifyDown(int index) {
        int leftIndex = getLeftChildIndex(index);
        int rightIndex = getRightChildIndex(index);

        int smallerstIndex = index;

        if (leftIndex < size() && heap.get(leftIndex) < heap.get(index)) {
            smallerstIndex = leftIndex;
        }
        if (rightIndex < size() && heap.get(rightIndex) < heap.get(smallerstIndex)) {
            smallerstIndex = rightIndex;
        }
        if (smallerstIndex != index) {
            swap(index, smallerstIndex);
            heapifyDown(smallerstIndex);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Min Heap : ");
        for (int number : heap) {
            sb.append(String.format("[%d] ",number));
        }
        return sb.toString().trim();
    }
}
