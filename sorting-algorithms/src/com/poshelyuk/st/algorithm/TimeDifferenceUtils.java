package com.poshelyuk.st.algorithm;

import com.poshelyuk.st.algorithm.algorithm.Sortable;

import java.time.Duration;
import java.time.Instant;

public class TimeDifferenceUtils {
    public static void calculateExecutionTime(Sortable sortAlg, int[] array) {
        var start = Instant.now();
        int[] sort = sortAlg.sort(array);
        var end = Instant.now();
        var timeElapsed = Duration.between(start, end);

        int arrayLength = array.length;
        String algName = sortAlg.getName();
        System.out.println(algName + "(" + arrayLength + ")" + " took time: " + timeElapsed.toMillis() + " milliseconds");
    }

}
