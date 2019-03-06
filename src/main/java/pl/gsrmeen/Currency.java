package pl.gsrmeen;

public enum Currency {

    USD("USD"), //dolar
    PLN("PLN"), //zloty
    JPY("JPY"), //jen
    EUR("EUR"), //euro
    GBP("GBP"), //funt
    RUB("RUB"), //ruski rubel
    CZK("CZK"), //czeska korona
    HRK("HRK"); //kuna chorwacka


    private String name;

    Currency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
