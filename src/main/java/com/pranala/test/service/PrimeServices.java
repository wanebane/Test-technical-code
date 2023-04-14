package com.pranala.test.service;

import java.util.ArrayList;
import java.util.List;

public class PrimeServices {

    private boolean checkLimit(int limit) {
        return limit == 0 || limit == 1;
    }

    public List<Integer> generatePrimeNumbers(int limit) {
        if (checkLimit(limit)) {
            return List.of(limit);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 2; i < limit; i++) {
            int count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                result.add(i);
            }
        }
        return result;
    }
}
