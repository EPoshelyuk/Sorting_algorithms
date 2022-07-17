package com.poshelyuk.st.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

import static com.poshelyuk.st.algorithm.algorithm.AlgorithmsNameConstant.*;

public class ArrayUtils {
    public static void display(int[] array) {
        System.out.print(Arrays.toString(array));
    }
    public static int[] getArrayWithСertainElements(int amount) {
        var array = new ArrayList<Integer>();
        for (int i = 0; i < amount; i++) {
            array.add(i);
        }
        Collections.shuffle(array);
        return array.stream().mapToInt(num -> num).toArray();
    }
    public static Map<String, int[]> getMapWithTheSameArrays(int arraySize) {
        int[] array = getArrayWithСertainElements(arraySize);
        return Map.of(
                BUBBLE_SORT, array,
                COUNTING_SORT, array.clone(),
                HEAP_SORT, array.clone(),
                INSERTION_SORT, array.clone(),
                MERGE_SORT, array.clone(),
                QUICK_SORT, array.clone(),
                SELECTION_SORT, array.clone(),
                SHELL_SORT, array.clone(),
                TIMSORT, array.clone(),
                TREE_SORT, array.clone()
        );
    }

}
