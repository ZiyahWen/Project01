package com.ziyah.java;

/**
 * @author ziyah
 * @date 2019-10-08-15:15
 */


public class Person {

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setid(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getid() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person person = new Person(001,"ziyah");
        System.out.println(person.toString());
    }

}
