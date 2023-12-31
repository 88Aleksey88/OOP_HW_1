package org.example;

public class Cat {
    private String name;
    private Integer age;
    private Owner owner;

    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void greet(){
        System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет)." + " Мой владелец - " + owner);
    }
}
