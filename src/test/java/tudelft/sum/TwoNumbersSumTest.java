package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tudelft.sum.TwoNumbersSum;

import java.util.ArrayList;

public class TwoNumbersSumTest {
    @Test
    void OneDigitEach() {
        ArrayList<Integer> first = new ArrayList<>();
        first.add(1);
        ArrayList<Integer> second = new ArrayList<>();
        second.add(1);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);

        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(first, second);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void MoreThanTen() {
        ArrayList<Integer> first = new ArrayList<>();
        first.add(5);
        ArrayList<Integer> second = new ArrayList<>();
        second.add(6);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(1);

        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(first, second);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void ExactlyTen() {
        ArrayList<Integer> first = new ArrayList<>();
        first.add(3);
        ArrayList<Integer> second = new ArrayList<>();
        second.add(7);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(0);

        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(first, second);
        Assertions.assertEquals(expected, result);
    }

}
