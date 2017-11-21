package common;

import java.util.Set;
import java.util.TreeSet;

public class SortLab {
    public static void main(String[] args) {
        Set<Dog> dogSet = new TreeSet<>();
        dogSet.add(new Dog("Sasha", 1,"555"));
        dogSet.add(new Dog("Mikey",10,"777"));
        dogSet.add(new Dog("Cooper",7,"888"));
        dogSet.add(new Dog("Sammy", 14, "555"));
        for(Dog dog : dogSet) System.out.println(dog);
    }
}
