package Assignment2Solution;

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
