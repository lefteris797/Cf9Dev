package gr.aueb.cf.cf9.ch15;

public class Main {
    public static void main(String[] args) {
        ISpeakable boby = new Dog("boby", 3);
        ISpeakable roxy = new Cat("Roxy");
        boby.speak();
        roxy.speak();
    }
    public static void doSpeak(ISpeakable iSpeakable){
        iSpeakable.speak();
    }

}

