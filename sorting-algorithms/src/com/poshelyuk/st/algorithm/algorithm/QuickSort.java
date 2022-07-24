package com.poshelyuk.st.algorithm.algorithm;

import static com.poshelyuk.st.algorithm.algorithm.AlgorithmsNameConstant.QUICK_SORT;

public class QuickSort implements Sortable {

    @Override
    public int[] sort(int[] array) {
        int begin = 0;
        int end = array.length - 1;
        return quickSort(array, begin, end);
    }

    @Override
    public String getName() {
        return QUICK_SORT;
    }

    private int[] quickSort(int[] array, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(array, begin, end);

            quickSort(array, begin, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, end);
        }
        return array;
    }

    private int partition(int[] array, int begin, int end) {
        int pivot = array[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (array[j] <= pivot) {
                i++;

                int swapTemp = array[i];
                array[i] = array[j];
                array[j] = swapTemp;
            }
        }

        int swapTemp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = swapTemp;

        return i + 1;
    }

}
