package com.gk.imperative;

import java.nio.file.attribute.GroupPrincipal;
import java.util.ArrayList;
import java.util.List;


//testCommit
public class ImperativeApproach {
    public static void main(String[] args) {
        List<Person> people = List.of (
            new Person("Gopi", Gender.MALE),
            new Person("Krishna", Gender.MALE),
            new Person("abc", Gender.FEMALE),
            new Person("xyz", Gender.FEMALE),
            new Person("mnop", Gender.FEMALE)
        );
        //Imperative Approach
        System.out.println("Imperative Approach");
        List<Person>females=new ArrayList<>();
        for (Person person : people) {
            if(Gender.FEMALE.equals(person.gender))
            {
                females.add(person);
            }
            
        }
        for (Person female : females) 
        {
            System.out.println(female);
        } 
        
        //Declarative Approach
        System.out.println("Declarative Approach");
        people.stream()
                .filter(person->Gender.FEMALE.equals(person.gender))
                .forEach(System.out::println);
        
    }
    
static class Person {

    private final String name;
    private final Gender gender;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public Gender getGender() {
        return gender;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", gender=" + gender + "]";
    }
    

}
enum Gender{
    MALE,FEMALE;
}
}
