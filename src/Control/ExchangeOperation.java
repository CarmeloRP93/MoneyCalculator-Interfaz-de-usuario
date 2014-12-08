package Control;

import Model.Currency;
import Model.ExchangeRate;
import Model.Money;
import Persistance.ExchangeRateLoader;
import Process.Exchanger;
import UI.MoneyDisplay;

public class ExchangeOperation {
    
    private Currency from, to;
    double rate = 0.79;
    Money money_from = new Money(1, from);
    
    public ExchangeOperation() {}
    
    public void execute() {
        readMoney();
        Money money_out = operation_exchange();
        new MoneyDisplay().execute(money_out);
    }
    
    private ExchangeRate readMoney() {
        return new ExchangeRateLoader().load(from, to, rate);
    }
    
    private Money operation_exchange() {
        return new Exchanger().exchange(money_from, readMoney());
    }  
}