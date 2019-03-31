package pl.sda.zoo.model;

import java.time.LocalDate;

public abstract class Animal {
    private boolean alive;
    private int weight;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getMealDay() {
        return mealDay;
    }

    public LocalDate mealDay;


    public void setMealDay(LocalDate mealDay) {
        this.mealDay = mealDay;
    }

    public Animal(boolean alive, int weight) {
        this.alive = alive;
        this.weight = weight;
    }

    public Animal(boolean alive, int weight, LocalDate mealDay) {
        this.alive = alive;
        this.weight = weight;
        this.mealDay = mealDay;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public void display () {
        System.out.println("Nazywam sie " + this.getId() + "a moja rasa to " + getClass().getSimpleName());
    }


}
