package sortingAlgorithms;

import helpers.ArrayFunctions;

public class SelectionSort {
  private static int SIZE = 100;
  public static void main(String[] args) {
    int[] arr = ArrayFunctions.getIntArray(SIZE);
    ArrayFunctions.printArray(arr);
    selectionSort(arr);
    ArrayFunctions.printArray(arr);
  }
  
  private static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int min = i;
      for (int j = i; j < arr.length; j++) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }
      swap(i, min, arr);
    }
  }
  
  private static void swap(int i, int j, int[] arr) {
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
  }

  
}
