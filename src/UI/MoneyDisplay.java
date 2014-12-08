
package UI;

import Model.Money;


public class MoneyDisplay {
    public void execute(Money money_out) {
        System.out.println(money_out.getAmount() + " " + money_out.getCurrency().getSymbol());
    }
}