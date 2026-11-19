package currencyconvertor;

import java.math.BigDecimal;

/** Stores the inputs, exchange rate, and result of a completed conversion. */
public final class Conversion {
    // Private final fields keep the conversion details fixed after construction.
    private final Currency source;
    private final Currency target;
    private final BigDecimal originalAmount;
    private final BigDecimal exchangeRate;
    private final BigDecimal convertedAmount;

    // Package-private access lets the conversion engine construct results.
    Conversion(Currency source, Currency target, BigDecimal originalAmount,
               BigDecimal exchangeRate, BigDecimal convertedAmount) {
        this.source = source;
        this.target = target;
        this.originalAmount = originalAmount;
        this.exchangeRate = exchangeRate;
        this.convertedAmount = convertedAmount;
    }

    /** Returns the currency of the original amount. */
    public Currency getSource() {
        return source;
    }

    /** Returns the currency of the converted amount. */
    public Currency getTarget() {
        return target;
    }

    /** Returns the amount supplied by the caller. */
    public BigDecimal getOriginalAmount() {
        return originalAmount;
    }

    /** Returns the rate applied, in target units per source unit. */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /** Returns the final amount expressed in the target currency. */
    public BigDecimal getConvertedAmount() {
        return convertedAmount;
    }
}
