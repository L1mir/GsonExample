package com.example.gson;

import com.google.gson.Gson;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);

        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println("JSON: " + json);

        Person personFromJson = gson.fromJson(json, Person.class);
        System.out.println("Person name: " + personFromJson.name + ", age: " + personFromJson.age);
    }
}
