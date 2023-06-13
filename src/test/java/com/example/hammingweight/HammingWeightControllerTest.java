package com.example.hammingweight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class HammingWeightControllerTest {

    @Test
    public void testCalculateHammingWeight() {
        HammingWeightController controller = new HammingWeightController();     //Arrange

        int result1 = controller.calculateHammingWeight("01234");     //Act
        Assertions.assertEquals(4, result1);                           //Assert

        int result2 = controller.calculateHammingWeight("012012");
        Assertions.assertEquals(4, result2);

        int result3 = controller.calculateHammingWeight("000050000");
        Assertions.assertEquals(1, result3);
    }

    @Test
    public void testGetLastString() {
        HammingWeightController controller = new HammingWeightController();

        controller.calculateHammingWeight("01234");
        String result = controller.getLastString();
        Assertions.assertEquals("01234", result);
    }
}