package HW5;

public class Person {

   private String name;
   private String post;
   private String email;
   private int phoneNumber;
   private double salary;
   private int age;


    public String toString() {
        return "Name: " + name + "\n" + "Post: "
                + post + "\n" + "email: " + email + "\n"
                + "Phone Number: " + phoneNumber + "\n"
                + "Salary: " + salary + "\n" + "Age: " + age;
    }

    public Person() {

    }

    public Person(String name, String post, String email,
                  int phoneNumber, double salary, int age)
    {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {

    }

    public void listEmployee() {

        System.out.println("Name: " + getName());
        System.out.println("Post: " + getPost());
        System.out.println("Email: " + getEmail());
        System.out.println("PhoneNumber: " + getPhoneNumber());
        System.out.println("Salary: " + getSalary());
        System.out.println("Age: " + getAge());

    }
}
