package pl.gsrmeen;

import java.util.HashMap;
import java.util.Map;

public class ExchangeOffice {


    private Map<Currency, Double> availableFunds;

    public ExchangeOffice(double startFunds) {
        this.availableFunds = new HashMap<>();
        for (Currency c : Currency.values()) {
            System.out.print(c + ","); //oteracja po enum - waluty posiadane
            availableFunds.put(c, startFunds); //zasialmy kazda walute o srodki pieniezne
        }
        System.out.println();
    }


    public void showFunds() { //ilosc zasobow poszczegolnej waluty

        System.out.print("Current funds: ");

        for (Map.Entry<Currency, Double> entry : availableFunds.entrySet()) { //iteracja po mapie 2 krótszy sposób

            Currency key = entry.getKey(); //1 sposob
            Double value = entry.getValue(); //1 sposob

            System.out.print(value + " " + key.getName() + "   ");
         //   System.out.print(entry.getValue() + " " + entry.getKey().getName() + "   "); //2 sposob - krótszy. nie inicjalizujemy obiektów
        }
        System.out.println();
    }


    public void exchange(double amount, Currency from, Currency to) {
        double available = availableFunds.get(to); //szukamy po kluczu Currency
        double needed = amount * 0.8 * CurrencyConverter.convert(from, to);

        if (available >= needed) { //jesli mamy srodki to dokonujemy transakcji
            availableFunds.put(from, availableFunds.get(from) + amount);
            availableFunds.put(to, availableFunds.get(to) - needed);

            System.out.println("Exchanging " + amount + " " + from.getName() + " to " + needed + " " + to.getName());
        } else {
            System.out.println("Cannot exchange " + amount + " " + from.getName() + " to " + needed + " " + to.getName() + " : insufficient funds.");
        }
    }


}
