package mission1.problem5;

import mission1.problem5.heap.Heap;
import mission1.problem5.heap.MaxHeap;
import mission1.problem5.heap.MinHeap;
import org.junit.jupiter.api.Test;

class HeapTest {

    @Test
    void 부모_테스트() {
        int i= 1;
        int answer= (i-1)/2;
        System.out.println(answer);
    }

    @Test
    void leftChild_테스트() {
        int i= 1;
        int answer= 2*i+1;
        System.out.println(answer);
    }

    @Test
    void swap_테스트() {
        Heap heap = new MaxHeap();
        heap.add(1);
        heap.add(2);
        System.out.println(heap.print());;
        heap.swap(1,0);
        System.out.println(heap.print());
    }

    @Test
    void Add_테스트() {
        Heap heap = new MaxHeap();
        heap.add(10);
        heap.add(5);
        heap.add(1);
        heap.add(3);
        heap.add(7);
        heap.add(15);
        System.out.println(heap.print());
    }

    @Test
    void Add_테스트2() {
        Heap heap = new MinHeap();
        heap.add(10);
        heap.add(5);
        heap.add(1);
        heap.add(3);
        heap.add(7);
        heap.add(15);
        System.out.println(heap.print());
    }
}