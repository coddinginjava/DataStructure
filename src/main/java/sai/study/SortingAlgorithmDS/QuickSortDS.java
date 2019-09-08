package sai.study.SortingAlgorithmDS;

public class QuickSortDS {

    public static void doSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int indexOfI = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[indexOfI] > arr[j]) {

                    indexOfI = j;

                }

                int temp = arr[i];
                arr[i] = arr[indexOfI];
                arr[indexOfI] = temp;
            }
        }
    }
}
