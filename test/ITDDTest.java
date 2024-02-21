import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ITDDTest {

    @Test
    void test_hasGoodLength() {
        // given
        ITDD tested = new ITDD() {
            @Override
            public boolean hasGoodLength(String password) {
                if (password.length() >= 12) {
                    return true;
                }
                return false;
            }

            @Override
            public boolean hasNoWhiteSpaces(String password) {
                return false;
            }

            @Override
            public boolean hasNoRepetitions(String password) {
                return false;
            }

            @Override
            public boolean hasNumbers(String password) {
                return false;
            }

            @Override
            public boolean hasSpecialCharacter(String password) {
                return false;
            }
        };

        // when -wywołuje metodę, która będzie actual
        boolean actual = tested.hasGoodLength("aaaabbbbbcccc");

        // then - assretion
        Assertions.assertTrue(actual);
    }

    @Test
    void test_hasNoWhiteSpaces() {
        // given
        ITDD tested = new ITDD() {
            @Override
            public boolean hasGoodLength(String password) {
                return false;
            }

            @Override
            public boolean hasNoWhiteSpaces(String password) {
                if (password.contains(" ")) {
                    return false;
                }
                if (password.contains("/t")) {
                    return false;
                }
                return true;
            }

            @Override
            public boolean hasNoRepetitions(String password) {
                return false;
            }

            @Override
            public boolean hasNumbers(String password) {
                return false;
            }

            @Override
            public boolean hasSpecialCharacter(String password) {
                return false;
            }
        };
        // when
        boolean actual = tested.hasNoWhiteSpaces("aaaabbbbbcccc");
        // then
        Assertions.assertTrue(actual);
    }

    @Test
    void test_hasNoRepetitions() {
        // given
        ITDD tested = new ITDD() {
            @Override
            public boolean hasGoodLength(String password) {
                return false;
            }

            @Override
            public boolean hasNoWhiteSpaces(String password) {
                return false;
            }

            @Override
            public boolean hasNoRepetitions(String password) {
                for (int i = 0; i < password.length() - 1; i++) {
                    if (password.charAt(i) == password.charAt(i + 1)) {
                        return false;
                    }
                }
                return true;
            }

            @Override
            public boolean hasNumbers(String password) {
                return false;
            }

            @Override
            public boolean hasSpecialCharacter(String password) {
                return false;
            }
        };
        // when
        boolean actual = tested.hasNoRepetitions("abc");
        // then
        Assertions.assertTrue(actual);
    }

    @Test
    void test_hasNumbers() {
        // given
        ITDD tested = new ITDD() {
            @Override
            public boolean hasGoodLength(String password) {
                return false;
            }

            @Override
            public boolean hasNoWhiteSpaces(String password) {
                return false;
            }

            @Override
            public boolean hasNoRepetitions(String password) {
                return false;
            }

            @Override
            public boolean hasNumbers(String password) {
                for (int i = 0; i < password.length(); i++) {
                    if (password.charAt(i) <= '9' && password.charAt(i) >= '0') {
                        return true;
                    }
                }
                return false;
            }

            @Override
            public boolean hasSpecialCharacter(String password) {
                return false;
            }
        };
        // when
        boolean actual = tested.hasNumbers("abc1");
        // then
        Assertions.assertTrue(actual);
    }

    @Test
    void test_hasSpecialCharacter() {
        // given
        ITDD tested = new ITDD() {
            @Override
            public boolean hasGoodLength(String password) {
                return false;
            }

            @Override
            public boolean hasNoWhiteSpaces(String password) {
                return false;
            }

            @Override
            public boolean hasNoRepetitions(String password) {
                return false;
            }

            @Override
            public boolean hasNumbers(String password) {
                return false;
            }

            @Override
            public boolean hasSpecialCharacter(String password) {
                String specials = "!.@-;”(){}[]?";
                for (int i = 0; i < password.length(); i++) {
                    for (int j = 0; j < specials.length(); j++) {
                        if (password.charAt(i) == specials.charAt(j)) {
                            return true;
                        }
                    }
                }
                return false;
            }
        };
        // when
        boolean actual = tested.hasSpecialCharacter("abc1.");
        // then
        Assertions.assertTrue(actual);
    }

}
