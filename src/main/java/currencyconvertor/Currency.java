package currencyconvertor;

import java.util.Locale;
import java.util.Objects;

/** Represents a currency such as GBP and exposes its code and decimal precision. */
public final class Currency {
    // Keep Java's currency object private and assign it once during construction.
    private final java.util.Currency currency;

    /** Creates a currency from a code such as "gbp" or "GBP". */
    public Currency(String code) {
        // Remove surrounding spaces and uppercase the code independently of the system locale.
        String normalizedCode = Objects.requireNonNull(code, "code").trim().toUpperCase(Locale.ROOT);
        // Java looks up the currency and rejects unrecognized codes.
        currency = java.util.Currency.getInstance(normalizedCode);
    }

    /** Returns the standard currency code, such as GBP. */
    public String getCode() {
        return currency.getCurrencyCode();
    }

    /** Returns the usual decimal places, or -1 when Java defines no default. */
    public int getFractionDigits() {
        return currency.getDefaultFractionDigits();
    }
}
