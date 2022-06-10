package sort;

public class InsertSort {
    public void sort(int[] unsortedList) {

        if(unsortedList.length < 2){
            return;
        }

        for(int index = 1; index < unsortedList.length; index++) {

            int checkVal = unsortedList[index];

            for(int jIndex = index -1 ; jIndex >= 0; jIndex --) {

                if(checkVal > unsortedList[jIndex]){
                    break;
                }

                unsortedList[jIndex+1] = unsortedList[jIndex];
                unsortedList[jIndex] = checkVal;
            }
        }
    }
}
