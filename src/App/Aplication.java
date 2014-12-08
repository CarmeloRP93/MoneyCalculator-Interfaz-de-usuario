
package App;

import Control.ExchangeOperation;
import Persistance.CurrencySetLoader;

public class Aplication {
    
    public static void main(String[] args) {
        new CurrencySetLoader().load();
        new ExchangeOperation().execute();
    }
}