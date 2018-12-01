package com.pinkReasons;
import java.util.ArrayList;

public class PracticeSubset {
    public static void main(String[] args)
    {
        double targetVal = 10;
        int counter = 0;

        ArrayList<Double> s = new ArrayList<>();                                                 // master/original list

        ArrayList<ArrayList<Double>> col = new ArrayList<>();                       // final list of qualified sub lists

        ArrayList<Double> initializer = new ArrayList<>();                         // initialize col with empty sub list

        initializer.add(0.0);
        col.add(initializer);
//        System.out.println(col);                                                                              // [[0.0]]

        // populate original list
        s.add(2.1);
        s.add(3.1);
        s.add(4.1);
        s.add(5.1);

        ArrayList<Double> list = new ArrayList<>();
        list.add(4.1);
        list.add(3.3);
        System.out.println(list);
        col.add(list);
        System.out.println(col);
        col.get(1).add(s.get(2));
        System.out.println(col);

        ArrayList<ArrayList<Double>> t = new ArrayList<>();
        for (int i = 0; i < s.size(); i++)
        {
            for (int j = i; j < col.size(); j++)
            {
                if ( findSum(col.get(j)) + s.get(j) <= targetVal)
                {
                    col.get(j).add(s.get(j));
                    t.add(col.get(j));
                    col.add(t.get(j));
                }
                else break;

            }
        }




//        for (int i = 0; i < s.size(); i++)
//        {
//            ArrayList<Double> t = new ArrayList<>();
//
//            for (int j = i; j <= col.size(); j++)
//            {
//                if (findSum(col.get(j)) + s.get(i) <= targetVal) {
//                    t.add(s.get(counter));
//                    col.add(t);
//                    counter++;
//                }
//                else
//                    break;
//            }
//        }
//        System.out.println(col);
//
//

//        ArrayList<Double> current = new ArrayList<>();
//        current.add(s.get(0));
//        current.add(s.get(1));
//
//        col.add(current);
//        System.out.println(col);
//
//        ArrayList<Double> current_2 = new ArrayList<>();
//        current_2.add(s.get(2));
//        current_2.add(s.get(3));
//        if ( findSum(current_2) <= targetVal ) col.add(current_2);
//        else System.out.println("not qualified!");
//        System.out.println(col);

    }// end of main

    public static double findSum ( ArrayList<Double> list)
    {
        double sum = 0;

        for (int i = 0; i < list.size(); i++)
        {
            sum = sum + list.get(i);
        }

        return sum;
    }



}// end of class


