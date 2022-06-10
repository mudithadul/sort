package sort;

import java.util.Arrays;

public class MergeSort {
    public void sort(int[] unsortedList) {
        int arrayLength = unsortedList.length;

        if(arrayLength < 2){
            return;
        }

        int middleIndex = arrayLength / 2;

        int [] leftArray = Arrays.copyOfRange(unsortedList, 0, middleIndex);
        int [] rightArray = Arrays.copyOfRange(unsortedList, middleIndex, arrayLength);

        sort(leftArray);
        sort(rightArray);

        merge(unsortedList, leftArray, rightArray);
    }

    private void merge(int [] inputArray, int [] leftArray, int [] rightArray) {

        int leftArrayLen = leftArray.length;
        int rightArrayLen = rightArray.length;

        int i = 0 , j = 0, k = 0 ;

       while (i < leftArrayLen && j < rightArrayLen) {

           if(leftArray[i] <=  rightArray[j]){
               inputArray[k] = leftArray[i];
               i++;
           } else {
               inputArray[k] = rightArray[j];
               j++;
           }
           k++;
       }

       while (i < leftArrayLen) {
           inputArray[k] = leftArray[i];
           k++;
           i++;
       }

       while (j < rightArrayLen) {
           inputArray[k] = rightArray[j];
           k++;
           j++;
       }
    }

    private static void printArray(int[] unsortedList) {
        for(int index = 0; index < unsortedList.length; index++){
            System.out.println(unsortedList[index]);
        }
    }
}
