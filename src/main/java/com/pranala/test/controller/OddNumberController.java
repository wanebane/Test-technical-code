package com.pranala.test.controller;

import com.pranala.test.constant.AppConstant;
import com.pranala.test.constant.dto.ApiResponse;
import com.pranala.test.service.OddNumberServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/odd-numbers")
public class OddNumberController {

    private OddNumberServices oddNumberServices;

    OddNumberController(OddNumberServices oddNumberServices) {
        this.oddNumberServices = oddNumberServices;
    }

    @GetMapping()
    public ResponseEntity<Object> generateOddNumbers(@RequestParam("limit") int limit){
        if (limit < 0){
            return new ResponseEntity<>(new ApiResponse(false, AppConstant.INPUT_EXCEPTION), HttpStatus.BAD_REQUEST);
        }

        return ResponseEntity.ok(oddNumberServices.generateOddNumbers(limit));
    }
}
