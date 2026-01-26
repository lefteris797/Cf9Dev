package gr.aueb.cf.cf9.ch13;

/**
 * Singleton Design Pattern
 */
public class OnlyOneCodingFactoruy {
    //Eager Initialization
    private final static OnlyOneCodingFactoruy instance = new OnlyOneCodingFactoruy();

    private  OnlyOneCodingFactoruy(){}

    public static OnlyOneCodingFactoruy getInstance(){
        return instance;
    }

    public void doSomething(){
        System.out.println("I am doing something");
    }
}
