package sai.study;

import sai.study.SortingAlgorithmDS.BubbleSortDS;
import sai.study.SortingAlgorithmDS.QuickSortDS;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

        int[] arr = new int[]{16, 5, 1, 9, 8};

        printIt("Before", arr);

//        QuickSortDS.doSort(arr);

//        BubbleSortDS.doSort(arr);

        printIt("After", arr);

    }


    public static void printIt(String when, int[] arr) {
        System.out.println("this is -> " + when);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " -> " + arr[i]);
        }
    }

}
