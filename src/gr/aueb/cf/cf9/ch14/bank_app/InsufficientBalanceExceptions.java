package gr.aueb.cf.cf9.ch14.bank_app;

public class InsufficientBalanceExceptions extends  Exception {

public InsufficientBalanceExceptions(String message){
    super(message);
}
}
