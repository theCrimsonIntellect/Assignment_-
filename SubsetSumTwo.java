package com.pinkReasons;

import java.util.ArrayList;

public class SubsetSumTwo {

    private double budget;
    private ArrayList<Double> shoppingList;

    public double sum = 0;

    private ArrayList<Double> sublist;

    private ArrayList<Double> sublist2;

    private ArrayList<Double> temp;


    private ArrayList<ArrayList<Double>> finalList;


    public ArrayList<ArrayList<Double>> findSebset (ArrayList<Double> list, double target) {
        shoppingList = list;
        budget = target;

//        ArrayList<Double> current = sublistMaker(0);
        finalList = new ArrayList<>();
//        finalList.add(current);
//        System.out.println(current);

        for (int i = 0; i < shoppingList.size(); i++)
        {
            ArrayList<Double> current = sublistMaker(i);
            finalList.add(current);

        }



        sublist = new ArrayList<>();
        sublist.add(shoppingList.get(0));

        sublist2 = new ArrayList<>();
        sublist2.add(shoppingList.get(0));
        sublist2.add(shoppingList.get(1));

        finalList = new ArrayList<>();

        if ( findSum(sublist) <= budget && findSum(sublist2) <= budget)
        {
            finalList.add(sublist);
            finalList.add(sublist2);
        }

        return finalList;

    }

    public ArrayList<Double> sublistMaker(int index )
    {
        temp = new ArrayList<>();
        temp.add(shoppingList.get(index));
//        System.out.println(temp);
        return temp;
    }

//    public String toString()
//    {
//        String result = "";
//        for (int i = 0; i <= finalList.size(); i++)
//            result += finalList.get(i).get(i).toString();
//        return result;
//
//    }

    public void showShoppingList()
    {
        for (ArrayList<Double> k: finalList) {
            System.out.println(k);
        }

    }

    public double addItem (int index )
    {
        double item = shoppingList.get(index);

        return item;
    }

    public double findSum ( ArrayList<Double> list)
    {

        for (int i = 0; i < list.size(); i++)
        {
            sum = sum + list.get(i);
        }

        return sum;
    }


}
