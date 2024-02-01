package pj.pjwstk.s22775MPRpoprawa;

public class Klient {
    private String name;
    private double balance;

    public Klient(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

}
