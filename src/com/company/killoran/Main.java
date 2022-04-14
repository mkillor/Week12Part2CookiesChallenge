package com.company.killoran;

import java.util.*;

import static java.util.Collections.sort;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cookies cookie1 = new Cookies("Chocolate Chip", "large");
        Cookies cookie2 = new Cookies("Chocolate Chip", "large");
        Cookies cookie3 = new Cookies("Double Fudge", "large");
        Cookies cookie4 = new Cookies("Almond Chip", "large");

       Assortment<Cookies> b = new Assortment<>();
        b.gather(cookie1);
        b.gather(cookie2);
        b.gather(cookie3);
        b.gather(cookie4);
        Collections.sort(b);
        System.out.println(b);
    }
}
