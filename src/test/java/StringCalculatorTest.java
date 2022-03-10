import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class StringCalculatorTest {

    StringCalculater stringCalculater = new StringCalculater();
    int testNum = 2;
    int testSum = 6;

    @Test
    @DisplayName("더하기")
    void add() {
        assertEquals(8, stringCalculater.add(testNum, testSum));
    }

    @Test
    @DisplayName("빼기")
    void subtract() {
        assertEquals(4, stringCalculater.subtract(testNum, testSum));
    }

    @Test
    @DisplayName("곱하기")
    void multiply() {
        assertEquals(12, stringCalculater.multiply(testNum, testSum));
    }

    @Test
    @DisplayName("나누기")
    void divide() {
        assertEquals(3, stringCalculater.divide(testNum, testSum));
    }

    @Test
    @DisplayName("분리하기")
    void separate() {
        String string = "2 + 3 * 4 / 2";
        String[] list = {"2", "+", "3", "*", "4", "/", "2"};
        assertThat(Arrays.equals(list, stringCalculater.separate(string)));
    }

    @Test
    @DisplayName("숫자로 전환")
    void toInt() {
        String inputNum = "1";
        int num = 1;
        assertEquals(num, stringCalculater.toInt(inputNum));
    }

    @Test
    @DisplayName("계산하기")
    void startCalculate() {
        char input = '+';
        int num = 2;
        int sum = 0;
        int result = 2;
        assertEquals(result, stringCalculater.startCalculate(input, sum, num));

    }

    @Test
    @DisplayName("계산시작")
    void calculator() {
        String string = "2 + 3 * 4 / 2";
        String[] list = stringCalculater.separate(string);
        int result = 10;
        assertEquals(result, stringCalculater.calculator(list));


    }
}