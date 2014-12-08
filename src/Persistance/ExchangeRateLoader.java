
package Persistance;

import Model.Currency;
import Model.ExchangeRate;

public class ExchangeRateLoader {
    public ExchangeRate load(Currency from, Currency to, double rate) {
        //ExchangeRate exchangeRate = new ExchangeRate(from, to, rate);
        return new ExchangeRate(new Currency("Euro", "€", "EUR"),new Currency("Libra", "£", "GBP"), rate);
    }
}