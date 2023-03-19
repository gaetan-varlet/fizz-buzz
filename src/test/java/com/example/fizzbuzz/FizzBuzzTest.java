package com.example.fizzbuzz;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void shouldReturn1IfNumberIs1() {
        assertThat(fizzBuzz.generate(1, 1)).isEqualTo("1");
    }

    @Test
    void shouldReturn2IfNumberIs2() {
        assertThat(fizzBuzz.generate(2, 2)).isEqualTo("2");
    }

    @Test
    void shouldReturnFizzIfNumberIs3() {
        assertThat(fizzBuzz.generate(3, 3)).isEqualTo("Fizz");
    }

    @Test
    void shouldReturnFizzIfNumberIs6() {
        assertThat(fizzBuzz.generate(6, 6)).isEqualTo("Fizz");
    }

    @Test
    void shouldReturnBuzzIfNumberIs5() {
        assertThat(fizzBuzz.generate(5, 5)).isEqualTo("Buzz");
    }

    @Test
    void shouldReturnBuzzIfNumberIs10() {
        assertThat(fizzBuzz.generate(10, 10)).isEqualTo("Buzz");
    }

    @Test
    void shouldReturnFizzBuzzIfNumberIs15() {
        assertThat(fizzBuzz.generate(15, 15)).isEqualTo("FizzBuzz");
    }

    @Test
    void shouldReturnFizzBuzzIfNumberIs30() {
        assertThat(fizzBuzz.generate(30, 30)).isEqualTo("FizzBuzz");
    }

    @Test
    void shouldReturn12IfNumbersAre1To2() {
        assertThat(fizzBuzz.generate(1, 2)).isEqualTo("12");
    }

    @Test
    void shouldReturn12FizzIfNumbersAre1To3() {
        assertThat(fizzBuzz.generate(1, 3)).isEqualTo("12Fizz");
    }

    @Test
    void shouldReturn12Fizz4BuzzIfNumbersAre1To5() {
        assertThat(fizzBuzz.generate(1, 5)).isEqualTo("12Fizz4Buzz");
    }

    @Test
    void shouldReturn12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzzIfNumbersAre1To15() {
        assertThat(fizzBuzz.generate(1, 15)).isEqualTo("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz");
    }

}
