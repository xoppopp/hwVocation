package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VocationCalcTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/vocation.csv")
    void amountOfMonths(int expected, int income, int expenses, int threshold) {
        VocationCalc service = new VocationCalc();


        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
