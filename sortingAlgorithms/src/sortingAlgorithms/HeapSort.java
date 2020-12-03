package sortingAlgorithms;

public class HeapSort implements Sorter {
  public void sort(int[] arr, int from, int to) {
    int n = arr.length;
    heapSort(arr, n);
  }
  
  private void heapSort(int[] arr, int n) {
    buildHeap(arr, n);
    
    // heap sort
    for (int i = n - 1; i >= 0; i--) {
      swap(0, i, arr);
      heapify(0, i, arr);
    }
  }
  
  private void buildHeap(int[] arr, int n) {
    for (int i = (n - 1) / 2; i >= 0; i--) {
      heapify(i, n, arr);
    }
  }
  
  private void heapify(int root, int n, int[] arr) {
    int left = (2 * root) + 1;
    int right = (2 * root) + 2;
    int max = root;
    if (left < n && arr[left] > arr[max]) {
      max = left;
    }
    if (right < n && arr[right] > arr[max]) {
      max = right;
    }
    
    if (max != root) {
      swap(root, max, arr);
      heapify(max, n, arr);
    }
  }

  private void swap(int a, int b, int[] arr) {
    int tmp = arr[a];
    arr[a] = arr[b];
    arr[b] = tmp;
  }
}
