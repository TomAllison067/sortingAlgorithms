package sortingAlgorithms;

import java.util.List;
import helpers.ArrayFunctions;

public class Driver {
  public static void main(String[] args) {
//    MergeSorter<Integer> sorter = new MergeSorter<>();
//    List<Integer> list = new ArrayList<>(1);
//    for (int i = 0; i < 3;i++) {
//      list.add((int) (100 * Math.random()));
//    }
//    print(list);
//    list = sorter.mergeSort(list);
//    print(list);
    Sorter sorter = new HeapSort();
    int[] arr = ArrayFunctions.getIntArray(10);
    print(arr);
    sorter.sort(arr, 0, arr.length - 1);
    print(arr);
  }
  
  public static void print(int[] arr) {
    String separator = "";
    System.out.print("[");
    for (int i : arr) {
      System.out.print(separator + i);
      separator = ", ";
    }
    System.out.println("]");
  }
  
  public static <T> void print(List<T> list) {
    String separator = "";
    System.out.print("[");
    for (T i : list) {
      System.out.print(separator + i.toString());
      separator = ", ";
    }
    System.out.println("]");
  }
}
