package gr.aueb.cf.cf9.ch15;

public class GenericSpeakingSchool {
    private final ISpeakable iSpeakable;

//Dependency Injection
//IoC - Inversion of Control
public GenericSpeakingSchool(ISpeakable iSpeakable){
    this.iSpeakable = iSpeakable;
}
public void speak(){
    iSpeakable.speak();
    }
}


