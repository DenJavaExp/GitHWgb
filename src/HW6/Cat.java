package HW6;

public class Cat extends Pet{


    public Cat(String name, int age, String color, String breed, int weight) {
        super(name, age, color, breed, weight);
    }

    @Override
    void run(int distance) {
        if (distance < 200) {
            super.run(distance);
        } else {
            System.out.println("Matroskin does not want to run such distances!");
        }
    }

    @Override
    void swim(int distance) {
        System.out.println("Matroskin can't swim!");
    }
}

