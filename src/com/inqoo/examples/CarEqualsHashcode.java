package com.inqoo.examples;

public class CarEqualsHashcode {

    String model;
    String engine;
    String color;
    int power;

    void drive() {

    }

    String honk() {
        return "BEEP!";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarEqualsHashcode car = (CarEqualsHashcode) o;

        if (power != car.power) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        if (engine != null ? !engine.equals(car.engine) : car.engine != null) return false;
        return color != null ? color.equals(car.color) : car.color == null;
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + (engine != null ? engine.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + power;
        return result;
    }
}