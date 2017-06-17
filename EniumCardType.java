import java.util.regex.Pattern;

/**
 * Created by Emre Vatansever on 17.06.2017.
 */

public enum EniumCardType {

    UNKNOWN,
    VISA("^4[0-9]{12}(?:[0-9]{3})?$"),
    MASTERCARD("^5[1-5][0-9]{14}$");

    private Pattern pattern;

    EniumCardType() {
        this.pattern = null;
    }

    EniumCardType(String pattern) {
        this.pattern = Pattern.compile(pattern);
    }

    public static EniumCardType detect(String cardNumber) {

        for (EniumCardType cardType : EniumCardType.values()) {
            if (null == cardType.pattern) continue;
            if (cardType.pattern.matcher(cardNumber).matches()) return cardType;
        }

        return UNKNOWN;
    }
}
