package HW5;

public class Employee {

    public static void main(String[] args) {

        Person[] persArray = new Person[5];

        persArray[0] = new Person("Карась Борис Григорьевич", "Инженер",
                "Karas@mail.ru", 123456, 30000, 30);
        persArray[1] = new Person("Пескарь Антон Владимирович", "токарь",
                "Peskar@mail.ru", 234567, 25000, 25);
        persArray[2] = new Person("Плотва Андрей Васильевич", "слесарь",
                "Plotva@mail.ru", 345678, 25000, 45);
        persArray[3] = new Person("Язь Виталий Николаевич", "плотник",
                "Yz@mail.ru", 456789, 23000, 56);
        persArray[4] = new Person("Лещ Петр Геннадьевич", "механик",
                "Lesh@mail.ru", 567890, 27000, 38);

        System.out.println("LIST OF EMPLOYEES OF THE ORGANIZATION: " + "\n");

        for (Person value : persArray) {
            System.out.println(value);
        }
        System.out.println();

        System.out.println("EMPLOYEES OVER 40 YEARS OLD: " + "\n");

        for (Person person : persArray) {

            if (person.getAge() > 40)
                System.out.println(person + "\n");

        }
    }
}



