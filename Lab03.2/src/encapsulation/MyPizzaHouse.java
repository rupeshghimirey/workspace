package encapsulation;

public class MyPizzaHouse {

    //business logic
    public void makePizza(){
        prepare();
        addToppings();
        bake();
    }

    private void prepare() {
        System.out.println("Preparing Pizza!!!");
    }

    private void addToppings() {
        System.out.println("Adding Toppings...");
    }

    private void bake() {
        System.out.println("Baking...");
    }

}
