package com.pinkReasons;

import java.util.ArrayList;

public class SubListSum
{
    private ArrayList<Double> shoppingList;
    private double target;
    private ArrayList<Sublist> finalList;


    public SubListSum ( ArrayList<Double> orig, double tar )
    {
        shoppingList = orig;
        target = tar;
        finalList = new ArrayList<>();
        Sublist n = new Sublist(shoppingList);
        n.sublist(0);
        System.out.println(n);

    }


}
