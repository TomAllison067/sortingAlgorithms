package sortingAlgorithms;

public class QuickSort implements Sorter {
  
  public int partition(int[] arr, int low, int high) {
    int i = low;
    for (int j = low; j <= high; j++) {
      if (arr[j] < arr[high]) {
        swap(i++, j, arr);
      }
    }
    swap(i, high, arr);
    return i;
  }

  public void sort(int[] arr, int low, int high) {
    if (low < high) {
      int pivot = partition(arr, low, high);
      sort(arr, low, pivot - 1);
      sort(arr, pivot + 1, high);
    }
  }
  
  
  private void swap(int a, int b, int[] arr) {
    int tmp = arr[a];
    arr[a] = arr[b];
    arr[b] = tmp;
  }


// 65 70 20 48 33
// 20 70 65 48 33
// 20 33 65 48 70
// 20 33 48 65 70
}