package helpers;

import java.util.Random;

public class ArrayFunctions {
  
  public static int[] getIntArray(int size) {
    int[] arr = new int[size];
    Random r = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = r.nextInt(100);
    }
    return arr;
  }
  
  public static void printArray(int[] array) {
    System.out.print("[");
    int i = 0;
    while (i < array.length) {
      
      if (i != 0 && i % 10 == 0) {
        System.out.println(array[i] + ", ");
      } else {
        System.out.print(array[i] + ", ");
      }
      i++;
    }
    System.out.println("]\n");
  }

}
