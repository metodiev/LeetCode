package junitpackage;

import static org.junit.jupiter.api.Assertions.assertTrue;

import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

public class TestOperationWithTwoNumbers {

    @Description("What will do the test")
    @Test
    public void testSumTwoNumbersMethod(){
        OperationWithTwoNumbers operationSum = new OperationWithTwoNumbers();

        //1. sum two numbers
        int firstNumber = 100;
        int seconfNumber = 20;
        int testNumber  = operationSum.sumTwoNumbers(firstNumber, seconfNumber);
        assertTrue(testNumber == firstNumber+seconfNumber);
    }


    @Description("What will do the test if we provide infinity number")
    @Test
    public void testSumTwoNumbersMethodWithInfinityIntegers(){
        OperationWithTwoNumbers operationSum = new OperationWithTwoNumbers();

        //1. sum two numbers
        long firstNumber = 50;
        long seconfNumber = -200_000;
        long testNumber  = operationSum.sumTwoNumbers((int)firstNumber, (int)seconfNumber);
        assertTrue(testNumber == firstNumber+seconfNumber);
    }
}

