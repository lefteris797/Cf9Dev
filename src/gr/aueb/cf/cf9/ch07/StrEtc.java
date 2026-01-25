package gr.aueb.cf.cf9.ch07;

public class StrEtc {
    public static void main(String[] args) {
        String s = "Coding Factory";
        for (char ch : s.toCharArray()){
            System.out.print(ch + " ");
        }
        System.out.println("\u2764");

        String firstname = "Maria-Helen";
        String simplename = firstname.replace("-", " ");
        System.out.println(simplename);

        String lastname = "Smith";
        String fullname1 = firstname.concat(" ").concat(lastname);
        String fullname2 = firstname + " " + lastname;
    }
}
