package org.example;

public class Main {
    public static void main(String[] args) {
       UserService.saveTodb(new User(38,"Anton2"));
        System.out.println("Hello world!");
        PrintService.print();
    }
}