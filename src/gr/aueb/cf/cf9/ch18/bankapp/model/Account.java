package gr.aueb.cf.cf9.ch18.bankapp.model;

import java.util.Objects;

public class Account {
    private String iban;
    private double balace;

    public Account(){}

    public Account(String iban, double balace) {
        this.iban = iban;
        this.balace = balace;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getBalace() {
        return balace;
    }

    public void setBalace(double balace) {
        this.balace = balace;
    }

    @Override
    public String toString() {
        return "Account{" +
                "iban='" + iban + '\'' +
                ", balace=" + balace +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Account account)) return false;
        return Objects.equals(this.getIban(), account.getIban());
    }

    @Override
    public int hashCode() {
        return Objects.hash(iban, balace);
    }
}
