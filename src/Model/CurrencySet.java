package Model;

import java.util.Map;
import java.util.HashMap;

public class CurrencySet {
    private final Map<String, Currency> map;

    public CurrencySet() {
        map = new HashMap<>();
    }

    public Map<String, Currency> getMap() {
        return map;
    }
    
    public void add(Currency currency) {
        map.put(currency.getName(), currency);     
    }
    
    public int size() {
        return map.size();
    }
}