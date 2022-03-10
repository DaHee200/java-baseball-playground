package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void replaceSecond() {
        String[] string = "1,2".split(",");
        assertThat(string).contains("1", string[0]);
        assertThat(string).contains("2", string[1]);
    }

    @Test
    void subString(){
        String string = "(1,2)";
        String sub = string.substring(1,4);
        assertThat(sub).isEqualTo("1,2");
    }

    @Test
    @DisplayName("문자열의 특정 위치 값을 가져오기 : 성공")
    void getCharSuccess(){
        String string = "abc";
        char character = string.charAt(0);
        assertThat(character).isEqualTo('a');
    }

    @Test
    @DisplayName("문자열의 특정 위치 값을 가져오기 : 실패")
    void getCharFailed(){
        String string = "abc";
        char chara = string.charAt(4);
        Throwable thrown = catchThrowable(()
                -> {throw new StringIndexOutOfBoundsException("out of bound!");});
        assertThat(thrown).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("out of bound");

    }
}
