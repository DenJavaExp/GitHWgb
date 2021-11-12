package HW6;

public class Director {

    public static int count;
//    public Director() {
//        count++;
//    }

    public static void main(String[] args) {

        Cat cat =  new Cat ("Matroskin", 2, "yellow", "british", 10);
        Dog dog = new Dog ("Sharik", 3, "red", "beagle", 11);

        //System.out.println(count);


        cat.run(300);
        dog.run(600);

        dog.swim(10);
        cat.swim(0);

    }
}
