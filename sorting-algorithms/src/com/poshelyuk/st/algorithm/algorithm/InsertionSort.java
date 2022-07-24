package com.poshelyuk.st.algorithm.algorithm;

import static com.poshelyuk.st.algorithm.algorithm.AlgorithmsNameConstant.INSERTION_SORT;

public class InsertionSort implements Sortable {

    @Override
    public int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        return array;
    }

    @Override
    public String getName() {
        return INSERTION_SORT;
    }

}
