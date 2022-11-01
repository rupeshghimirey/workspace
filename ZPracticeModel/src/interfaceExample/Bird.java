package interfaceExample;

public class Bird implements Fly {
    @Override
    public void fly() {
        System.out.println("I can fly naturally!");
    }
}
