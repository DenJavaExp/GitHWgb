package HW6;

public class Pet {

    private static int counter;
    protected String name;
    protected int age;
    protected String color;
    protected String breed;
    protected int weight;



    public Pet(String name, int age, String color, String breed, int weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.weight = weight;
        counter++;

    }

    public static int getNumInstances() {
        return counter;
    }

    //    void printCounter() {
//        System.out.println(this.countr);
//    }
    void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м");
    }

    void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " м");
    }


}
