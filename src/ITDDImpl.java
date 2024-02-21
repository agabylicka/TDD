public class ITDDImpl implements ITDD{
    @Override
    public boolean hasGoodLength(String password) {
        if (password.length() >= 12) {
            return true;
        }
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
        for (int i = 0; i < password.length() - 1; i++) {
            if (password.charAt(i) == password.charAt(i + 1)) {
                return false;
            }
        }
        return true;
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
}
