/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posfixcalc;

import java.util.ArrayList;

/**
 *
 * @author Sebastián
 * @param <T>
 */
public class StackArrayList<T> implements IStack<T> {

    private ArrayList<T> data;

    public StackArrayList() {
        data = new ArrayList<>();
    }

    @Override
    public void push(T value) {
        data.add(0, value);
    }

    @Override
    public T pull() {
        if (this.isEmpty()) {
            return null;
        } else {
            return data.remove(0);
        }
    }

    @Override
    public T peek() {
        if (this.isEmpty()) {
            return null;
        } else {
            return data.get(0);
        }
    }

    @Override
    public int count() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

}
