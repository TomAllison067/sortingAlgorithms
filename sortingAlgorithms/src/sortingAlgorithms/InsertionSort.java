package sortingAlgorithms;

import helpers.ArrayFunctions;

public class InsertionSort {
  public static void main(String[] args) {
    int[] arr = ArrayFunctions.getIntArray(100);
    ArrayFunctions.printArray(arr);
    insertionSort(arr);
    ArrayFunctions.printArray(arr);
  }
  
  private static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
        swap(j, j - 1, arr);
      }
    }
  }
  
  private static void swap(int i, int j, int[] arr) {
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
  }
}
