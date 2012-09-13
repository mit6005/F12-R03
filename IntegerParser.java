public class IntegerParser {
    // wat do?
    public static int parseInt1(String intString, int base) {
        int number = 0;
        int nextVal = 0;
        for (int i = 0; i < intString.length(); i++) {
            char nextChar = intString.charAt(i);
            if ('0' <= nextChar && nextChar <= '9') {
                nextVal = nextChar - '0';
            } else if ('a' <= nextChar && nextChar <= 'z') {
                nextVal = 10 + nextChar - 'a';
            } else if ('A' <= nextChar && nextChar <= 'A') {
                nextVal = 10 + nextChar - 'A';
            }
            number = number * base + nextVal;
        }
        return number;
    }

    // wat do?
    public static int parseInt2(String intString, int base) {
        int number = 0;
        for (int i = 0; i < intString.length(); i++) {
            char nextChar = intString.charAt(i);
            int nextVal = 0;
            if ('0' <= nextChar && nextChar <= '9') {
                nextVal = nextChar - '0';
            } else if ('a' <= nextChar && nextChar <= 'z') {
                nextVal = 10 + nextChar - 'a';
            } else if ('A' <= nextChar && nextChar <= 'A') {
                nextVal = 10 + nextChar - 'A';
            } else {
                // Not a number character.
                return -1;
            }

            // Number too large for base.
            if (nextVal >= base) {
                return -1;
            }
            number = number * base + nextVal;
        }
        return number;
    }

    // wat do?
    public static int parseInt3(String intString, int base) {
        int number = 0;
        for (int i = 0; i < intString.length(); i++) {
            char nextChar = intString.charAt(i);
            int nextVal = 0;
            if ('0' <= nextChar && nextChar <= '9') {
                nextVal = nextChar - '0';
            } else if ('a' <= nextChar && nextChar <= 'z') {
                nextVal = 10 + nextChar - 'a';
            } else if ('A' <= nextChar && nextChar <= 'A') {
                nextVal = 10 + nextChar - 'A';
            } else {
                throw new NumberFormatException(String.format(
                            "Non-number character!  char %d: %s", i, nextChar));
            }

            // Number too large for base.
            if (nextVal >= base) {
                throw new NumberFormatException(String.format(
                            "Number character too large!  char %d: %s", i, nextChar));
            }
            number = number * base + nextVal;
        }
        return number;
    }
}
