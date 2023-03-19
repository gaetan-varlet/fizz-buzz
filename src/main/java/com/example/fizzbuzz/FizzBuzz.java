package com.example.fizzbuzz;

public class FizzBuzz {

    public String generate(int minNumber, int maxNumber) {
        return evaluateNumbers(minNumber, maxNumber);
    }

    private String evaluateNumbers(int minNumber, int maxNumber) {
        StringBuilder result = new StringBuilder();
        while (minNumber <= maxNumber) {
            result.append(evaluateNumber(minNumber++));
        }
        return result.toString();
    }

    private String evaluateNumber(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

}
