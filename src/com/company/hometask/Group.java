package com.company.hometask;

public class Group {

    private Student[] students;

    public Group(Student[] students) {
        this.students = students;
    }

    public void printContractOnly() {
        for (Student student : students) {
            if (student instanceof ContractStudent) {
                ContractStudent cs = ((ContractStudent) student);
                System.out.println("Contract student called " + cs.getName() + " will pay " + cs.getCost());
            }
        }
    }

    public Student[] getStudents() {
        return students;
    }
}