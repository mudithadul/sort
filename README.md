# sort
Sorting Algorithms such as Merge Sort, Insert Sort, QuickSort, Bubble Sort

This project contain the implementation of QuickSort, Bubble Sort, Insert Sort and Merge Sort Algorithm where anyone can use to integrate with their impelementation

Following code provide example of using BubbleSort algorithm but any one can use the same to use other algorithms as well.

package sort;

import sort.BubbleSort;

import java.security.SecureRandom;

public class HelloWorld {

    public static void main(String [] args) {
        SecureRandom secureRandom = new SecureRandom();
        int [] unsortedList = new int[10];

        for (int index = 0; index < unsortedList.length; index++){
            unsortedList[index] = secureRandom.nextInt(100);
        }

        System.out.println("Before Sort");

        printArray(unsortedList);
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(unsortedList);

        System.out.println("After Sort");
        printArray(unsortedList);
    }

    private static void printArray(int[] unsortedList) {
        for(int index = 0; index < unsortedList.length; index++){
            System.out.println(unsortedList[index]);
        }
    }

}
class Person{
    private String id;

    void setId(String id){
        this.id = id;
    }

    String getId(){
        return id;
    }
}

class Print<T> {
    T dataStore;
    public Print(T dataStore){
        this.dataStore = dataStore;
    }

    void displayPrint(){
        System.out.println(dataStore);
    }
}

