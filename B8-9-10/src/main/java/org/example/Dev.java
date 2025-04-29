package org.example;

public class Dev {

    private Laptop laptop;
    private int age;
    public Dev() {
        System.out.println("Dev is created");
    }

    public Dev(int age) {
        this.age = age;
        System.out.println("Dev is created with age");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build(){
        System.out.println("Working awesome project");
        laptop.compile();
    }
}
