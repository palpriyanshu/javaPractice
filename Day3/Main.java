class Array{
  final private int[] list;

  Array(int[] list){
    this.list = list;
  }

  public int findIndex(int element){
    for(int index=0; index < list.length; index++){
      if(this.list[index] == element){
        return index;
      }
    }
    return -1;
  }

  public boolean isPresent(int element){
    return findIndex(element) != -1;
  }

  public float average(){
    int sum = 0;
    for(int num : this.list){
      sum += num;
    }
    return (float)sum / this.list.length;
  }

  public boolean deepEqual(Object other){
    if(this == other) {
      return true;
    }

    if(!(other instanceof Array)){
      return false;
    }

    Array otherArray = (Array)other;

    if(this.list.length  != otherArray.list.length){
      return false;
    }


    for(int index = 0; index < this.list.length; index++){
      if(this.list[index] != otherArray.list[index]){
        return false;
      }
    }

    return true;
  }

  public int[] reverse(){
    int[] reversedArray = new int[this.list.length];
    for(int index = 0; index < this.list.length; index++){
      reversedArray[index] = this.list[this.list.length - 1 - index];
    }
    return reversedArray;
  }

  public boolean isPalindrome(){
    int[] reversedArray = this.reverse();
    return deepEqual(new Array(reversedArray));
  }

  public int[][] partition(int count){
    int noOfRows = this.list.length/count;
    int index = 0;
    int[][] partitionedList = new int[noOfRows][count];
    for(int rowId = 0; rowId < noOfRows; rowId++){
      for(int colId = 0; colId < count; colId++){
        partitionedList[rowId][colId] = this.list[index];
        index++;
      }
    }
    return partitionedList;
  }

  private void swap(int index1, int index2){
    int temp = this.list[index1];
    this.list[index1] = this.list[index2];
    this.list[index2] = temp;
  }

  private int findIndexOfMin(int startIdx){
    int minIndex = startIdx;
    for(int index=startIdx; index < this.list.length; index++){
      if(this.list[minIndex] > this.list[index]){
        minIndex = index;
      }
    }
    return minIndex;
  }

  public int[] sort(){
    for(int elementIdx = 0; elementIdx < this.list.length; elementIdx++){
      int minIndex = findIndexOfMin(elementIdx);
      swap(minIndex, elementIdx);
    }
    return this.list;
  }
} 

public class Main{
  public static void main(String[] args){
    int[] list = {1,2,3,4,5,9,7,6,8,10};
    int[] list2 = {1,8,3,4,5,9,7,6,2,10};
    Array numbers = new Array(list);
    Array unsorted = new Array(list2);
    System.out.println("average "+numbers.average());
    System.out.println("palindrome "+ numbers.isPalindrome());
    System.out.println(numbers.reverse());
    int[][] partitionedList = numbers.partition(2);
    System.out.println(numbers.partition(2));
    System.out.println(numbers.deepEqual(unsorted));
    int[] sortedList = unsorted.sort();
    for(int num : sortedList){
      System.out.println(num);
    }
  }
}

// Find out if the element is present in Given array.
// Average of given numbers.
// Deep Equal for array.
// Sort the given integer array.
// Palindrome check of an array.
// Partition of arrays. Eg: 10 elements create 2 arrays of 5 each
