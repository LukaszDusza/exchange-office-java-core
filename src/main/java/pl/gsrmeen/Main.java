package pl.gsrmeen;

public class Main {

    public static void main(String[] args) {
        ExchangeOffice exchangeOffice = new ExchangeOffice(1000);

        System.out.println();

        exchangeOffice.exchange(1000, Currency.PLN, Currency.EUR);
        exchangeOffice.showFunds();

        System.out.println();

        exchangeOffice.exchange(200, Currency.EUR, Currency.PLN);
        exchangeOffice.showFunds();


        System.out.println();

        exchangeOffice.exchange(100, Currency.PLN, Currency.RUB);
        exchangeOffice.showFunds();

        System.out.println();

        exchangeOffice.exchange(100, Currency.JPY, Currency.USD);
        exchangeOffice.showFunds();
    }
}
