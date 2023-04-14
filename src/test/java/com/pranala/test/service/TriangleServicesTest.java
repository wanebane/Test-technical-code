package com.pranala.test.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TriangleServicesTest {

    private static final Logger log = LoggerFactory.getLogger(TriangleServicesTest.class);

    public TriangleServices triangleServices;

    @BeforeEach
    void setUp(){
        triangleServices = new TriangleServices();
    }

    @Test
    @DisplayName("Generate triangles 1345000")
    void generateTriangles_sampleInput(){
        int input = 1345000;
        List<String> expected = List.of("10", "300", "4000", "50000", "000000", "0000000", "00000000");
        assertEquals(expected, triangleServices.generateTriangle(input));
        log.info("Result {}", triangleServices.generateTriangle(input));
    }
}