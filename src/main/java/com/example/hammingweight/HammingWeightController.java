package com.example.hammingweight;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HammingWeightController {
    private String lastString;
    @RequestMapping("/laststring")
    public String getLastString() {
        return lastString;
    }

    @RequestMapping("/hamming")
    public int calculateHammingWeight(@RequestParam("string") String inputString) {
        lastString = inputString;
        int hammingWeight = 0;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) != '0') {
                hammingWeight++;
            }
        }
        return hammingWeight;
    }


}
