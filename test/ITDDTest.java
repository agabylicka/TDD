import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ITDDTest {

    @Test
    void test_hasGoodLength() {
        // given
        ITDD tested = new ITDDImpl();

        // when
        boolean actual = tested.hasGoodLength("aaaabbbbbcccc");

        // then
        Assertions.assertTrue(actual);
    }

    @Test
    void test_hasNoWhiteSpaces() {
        // given
        ITDD tested = new ITDDImpl();
        // when
        boolean actual = tested.hasNoWhiteSpaces("aaaabbbbbcccc");
        // then
        Assertions.assertTrue(actual);
    }

    @Test
    void test_hasNoRepetitions() {
        // given
        ITDD tested = new ITDDImpl();
        // when
        boolean actual = tested.hasNoRepetitions("abc");
        // then
        Assertions.assertTrue(actual);
    }

    @Test
    void test_hasNumbers() {
        // given
        ITDD tested = new ITDDImpl();
        // when
        boolean actual = tested.hasNumbers("abc1");
        // then
        Assertions.assertTrue(actual);
    }

    @Test
    void test_hasSpecialCharacter() {
        // given
        ITDD tested = new ITDDImpl();
        // when
        boolean actual = tested.hasSpecialCharacter("abc1.");
        // then
        Assertions.assertTrue(actual);
    }

}
