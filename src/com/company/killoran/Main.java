package com.company.killoran;

import java.util.*;

import static java.util.Collections.sort;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Create 12 cookies
        Cookies cookie1 = new Cookies("Chocolate Chip", "large");
        Cookies cookie2 = new Cookies("Chocolate Chip", "large");
        Cookies cookie3 = new Cookies("Double Fudge", "large");
        Cookies cookie4 = new Cookies("Almond Chip", "large");

        //Create your own Assortment class that accepts cookie objects
        Assortment<Cookies> b = new Assortment<>();
        b.add(cookie1);
        b.add(cookie2);
        b.add(cookie3);
        b.add(cookie4);

        //Make cookies sortable by type
        Collections.sort(b);
        System.out.println(b);

        //Bonus** See if you can write a seperate gather method that collects
        //leftover uneaten cookies. Then display only the gathered cookies.
        b.gather(cookie2);
        b.gather(cookie3);
        b.getGathered();
    }
}
