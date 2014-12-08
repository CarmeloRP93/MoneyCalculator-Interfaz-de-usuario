
package Process;

import Model.ExchangeRate;
import Model.Money;

public class Exchanger {
    public Money exchange(Money money_in, ExchangeRate exchangeRate) {
        Money money_out = new Money(money_in.getAmount() * exchangeRate.getRate(), exchangeRate.getTo());
        return money_out;
    }
}