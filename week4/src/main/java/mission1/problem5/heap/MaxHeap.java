package mission1.problem5.heap;

public class MaxHeap extends Heap {
    // 부모 노드가 무조건 자식 노드보다 커야한다.


    @Override
    protected void heapifyUp(int index) {
        int parentIndex = getParentIndex(index);

        if (index == 0) {
            return;
        }
        if (heap.get(index) > heap.get(index)) {
            swap(index, parentIndex);
            heapifyUp(parentIndex);
        }
    }

    @Override
    protected void heapifyDown(int index) {
        int leftIndex = getLeftChildIndex(index);
        int rightIndex = getRightChildIndex(index);

        int largestIndex = index;

        if (isVaildChildIndex(leftIndex, index)) {
            largestIndex = leftIndex;
        }
        if (isVaildChildIndex(rightIndex, largestIndex)) {
            largestIndex = rightIndex;
        }
        if (isNeedSwap(index, largestIndex)) {
            swap(index, largestIndex);
            heapifyDown(largestIndex);
        }
    }

    private boolean isVaildChildIndex(int firstIndex, int largestIndex) {
        return firstIndex < size() && heap.get(firstIndex) > heap.get(largestIndex);
    }

    private boolean isNeedSwap(int index, int largestIndex) {
        return largestIndex != index;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Max Heap : ");
        for (int number : heap) {
            sb.append(String.format("[%d] ", number));
        }
        return sb.toString().trim();
    }
}
