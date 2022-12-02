package mission1.problem5.heap;

public class MinHeap extends Heap {
    @Override
    protected void heapifyUp(int index) {
        int parentIndex = getParentIndex(index);

        if (index == 0) {
            return;
        }
        if (heap.get(index) < heap.get(getParentIndex(index))) {
            swap(index, parentIndex);
            heapifyUp(parentIndex);
        }
    }

    @Override
    protected void heapifyDown(int index) {
        int leftIndex = getLeftChildIndex(index);
        int rightIndex = getRightChildIndex(index);

        int smallerstIndex = index;

        if (isVaildIndex(leftIndex, index)) {
            smallerstIndex = leftIndex;
        }
        if (isVaildIndex(rightIndex, smallerstIndex)) {
            smallerstIndex = rightIndex;
        }
        if (smallerstIndex != index) {
            swap(index, smallerstIndex);
            heapifyDown(smallerstIndex);
        }
    }

    private boolean isVaildIndex(int rightIndex, int smallerstIndex) {
        return rightIndex < size() && heap.get(rightIndex) < heap.get(smallerstIndex);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Min Heap : ");
        for (int number : heap) {
            sb.append(String.format("[%d] ", number));
        }
        return sb.toString().trim();
    }
}
