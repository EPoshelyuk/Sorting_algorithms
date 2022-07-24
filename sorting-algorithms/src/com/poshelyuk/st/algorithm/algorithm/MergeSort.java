package com.poshelyuk.st.algorithm.algorithm;

import static com.poshelyuk.st.algorithm.algorithm.AlgorithmsNameConstant.MERGE_SORT;

public class MergeSort implements Sortable {

    @Override
    public int[] sort(int[] array) {
        var length = array.length;
        mergeSort(array, length);
        return new int[0];
    }

    private void mergeSort(int[] array, int length) {
        if (length < 2) {
            return;
        }

        int mid = length / 2;
        var l = new int[mid];
        var r = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < length; i++) {
            r[i - mid] = array[i];
        }
        mergeSort(l, mid);
        mergeSort(r, length - mid);

        merge(array, l, r, mid, length - mid);
    }

    private void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    @Override
    public String getName() {
        return MERGE_SORT;
    }

}
