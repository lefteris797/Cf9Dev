package gr.aueb.cf.cf9.ch11;

/**
 * Java Bean
 * Data class with
 * -private data
 * Default Constractors
 * getters & setters
 */
public class Main {
    public static void main(String[] args) {

        Costumer customer = new Costumer(1L, "Gainnis", "Dimitriou", "5464", "695646216", "trikala",
                "trikalwn", "Thesalias", "Trikala", "Solwnos", "3", "lefteris@gmail.com");


        Product mik = new Product(1L,"Milko","Chocolate milk", 1,20, true);










        Student student = new Student();
        Student alice = new Student();
        Student bob = new Student();
        Student makis = new Student(3,"Makis","Kapetis");
        makis.setLastname("Xrisostomos");

        User andreas22 = new User(1L,"Andreas", "Papadopoulos", "andreas22", "aasa1", true);
        System.out.println(andreas22.getFirstname());

        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("Wonderland");

        bob.setId(2);
        bob.setFirstname("Bob");
        bob.setLastname("Dylan");

        System.out.println(makis.getId());
        System.out.println(makis.getFirstname());
        System.out.println(makis.getLastname());
        System.out.println(Student.getStudentsCount());

    }
}
