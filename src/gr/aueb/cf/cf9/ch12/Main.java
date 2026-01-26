package gr.aueb.cf.cf9.ch12;

public class Main {
    public static void main(String[] args) {
        Account lefterisAcoount = new Account(1l, "G4234234", "Leferis", "Nikolos", "A12344", 2000);

        try {
        lefterisAcoount.deposit(500);
        System.out.println(lefterisAcoount.accountToString());

        lefterisAcoount.withdraw(100, "A12345");
        System.out.println(lefterisAcoount.accountToString());

        lefterisAcoount.withdraw(120, "123232");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
