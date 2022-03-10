package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    // Test Case 구현
    @Test
    void setTest() {
        int length = numbers.size();
        assertThat(length).isEqualTo(3);
    }

    @Test
    @DisplayName("알파벳 포함 확인 : 성공 ")
    void contains() {
        assertThat(numbers.contains(1)).isTrue();
        assertThat(numbers.contains(2)).isTrue();
        assertThat(numbers.contains(3)).isTrue();
    }

    //학습테스트 실습 요구사항 3
    @ParameterizedTest
    @CsvSource(value = {"1:1", "2:2", "3:3"}, delimiter = ':')
    void containsParams(int input, int expected) {
        assertEquals(expected, input);
        assertNotEquals(4, input);
        assertNotEquals(5, input);
    }

    //문자열 계산기
    @Test
    @ValueSource(strings = {"2 + 3 + 4 / 2"})
    void 문자열_계산기(String input) {
        List<String> nums = Arrays.asList(input.split(" "));

        int number = Integer.parseInt(nums.get(1));

    }

}
