package sortingAlgorithms;

public class MergeSort implements Sorter {
  final static int SIZE = 3;
  private static int[] aux = null;
  
//  public void sort(int[] arr, int from, int to) {
//    if (aux == null) {
//      aux = new int[arr.length];
//    }
//    if (from >= to) return;
//    int mid = (to + from) / 2;
//    sort(arr, from, mid);
//    sort(arr, mid + 1, to);
//    merge(arr, from, mid, to);
//  }
//  
//  private void merge(int[] arr, int from, int mid, int to) {
//    for (int k = from; k <= to; k++) {
//      aux[k] = arr[k];
//    }
//    int i = from;
//    int j = mid + 1;
//    for (int k = from; k <= to; k++) {
//      if (i > mid) arr[k] = aux[j++];
//      else if (j > to) arr[k] = aux[i++];
//      else if (aux[i] < aux[j]) arr[k] = aux[i++];
//      else arr[k] = aux[j++];
//    }
//  }
  
  public void sort(int[] arr, int low, int high) {
    if (aux == null) {
      aux = new int[arr.length];
    }
    if (low >= high) {
      return; // Base case is size 1/0
    }
    int mid = (low + high) / 2;
    sort(arr, low, mid);
    sort(arr, mid + 1, high);
    merge(arr, low, mid, high);
  }
  
  public void merge(int[] arr, int low, int mid, int high) {
    int i = low;
    int j = mid + 1;
    int k = low;
    for (; k <= high; k++) {
      aux[k] = arr[k];
    }
    k = low;
    while (i <= mid && j <= high) {
      if (aux[i] < aux[j]) {
        arr[k++] = aux[i++];
      } else {
        arr[k++] = aux[j++];
      }
    }
    while (i <= mid) {
      arr[k++] = aux[i++];
    }
    while (j <= high) {
      arr[k++] = aux[j++];
    }
  }
}
