import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    Main main;

    @BeforeEach
    void init() {
        main = new Main();
    }

    @Test
     void sumDigit() {

        assertEquals(15, main.sumDigit(12345));
    }

    @Test
    void sumDigitWith0() {

        assertEquals(0, main.sumDigit(0));
    }

    @Test
    void powerOf() {

        assertEquals(9, main.powerOf(3, 2));
    }

    @Test
    void powerOfWith0() {

        assertEquals(1, main.powerOf(3, 0));
        assertEquals(1, main.powerOf(0, 3));
    }

    @Test
    void numberAdder() {

        assertEquals(15, main.numberAdder(5));
    }

    @Test
    void numberAdderWith0() {

        assertEquals(0, main.numberAdder(0));
    }

    @Test
    void bunnies() {

        assertEquals(12, main.bunnies(6));
    }

    @Test
    void bunniesAgain() {

        assertEquals(7, main.bunniesAgain(3));
    }

    @Test
    void string() {

        assertEquals("yyXXyymm", main.strings("xxXXxxmm", 0));
    }

    @Test
    void stringsAgain() {

        assertEquals("XXmm", main.stringsAgain("xxXXxxmm", 0));
    }

    @Test
    void stringsAgainAndAgain() {

        StringBuilder sb = new StringBuilder("word");
        assertEquals("w*o*r*d", main.stringsAgainAndAgain(sb, 0));
    }
}