public class Animal {

     String typeOfAnimal;
     String animalName;
     int age;

    public void eat() {
        System.out.println("I am eating!");

    }
    public void travel() {
        System.out.println("I like travelling!");
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.animalName = "Cat";
        animal1.typeOfAnimal = "Mammal";
        animal1.age = 5;

        animal1.eat();
        animal1.travel();
    }
}





