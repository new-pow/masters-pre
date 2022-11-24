package mission1.problem5.heap;

public class MaxHeap extends Heap{
    // 부모 노드가 무조건 자식 노드보다 커야한다.


    @Override
    protected void heapifyUp(int index) {
        int parent = getParent(index);
        int parentIndex = getParentIndex(index);

        if (index==0) {
            return;
        }
        if (heap.get(index) > parent) {
            swap(index, parentIndex);
            heapifyUp(parentIndex);
        }
    }

    @Override
    protected void heapifyDown(int index) {
        int leftIndex = getLeftChildIndex(index);
        int rightIndex = getRightChildIndex(index);

        int largestIndex = index;

        if (leftIndex < size() && heap.get(leftIndex) > heap.get(index)) {
            largestIndex = leftIndex;
        }
        if (rightIndex < size() && heap.get(rightIndex) > heap.get(largestIndex)) {
            largestIndex = rightIndex;
        }
        if (largestIndex != index) {
            swap(index, largestIndex);
            heapifyDown(largestIndex);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Max Heap : ");
        for (int number : heap) {
            sb.append(String.format("[%d] ",number));
        }
        return sb.toString().trim();
    }
}
