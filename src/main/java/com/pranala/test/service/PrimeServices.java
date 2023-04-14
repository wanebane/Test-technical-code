package com.pranala.test.service;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeServices {

    private boolean checkLimit(int limit) {
        return limit == 0 || limit == 1;
    }

    public Stream<Integer> generatePrimeUsingIntStream(int limit){
        if (checkLimit(limit)) {
            return Stream.of(limit);
        }
        return IntStream.range(2, limit).filter(this::isPrime).boxed();
    }

    public boolean isPrime(int number){
        return IntStream.range(2, number).noneMatch(v -> number % v == 0);
    }
}
