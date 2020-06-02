package main.vo;

import java.util.ArrayList;

public class Number<T> {

    private ArrayList<T> number;

    public ArrayList<T> getNumber() {
        return number;
    }

    public void set(ArrayList<T> number) {
        this.number = number;
    }
}