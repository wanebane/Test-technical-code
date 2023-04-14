package com.pranala.test.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PrimaServicesTest {

    private static final Logger log = LoggerFactory.getLogger(PrimaServicesTest.class);

    public PrimeServices primaServices;

    @BeforeEach
    void setUp(){
        primaServices = new PrimeServices();
    }

    @Test
    @DisplayName("Generate Prime Numbers until 30")
    void generatePrimeNumbers_limit30(){
        int limit = 30;
        Stream<Integer> expected = Stream.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        assertArrayEquals(expected.toArray(), primaServices.generatePrimeNumbers(limit).toArray());
        log.info("Result {}", primaServices.generatePrimeNumbers(limit).collect(Collectors.toList()));
    }

    @Test
    @DisplayName("Count Prime Numbers until 20")
    void countPrimeNumbers_limit20(){
        int limit = 20;
        int expected = 8;
        assertEquals(expected, primaServices.generatePrimeNumbers(limit).count());
        log.info("Result Count : {}", primaServices.generatePrimeNumbers(limit).count());
    }

    @Test
    @DisplayName("If Limit == 0 or Limit == 1")
    void generatePrimeNumbers_limit0And1(){
        int limit0 = 0;
        List<Integer> expected0 = List.of(0);
        assertArrayEquals(expected0.toArray(), primaServices.generatePrimeNumbers(limit0).toArray());

        log.info("Result limit {} -> {}", limit0, primaServices.generatePrimeNumbers(limit0).toArray());

        int limit1 = 1;
        List<Integer> expected1 = List.of(1);
        assertArrayEquals(expected1.toArray(), primaServices.generatePrimeNumbers(limit1).toArray());

        log.info("Result limit {} -> {}", limit1, primaServices.generatePrimeNumbers(limit1).toArray());
    }

}