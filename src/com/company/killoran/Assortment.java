package com.company.killoran;


import java.util.*;
import java.util.function.Consumer;

public class Assortment <E> extends ArrayList<E>{

    ArrayList <E> a = new ArrayList<>();

    public void gather(E element){
        a.add(element);
    }


    @Override
    public String toString() {
        return "Assortment{" +
                "a=" + a +
                '}';
    }
}
