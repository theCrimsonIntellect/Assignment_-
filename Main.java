package com.pinkReasons;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args)
    {

        int target = 10;

        ArrayList<Double> ml = new ArrayList<>();

        ml.add(1.1); ml.add(2.3); ml.add(3.2);
        ml.add(4.1); ml.add(5.3); ml.add(6.2);

        System.out.println("This is ArrayList " + ml);

//        List<Double> subList = ml.subList(0, 2);
//        System.out.println("This is a sublist of ml using sublist(): " + subList);

        List<List<Double>> col = new ArrayList<>();
//        ArrayList<List> col = new ArrayList<>();

        col.add(new ArrayList<>(0));
        System.out.println("col is initialized with an empty sublist: " + col);

//        col.add(subList);
        System.out.println("The above sublist is added to the col " + col);


        int size = ml.size();

        for (int i = 0; i <= size; i++)
        {
            for (int j = i; j <= size; j++)
            {
                List<Double> sublist_2 = ml.subList(i,j);
                if (!sublist_2.isEmpty() && sum(sublist_2) <= target) col.add(sublist_2);
            }
        }
        System.out.println("All the possible sublists in col " + col);
        System.out.println(max(col));
        List<Double> test =  max(col);
        System.out.println(test);

        Collections.sort(ml);
        double[] arr = new double[ml.size()];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = ml.get(i);
        }

        for (double d : arr)
        {
            System.out.println(d);
        }

        double[] randomArr = {1.1,2.1,3.1};

        List<Double> curr = Arrays.stream(randomArr).boxed().collect(Collectors.toList());

        for (Double d : curr)
        {
            System.out.println("[" + d + "]");
        }

        ArrayList<Double> groceryPrices = new ArrayList<>();
        groceryPrices.add(0,1.50);
        groceryPrices.add(1,2.50);
        groceryPrices.add(2,3.50);

        double budget = 5;

        System.out.println(groceryPrices);
//
//        ArrayList<Double> sublist = new ArrayList<>(groceryPrices.subList(0, 2));
//        System.out.println("sublist of the grocery prices: " + sublist);

        ArrayList<ArrayList<Double>> groceryCollection = new ArrayList<>();
        groceryCollection.add(new ArrayList<>(0));
//
//        if (finsSum(sublist) < 5)
//        {
//            System.out.println("the sum of the sublist is: " + finsSum(sublist));
//            groceryCollection.add(0, sublist);
//            System.out.println("affordable grocery list is: " + groceryCollection);
//        }
//        else
//            System.out.println("you cannot afford anything yet!");


        int sentinelSize = groceryPrices.size();
        for (int i = 0; i <= sentinelSize; i++)
        {
            for (int j = i; j <= sentinelSize; j++)
            {
                ArrayList<Double> sl = new ArrayList<>(groceryPrices.subList(i,j));
                if (!sl.isEmpty() && sum(sl) <= budget)
                    groceryCollection.add(sl);
            }
        }
        System.out.println("final list" + groceryCollection);
























//
//        int previousColSize = col.size();
//
//        for (int i = 0; i < ml.size(); i++)
//        {
//            for (int j = 0; j < previousColSize; j++)
//            {
//                double x = ml.get(i);
//
//                if ( sum(col.get(j)) + x <= target )
//                {
//                    ArrayList<Double> L;
//                    L = (ArrayList<Double>) col.get(j);
//                    double[] old_L = new double[col.get(j).size()];
//                    old_L = toArray(L);
//                    Double[] new_L = new Double[col.get(j).size() + 1];
//                    System.arraycopy(old_L, 0, new_L, 0, old_L.length);
//                    new_L[col.get(j).size() + 1] = x;
//                    List al = Arrays.asList(new_L);
//                    col.add(al);
//
//                }
//            }
//            System.out.println(col);
//        }















//
//        for (int i = 0; i < ml.size(); i++)
//        {
//            int prevColSize = col.size();
//            System.out.println(prevColSize);
//
//            for (int j = 0; j < prevColSize; j++)
//            {
//                ArrayList<Double> temp = new ArrayList<>();
//
//                List<Double> currentSubListInCol = col.get(j);
//
////                System.arraycopy(currentSubListInCol.toArray()[j], 0, temp.toArray()[j], 0, currentSubListInCol.toArray().length);
//
//                if ( findSum(temp) + ml.get(i) <= target )
//                {
//                    temp.add(ml.get(i));
//                    col.add(temp);
//
//                }
//
//            }
//        }
//        System.out.println(col);




    }// end of main

    public static ArrayList<Double> findMax(ArrayList<ArrayList<Double>> l)
    {
        double max = findSum(l.get(0));
        ArrayList<Double> finalSublist = null;

        for (int i = 0; i < l.size(); i++)
        {
            if (findSum(l.get(i)) > max)
                max = findSum(l.get(i));
        }

        for (int j = 0; j < l.size(); j++)
        {
            if ( findSum(l.get(j)) == max )
                finalSublist = l.get(j);
        }
        return finalSublist;
    }
    public static List<Double> max(List<List<Double>> list)
    {
        double maxSum = sum(list.get(0));
        List<Double> bestSubsetSum = null;

        for (int i = 0; i < list.size(); i++)
        {
            if (sum(list.get(i)) > maxSum)
                maxSum = sum(list.get(i));
        }

        for (int j = 0; j < list.size(); j++)
        {
            if (sum(list.get(j)) == maxSum)
                bestSubsetSum = list.get(j);
        }

        return bestSubsetSum;
    }



    public static double sum (List<Double> list)
    {
        double sum = 0;

        for (int i = 0; i < list.size(); i++)
        {
            sum = sum + list.get(i);
        }

        return sum;
    }


    public static double[] toArray(ArrayList<Double> arrList)
    {
        double[] arr = new double[arrList.size()];

        for (int i = 0; i < arrList.size(); i++)
        {
            arr[i] = arrList.get(i);
        }

        return arr;
    }

    public static ArrayList<Double> toArrayList(double[] arr)
    {
        ArrayList<Double> current = new ArrayList<>(arr.length);

        for (int i = 0; i < current.size(); i++)
        {
            current.add(i, arr[i]);
        }
        return current;
    }

    public static double findSum(ArrayList<Double> al)
    {
        double sum = 0;
        for (int i = 0; i < al.size(); i++)
        {
            sum += al.get(i);
        }
        return sum;
    }

}// end of class





    /*
    int[] values = {3,5,6,3,3};
        ArrayList<Integer> subset_1 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> finalList = new ArrayList<>();

        subset_1.add(values[0]);
        subset_1.add(values[1]);
        subset_1.add(values[2]);
        System.out.println(subset_1);
        System.out.println(findSum(subset_1));
        if ( findSum(subset_1) <= 10 )
            finalList.add(subset_1);
        else System.out.println("Not qualified");




        finalList.add(subset_1);
        System.out.println(finalList);

        ArrayList<Integer> subset_2 = new ArrayList<>();
        subset_2.add(values[2]);
        subset_2.add(values[3]);
        subset_2.add(values[4]);
        System.out.println(subset_2);
        finalList.add(subset_2);
        System.out.println(finalList);

    }

    public static int findSum(ArrayList<Integer> list) {
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        return sum;
    }

     */