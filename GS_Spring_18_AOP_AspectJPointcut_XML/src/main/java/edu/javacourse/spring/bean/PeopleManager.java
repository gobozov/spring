package edu.javacourse.spring.bean;

/**
 * Author: Georgy Gobozov
 * Date: 19.07.13
 */
public class PeopleManager {

    private String name;
    private  int number;

    public void createHuman(String name) throws IllegalArgumentException{
        if (name == null)
            throw new IllegalArgumentException("Name must be not null");
        System.out.println("Create human...");
    }

    public void deleteHuman(){
        System.out.println("Delete human...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
