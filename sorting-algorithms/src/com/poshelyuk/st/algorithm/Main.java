package com.poshelyuk.st.algorithm;

import com.poshelyuk.st.algorithm.algorithm.*;

import static com.poshelyuk.st.algorithm.algorithm.AlgorithmsNameConstant.*;

public class Main {

    public static void main(String[] args) {
        var hundredElements = ArrayUtils.getMapWithTheSameArrays(100);
        var thousandElements = ArrayUtils.getMapWithTheSameArrays(1000);
        var tenThousandElements = ArrayUtils.getMapWithTheSameArrays(10_000);
        var hundredThousandElements = ArrayUtils.getMapWithTheSameArrays(100_000);
        var twoHundredFiftyThousandElements = ArrayUtils.getMapWithTheSameArrays(250_000);

        var bubbleSort = new BubbleSort();
        var insertionSort = new InsertionSort();
        var selectionSort = new SelectionSort();
        var shellSort = new ShellSort();
        var quickSort = new QuickSort();
        var mergeSort = new MergeSort();
        var timsort = new Timsort();
        var heapSort = new HeapSort();
        var countingSort = new CountingSort();
        var treeSort = new TreeSort();


        System.out.println("---------------------------------------------");

        TimeDifferenceUtils.calculateExecutionTime(bubbleSort, hundredElements.get(BUBBLE_SORT));
        TimeDifferenceUtils.calculateExecutionTime(bubbleSort, thousandElements.get(BUBBLE_SORT));
        TimeDifferenceUtils.calculateExecutionTime(bubbleSort, tenThousandElements.get(BUBBLE_SORT));
        TimeDifferenceUtils.calculateExecutionTime(bubbleSort, hundredThousandElements.get(BUBBLE_SORT));
        TimeDifferenceUtils.calculateExecutionTime(bubbleSort, twoHundredFiftyThousandElements.get(BUBBLE_SORT));

        System.out.println("---------------------------------------------");

        TimeDifferenceUtils.calculateExecutionTime(insertionSort, hundredElements.get(INSERTION_SORT));
        TimeDifferenceUtils.calculateExecutionTime(insertionSort, thousandElements.get(INSERTION_SORT));
        TimeDifferenceUtils.calculateExecutionTime(insertionSort, tenThousandElements.get(INSERTION_SORT));
        TimeDifferenceUtils.calculateExecutionTime(insertionSort, hundredThousandElements.get(INSERTION_SORT));
        TimeDifferenceUtils.calculateExecutionTime(insertionSort, twoHundredFiftyThousandElements.get(INSERTION_SORT));

        System.out.println("---------------------------------------------");

        TimeDifferenceUtils.calculateExecutionTime(selectionSort, hundredElements.get(SELECTION_SORT));
        TimeDifferenceUtils.calculateExecutionTime(selectionSort, thousandElements.get(SELECTION_SORT));
        TimeDifferenceUtils.calculateExecutionTime(selectionSort, tenThousandElements.get(SELECTION_SORT));
        TimeDifferenceUtils.calculateExecutionTime(selectionSort, hundredThousandElements.get(SELECTION_SORT));
        TimeDifferenceUtils.calculateExecutionTime(selectionSort, twoHundredFiftyThousandElements.get(SELECTION_SORT));

        System.out.println("---------------------------------------------");

        TimeDifferenceUtils.calculateExecutionTime(shellSort, hundredElements.get(SHELL_SORT));
        TimeDifferenceUtils.calculateExecutionTime(shellSort, thousandElements.get(SHELL_SORT));
        TimeDifferenceUtils.calculateExecutionTime(shellSort, tenThousandElements.get(SHELL_SORT));
        TimeDifferenceUtils.calculateExecutionTime(shellSort, hundredThousandElements.get(SHELL_SORT));
        TimeDifferenceUtils.calculateExecutionTime(shellSort, twoHundredFiftyThousandElements.get(SHELL_SORT));

        System.out.println("---------------------------------------------");

        TimeDifferenceUtils.calculateExecutionTime(quickSort, hundredElements.get(QUICK_SORT));
        TimeDifferenceUtils.calculateExecutionTime(quickSort, thousandElements.get(QUICK_SORT));
        TimeDifferenceUtils.calculateExecutionTime(quickSort, tenThousandElements.get(QUICK_SORT));
        TimeDifferenceUtils.calculateExecutionTime(quickSort, hundredThousandElements.get(QUICK_SORT));
        TimeDifferenceUtils.calculateExecutionTime(quickSort, twoHundredFiftyThousandElements.get(QUICK_SORT));

        System.out.println("---------------------------------------------");

        TimeDifferenceUtils.calculateExecutionTime(mergeSort, hundredElements.get(MERGE_SORT));
        TimeDifferenceUtils.calculateExecutionTime(mergeSort, thousandElements.get(MERGE_SORT));
        TimeDifferenceUtils.calculateExecutionTime(mergeSort, tenThousandElements.get(MERGE_SORT));
        TimeDifferenceUtils.calculateExecutionTime(mergeSort, hundredThousandElements.get(MERGE_SORT));
        TimeDifferenceUtils.calculateExecutionTime(mergeSort, twoHundredFiftyThousandElements.get(MERGE_SORT));

        System.out.println("---------------------------------------------");

        TimeDifferenceUtils.calculateExecutionTime(timsort, hundredElements.get(TIMSORT));
        TimeDifferenceUtils.calculateExecutionTime(timsort, thousandElements.get(TIMSORT));
        TimeDifferenceUtils.calculateExecutionTime(timsort, tenThousandElements.get(TIMSORT));
        TimeDifferenceUtils.calculateExecutionTime(timsort, hundredThousandElements.get(TIMSORT));
        TimeDifferenceUtils.calculateExecutionTime(timsort, twoHundredFiftyThousandElements.get(TIMSORT));

        System.out.println("---------------------------------------------");

        TimeDifferenceUtils.calculateExecutionTime(heapSort, hundredElements.get(HEAP_SORT));
        TimeDifferenceUtils.calculateExecutionTime(heapSort, thousandElements.get(HEAP_SORT));
        TimeDifferenceUtils.calculateExecutionTime(heapSort, tenThousandElements.get(HEAP_SORT));
        TimeDifferenceUtils.calculateExecutionTime(heapSort, hundredThousandElements.get(HEAP_SORT));
        TimeDifferenceUtils.calculateExecutionTime(heapSort, twoHundredFiftyThousandElements.get(HEAP_SORT));

        System.out.println("---------------------------------------------");

        TimeDifferenceUtils.calculateExecutionTime(countingSort, hundredElements.get(COUNTING_SORT));
        TimeDifferenceUtils.calculateExecutionTime(countingSort, thousandElements.get(COUNTING_SORT));
        TimeDifferenceUtils.calculateExecutionTime(countingSort, tenThousandElements.get(COUNTING_SORT));
        TimeDifferenceUtils.calculateExecutionTime(countingSort, hundredThousandElements.get(COUNTING_SORT));
        TimeDifferenceUtils.calculateExecutionTime(countingSort, twoHundredFiftyThousandElements.get(COUNTING_SORT));

        System.out.println("---------------------------------------------");

        TimeDifferenceUtils.calculateExecutionTime(treeSort, hundredElements.get(TREE_SORT));
        TimeDifferenceUtils.calculateExecutionTime(treeSort, thousandElements.get(TREE_SORT));
        TimeDifferenceUtils.calculateExecutionTime(treeSort, tenThousandElements.get(TREE_SORT));
        TimeDifferenceUtils.calculateExecutionTime(treeSort, hundredThousandElements.get(TREE_SORT));
        TimeDifferenceUtils.calculateExecutionTime(treeSort, twoHundredFiftyThousandElements.get(TREE_SORT));
    }

}
