package com.pinkReasons;


import java.util.ArrayList;

/**
 * one object of Sublist class is a sublist of the master list.
 */
public class Sublist
{
    private int sum = 0;                                                                   // stores sum of each sublist
    private ArrayList<Double> originalObjects;
    private ArrayList<Double> sublist;                                        // indices of the elements in master list

    public Sublist ( ArrayList<Double> orig )
    {
        sum = 0;
        originalObjects = orig;
        sublist = new ArrayList<>();
    }

    public ArrayList<Double> sublist ( int index )
    {
        sublist.add(originalObjects.get(index));
        return sublist;

    }

    public void showList()
    {
        System.out.println(sublist);
    }



}


