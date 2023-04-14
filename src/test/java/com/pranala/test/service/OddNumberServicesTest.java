package com.pranala.test.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OddNumberServicesTest {

    private static final Logger log = LoggerFactory.getLogger(OddNumberServicesTest.class);

    private OddNumberServices services;

    @BeforeEach
    void setUp() {
        services = new OddNumberServices();
    }

    @Test
    @DisplayName("Generate list of odd numbers from 0 - 30")
    void generateAllNumbers() {
        List<Integer> expected = List.of(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29);

        int limit = 30;
        List<Integer> generateNumbers = services.generateOddNumbers(limit);
        assertEquals(expected, generateNumbers);
        log.info("Result : {}", services.generateOddNumbers(limit));
    }

    @Test
    @DisplayName("Count generated odd numbers")
    void countGeneratedOddNumbers() {
        int limit = 50;
        int expected = 25;
        assertEquals(expected, services.generateOddNumbers(limit).size());
        log.info("Result : {}", services.generateOddNumbers(limit).size());
    }
}