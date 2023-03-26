package com.example.fizzbuzz;

import static org.assertj.core.api.Assertions.assertThat;

import io.cucumber.java8.En;

public class FizzBuzzGlue implements En {

    private FizzBuzz fizzBuzz;
    private String result;

    public FizzBuzzGlue() {

        Before(() -> {
            fizzBuzz = new FizzBuzz();
        });

        When("les nombres en entrée sont {int} et {int}", (Integer nombreMin, Integer nombreMax) -> {
            result = fizzBuzz.generate(nombreMin, nombreMax);
        });

        Then("la chaine de caractères en sortie est {string}", (String expectedResult) -> {
            assertThat(result).isEqualTo(expectedResult);
        });
    }

}
