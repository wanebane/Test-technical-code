package com.pranala.test.controller;

import com.pranala.test.constant.AppConstant;
import com.pranala.test.constant.dto.ApiResponse;
import com.pranala.test.service.TriangleServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/triangle")
public class TriangleController {

    private TriangleServices triangleServices;

    TriangleController(TriangleServices triangleServices) {
        this.triangleServices = triangleServices;
    }

    @GetMapping()
    public ResponseEntity<Object> generateTriangles(@RequestParam("limit") int limit){
        if (limit < 0){
            return new ResponseEntity<>(new ApiResponse(false, AppConstant.INPUT_EXCEPTION), HttpStatus.BAD_REQUEST);
        }

        return ResponseEntity.ok(triangleServices.generateTriangle(limit));
    }
}
