package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    private Pet pet;
    private String surname;
    private String age;
//    @Autowired
//    public Person(Pet pet){
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

//    public Person() {
//        System.out.println("Person bean is created");;
//    }
    @Autowired
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSurname() {
        System.out.println("Class Person: set surname");
        return surname;
    }

    public String getAge() {
        System.out.println("Class Person: set age");
        return age;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
