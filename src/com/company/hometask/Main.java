package com.company.hometask;

public class Main {

    public static void main(String[] args) {

        Student[] students = {
                new Student("Nick", 20),
                new Student("Mark", 21),
                new ContractStudent("Linus", 19, 20000)
        };

        Group g = new Group(students);
        g.printContractOnly();
    }

}
