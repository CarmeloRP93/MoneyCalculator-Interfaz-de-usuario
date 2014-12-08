
package Persistance;

import Model.Currency;
import Model.CurrencySet;

public class CurrencySetLoader {
        public void load() {
            CurrencySet currencySet = new CurrencySet();
            currencySet.add(new Currency("Euro", "€", "EUR"));
            currencySet.add(new Currency("Dolar", "$", "USD"));
            currencySet.add(new Currency("Libra", "£", "GBP"));
        }
}