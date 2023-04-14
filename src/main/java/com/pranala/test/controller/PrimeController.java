package com.pranala.test.controller;

import com.pranala.test.service.PrimeServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prime")
public class PrimeController {

    private PrimeServices primeServices;

    PrimeController(PrimeServices primeServices) {
        this.primeServices = primeServices;
    }

    @GetMapping()
    public ResponseEntity<Object> generatePrimeNumbers(@RequestParam("limit") int limit){
        return ResponseEntity.ok(primeServices.generatePrimeUsingIntStream(limit));
    }
}
