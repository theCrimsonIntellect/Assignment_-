package com.pinkReasons;

import java.util.ArrayList;

public class SublistSumPracticeAshwin {

    public static void main(String[] args) {

        ArrayList<Double> masterlist = new ArrayList<>();
        masterlist.add(1.2);
        masterlist.add(3.2);
        masterlist.add(13.2);
        masterlist.add(1.22);
        masterlist.add(21.2);

        double targetVal = 13.75;


        ArrayList<ArrayList<Double>> col = new ArrayList<>();

        ArrayList<Double> init = new ArrayList<>();
        col.add(init);

//        Boolean timeToBreak = false;
    /*
    for (int i = 0; i < masterlist.size(); i++)
        {

            for (int j = i; j < col.size(); j++ )
            {
                double x = masterlist.get(i);

                ArrayList<Double> l_New = new ArrayList<>();

                ArrayList<Double> l_Old = new ArrayList<>();

                l_Old = col.get(j);
//                System.out.println(l_Old);

//                ArrayList<Double> l_New = new ArrayList<>();

//                l_Old = col.get(j);

                if ( findSum(l_Old) + x <= targetVal) {

//                    l_Old.add(x);
                    l_New = l_Old;
                    l_New.add(x);

                    col.add(l_New);

                }
                else if ( findSum(l_Old) + x == targetVal) {
                    break;
                }
            }
            System.out.println(col);

        }


     */





     }

    public static double findSum ( ArrayList<Double> list)
    {
        double sum = 0;

        for (int i = 0; i < list.size(); i++)
        {
            sum = sum + list.get(i);
        }

        return sum;
    }
}
