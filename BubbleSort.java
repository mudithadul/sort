package sort;

public class BubbleSort {
    public void sort(int[] unsortedList) {

        boolean isSwap;
        do {
            isSwap = false;
            for (int jIndex = 0; jIndex < unsortedList.length - 1; jIndex++) {

                if (unsortedList[jIndex] > unsortedList[jIndex + 1]) {
                    swap(unsortedList, jIndex, jIndex + 1);
                    isSwap = true;
                }
            }
        }while (isSwap);
    }

    private void swap(int[] unsortedList, int currentIndex, int nextIndex) {
        int temp = unsortedList[currentIndex];
        unsortedList[currentIndex] = unsortedList[nextIndex];
        unsortedList[nextIndex] = temp;
    }
}
