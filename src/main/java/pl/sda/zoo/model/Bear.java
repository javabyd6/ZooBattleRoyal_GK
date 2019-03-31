package pl.sda.zoo.model;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public abstract class Bear extends Animal {


    public Bear(boolean alive, int weight) {
        super(alive, weight);
    }

    public LocalDate getMealDay() {
        LocalDate mealDay = this.mealDay;
        return mealDay;
    }

    public boolean isBearAlive() {

        long between = DAYS.between(mealDay, LocalDate.now());

        if (between > 10) {
            System.out.println("Mis nie zyje!");
            return false;
        }
        return true;
    }

    public void eat(LocalDate eatingTime) {

            setMealDay(eatingTime);
            System.out.println("mlask, mlask");

        }


    public String attack (){

    return "ten mis zabija";
    }

}