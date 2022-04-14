package com.company.killoran;


import java.util.*;

public class Assortment <E> extends ArrayList<E>{


    ArrayList<E> a = new ArrayList<>();

    public void gather(E element){
        a.add(element);
    }


    @Override
    public String toString() {
        return super.toString();
    }

    //challenge would be to getgathered items. Maybe cookies that were not eaten
    public void getGathered(){
        for(E item: a){
            System.out.println(item);
        }
    }
}
