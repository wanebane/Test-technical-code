package com.pranala.test.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class OddNumberServices {

    public List<Integer> generateOddNumbers(int limit) {
        List<Integer> numbers = new ArrayList<>();
        IntStream.range(0, limit).forEach(v -> {
            if (v % 2 != 0)
                numbers.add(v);
        });
        return numbers;
    }
}
