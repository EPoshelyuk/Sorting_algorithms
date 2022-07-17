package com.poshelyuk.st.algorithm.algorithm;

import static com.poshelyuk.st.algorithm.algorithm.AlgorithmsNameConstant.SELECTION_SORT;

public class SelectionSort implements Sortable {
    @Override
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        return array;
    }
    @Override
    public String getName() {
        return SELECTION_SORT;
    }

}
