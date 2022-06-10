package sort;

public class QuickSort {
    public void sort(int [] unsortedList) {
        int firstIndex = 0;
        int lastIndex = unsortedList.length - 1;

        quickSort(unsortedList, firstIndex, lastIndex);
        System.out.println(unsortedList);
    }

    private void quickSort(int[] unsortedList, int firstIndex, int lastIndex) {

        if(firstIndex >= lastIndex) {
            return;
        }

        int firstPointer = partition(unsortedList, firstIndex, lastIndex);
        quickSort(unsortedList, firstIndex, firstPointer - 1);
        quickSort(unsortedList, firstPointer + 1, lastIndex);
    }

    private int partition(int[] unsortedList, int firstIndex, int lastIndex) {

        int pivot = unsortedList[lastIndex];

        int firstPointer = firstIndex;
        int lastPointer = lastIndex;

        while (firstPointer < lastPointer) {
            while (unsortedList[firstPointer] <= pivot && firstPointer < lastPointer) {
                firstPointer++;
            }

            while (unsortedList[lastPointer] >= pivot && firstPointer < lastPointer){
                lastPointer--;
            }

            swap(unsortedList, firstPointer, lastPointer);
        }

        swap(unsortedList, firstPointer, lastIndex);
        return firstPointer;
    }

    private void swap(int[] unsortedList, int firstPointer, int lastPointer) {
        int temp = unsortedList[firstPointer];
        unsortedList[firstPointer] = unsortedList[lastPointer];
        unsortedList[lastPointer] = temp;
    }
}
