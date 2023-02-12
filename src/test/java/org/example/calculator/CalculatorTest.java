package org.example.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Realização de Teste")
public class CalculatorTest {

    @Test
    public void ShouldReturnZeroWhenNoValueWereGiven(){
        Calculator calculator = new Calculator();

        double sum = calculator.sum();

        Assertions.assertEquals(0, sum);

    }

    @Test
    public void ShouldReturnTheSumOfGivenValues() {

        Calculator calculator = new Calculator();

        double sum = calculator.sum(3, 6);

        Assertions.assertEquals(9, sum);

    }

    @Test
    public void ShouldThrowAnExceptionWhenTheGivenNumberWereLassThenZero() {
        Calculator calculator = new Calculator();

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-1));

        Assertions.assertEquals("Não existe rais quadrada real para numeros negativos", exception.getMessage());
    }

    @Test
    public void ShouldReturnTheSquareRootOfGivenNumber() {
        Calculator calculator = new Calculator();

        double result = calculator.squareRoot(4);

        Assertions.assertEquals(2, result);
    }

    @Test
    public void ShouldReturnTrueNumberWhenTheGivenNumberIsOdd() {
        Calculator calculator = new Calculator();

        boolean isOdd = calculator.isOdd(3);

        Assertions.assertTrue(isOdd);
    }

    @Test
    public void ShouldReturnFalseWhenTheGivenNumberIsEven() {
        Calculator calculator = new Calculator();

        boolean isOdd = calculator.isOdd(2);

        Assertions.assertFalse(isOdd);
    }
}
