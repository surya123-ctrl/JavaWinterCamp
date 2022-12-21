package Assignment2Solution;//package winter_term_java;

public abstract class GetDetails{
    void Intro(){
        System.out.println("Please Enter your details : ");
    }
    abstract void Name();
    abstract void Age();
    abstract void Gender();
    abstract void PhoneNum();
    abstract void Address();
}
