package HW6;

public class Dog extends Pet {

    public Dog(String name, int age, String color, String breed, int weight) {
        super(name, age, color, breed, weight);
    }

    @Override
    void swim(int distance) {
        if (distance < 10) {
            super.swim(distance);
        } else {
            System.out.println("Sharik does not want to swim such distances!");
        }
    }

    @Override
    void run(int distance) {
        if (distance < 500) {
            super.run(distance);
        } else {
            System.out.println("Sharik does not want to run such distances!");
        }


    }
}
