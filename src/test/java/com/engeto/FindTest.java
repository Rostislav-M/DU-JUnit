package com.engeto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FindTest {
    @Test
    public void middle1Test() {
        List<Double> testList = List.of(10.0, 15.45, 5.811, 175.0);
        Double testResult = Find.findMatching(testList, 4.0, 9.3);
        Assertions.assertEquals(5.811, testResult);
    }
    @Test
    void emptyTest() {
        List<Double> testList = new ArrayList<>();
        Assertions.assertThrows(
                IllegalArgumentException.class, () -> Find.findMatching(testList,10.0,12.00));
    }
    //První vlastní test
    @Test
    void testFindMatchingInRange11To12Point6(){
        List<Double> testList = List.of(12.0, 8.126, 6.0);
        Double lowerLimit = 11.0;
        Double upperLimit = 12.6;
        Double expectedValue = 12.0;
        String message="Expected matching value is 12.0";

        Double testResult = Find.findMatching(testList,lowerLimit,upperLimit);

        Assertions.assertEquals(expectedValue,testResult,message);
    }
    //Druhý vlastní test
    @Test
    void testFindMatchingInRange8To10(){
        List<Double> testList = List.of(12.0, 8.126, 9.0, 158.0, 6.0);
        Double lowerLimit = 8.0;
        Double upperLimit = 10.0;
        Double expectedValue = 8.126;
        String message="Expected matching value is 8.126";

        Double testResult = Find.findMatching(testList,lowerLimit,upperLimit);

        Assertions.assertEquals(expectedValue,testResult,message);
    }

}
