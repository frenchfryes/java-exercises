package Java2;

/**
 * Created by frenchfryes on 5/16/17.
 */
public class person {

    private String name;

    public person(String name){
        this.setName(name);
    }

    // returns the person's name
    public String getName() {
        return name;
    }

    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    }

    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.println("Hello, " + this.getName());
    }

    public static void main(String[] args) {
        person derek = new person("Derek");
        derek.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        person person1 = new person("Bill");
        person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Ann");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }

}

