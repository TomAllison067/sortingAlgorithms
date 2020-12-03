package sortingAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class MergeSorter <T extends Comparable<T>> {  

  public List<T> mergeSort(List<T> list){
    if (list.size() == 1) {
      return list;
    }
    int middle = list.size() / 2;
    List<T> left = mergeSort(list.subList(0, middle));
    List<T> right = mergeSort(list.subList(middle, list.size()));
    return merge(left, right);
  }
  
  private List<T> merge(List<T> left, List<T> right){
    List<T> result = new ArrayList<T>();
    int i = 0, j = 0;
    while (i < left.size() && j < right.size()) {
      if (left.get(i).compareTo(right.get(j)) < 0) {
        result.add(left.get(i++));
      } else {
        result.add(right.get(j++));
      }
    }
    while (i < left.size()) {
      result.add(left.get(i++));
    }
    while (j < right.size()) {
      result.add(right.get(j++));
    }
    return result;
  }
}
