package mission1.problem5;

public class Problem5 {
    public static void main(String[] args) throws Exception {
        HeapSort heap = new HeapSort();
        heap.insertHeap(80);
        heap.insertHeap(50);
        heap.insertHeap(70);
        heap.insertHeap(10);
        heap.insertHeap(60);
        heap.insertHeap(20);

        heap.printHeap();

        int n, data;
        n = heap.getHeapSize();
        for(int i=1; i<=n; i++){
            data = heap.deleteHeap();
            System.out.printf("\n 출력 : [%d]", data);
        }
    }
}
