import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class ITDDNegativeTest {

    @Test
    void test_hasNotGoodLength() {
        // given
        ITDD tested = new ITDDImpl();

        // when
        boolean actual = tested.hasGoodLength("");

        // then
        Assertions.assertFalse(actual);
    }

    @Test
    void test_hasSomeWhiteSpaces() {
        // given
        ITDD tested = new ITDDImpl();
        // when
        boolean actual = tested.hasNoWhiteSpaces("aaaabbbb bcccc");
        // then
        Assertions.assertFalse(actual);
    }

    @Test
    void test_hasSomeRepetitions() {
        // given
        ITDD tested = new ITDDImpl();
        // when
        boolean actual = tested.hasNoRepetitions("abbc");
        // then
        Assertions.assertFalse(actual);
    }

    @Test
    void test_hasNoNumbers() {
        // given
        ITDD tested = new ITDDImpl();
        // when
        boolean actual = tested.hasNumbers("abc");
        // then
        Assertions.assertFalse(actual);
    }

    @Test
    void test_hasNoSpecialCharacter() {
        // given
        ITDD tested = new ITDDImpl();
        // when
        boolean actual = tested.hasSpecialCharacter("abc1");
        // then
        Assertions.assertFalse(actual);
    }

}
