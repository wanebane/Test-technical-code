package com.pranala.test.service;

import java.util.ArrayList;
import java.util.List;

public class TriangleServices {

    public List<String> generateTriangle(int numbers){
        String[] splitNum = String.valueOf(numbers).split("");
        int countNum = splitNum.length;
        List<String> result = new ArrayList<>();
        StringBuilder sb;
        String generatedZero = "0";
        for (int i = 0; i < countNum; i++){
            sb = new StringBuilder();
            sb.append(splitNum[i]);
            for (int j = 0; j < i+1; j++) {
                sb.append(generatedZero);
            }
            result.add(sb.toString());
        }
        return result;
    }

}
