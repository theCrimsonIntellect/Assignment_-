package com.pinkReasons;

import java.sql.Array;
import java.util.ArrayList;

public class LastHope
{
    public static void main(String[] args)
    {

        ArrayList<Double> ml = new ArrayList<>();

        ml.add(1.1); ml.add(2.1); ml.add(6.6); ml.add(5.1); ml.add(7.6);

        double tarValue = 10.0 ;

        ArrayList<ArrayList<Double>> col = new ArrayList<>();
        col.add(new ArrayList<>(0));                                                        // col = [ {} ]
        System.out.println(col + " col initialized w/ an empty sublist ");



//        // col will be collection of sub lists L                                              col = [ L1, L2, L3, .....]
//
//        ArrayList<Double> answer = new ArrayList<>();                                            // holds individual sublists
//
//        ArrayList<Double> temp = new ArrayList<>();
//        double x;
//        int index = 0;
//
//        for (double d : ml )
//        {
//            for (ArrayList<Double> l : col)
//            {
//                if (sum(l) + d <= tarValue)
//                {
//                    temp.add(d);
//                }
//            }
//
//        }
//
//        for (Double t : temp)
//        {
//            col.add(t);
//
//        }






//
//        // holds on element of ml list; x = 1.1, x = 2.1, ....
//        answer.add(x);
//        col.add(answer);
//        System.out.println(answer);
////        ArrayList<Double> current_L = new ArrayList<>();              // hold current/old sublist in col for appending x
////
////        ArrayList<Double> new_L = new ArrayList<>();                            // x-appended sublist to be added to col

        int prevColSize = col.size();                                                // controls the inner loop over col



        for (int i = 0; i < ml.size(); i++)
        {



        }








        ArrayList<Double> temp = new ArrayList<>();
        System.out.println(temp + " temp sublist");

        temp.add(2.5);
        temp.add(3.5);
        System.out.println(temp + " updated temp");

        col.add(temp);
        System.out.println(col + " updated col");

        ArrayList<Double> currentSubListInCol = col.get(1);
        System.out.println(currentSubListInCol + " current sublist in col");



        System.out.println(col.get(1) + "sublist in index 1 of col");
//        double[] arr = col.get(1); type mismatch...

        Double[] colToArray = new Double[col.size()];
//        colToArray = col.get(1).toArray(colToArray);

        colToArray = currentSubListInCol.toArray(colToArray);
//
//        for (Double x : colToArray)
//            System.out.println(x + " this is col to array ");
//
//        System.out.println();
//
//        Double[] tempToArray = new Double[temp.size()];
//        tempToArray = temp.toArray(tempToArray);
//
//        System.out.println();
//
//        for (Double x : tempToArray)
//            System.out.println(x + " this is temp ");
//
//
//        System.out.println();
//
//        System.arraycopy(colToArray, 0, tempToArray, 0, colToArray.length);
//
//        for (Double x : tempToArray)
//            System.out.println(x + " this is temp after colToArray copy ");






//
//
//        ArrayList<Double> m = new ArrayList<>();
//        double o = ml.get(0);
//
//        m.add(o);
//        col.add(m);
//        System.out.println(col);
//
//        for (int i = 0; i < col.size(); i++)
//        {
//            double k = ml.get(i);
//            col.get(i).add(k);
//
//        }
//        System.out.println(col);
//
//
//
//
//        for (int i = 0; i < ml.size(); i++)
//        {
//            double x = ml.get(i);
//            ArrayList<Double> l = new ArrayList<>();
//
//            if ( col.size() == 0 )
//            {
//                ArrayList<Double> init = new ArrayList<>();
//                col.add(init);
//            }
//            else if ( col.size() > 0)
//            {
//                for (int j = 0; j < col.size(); j++)
//                {
//
//                    if ( findSum(l) + x <= tarVal )
//                    {
//                        l.add(x);
//                        col.add(l);
//                    }
//
//                    if ( findSum(l) + x <= tarVal )
//                        break;
//
//                }
//            }
//        }
//        System.out.println(col);
    }



//            int currentSize = col.size();
//
//            l_Old = col.get(i);
//
//            if ( findSum(l_Old) + x <= tarVal)
//            {
//                l_Old.add(x);
//                l_New = l_Old;
//                col.add(l_New);
//
//            }
//            for (int j = i; j < col.size(); j++)
//            {
//                if (j < currentSize) {
//                    l_Old.add(x);
//                    l_New = l_Old;
//                    col.add(l_New);

//                    ArrayList<Double> temp = new ArrayList<>();
//                    temp.add(ml.get(j));
//                    col.add(temp);
//                }
//            }





//        ArrayList<Double> sub_1 = new ArrayList<>();
//        sub_1.add(ml.get(0));
//        sub_1.add(ml.get(1));
//        System.out.println(sub_1);
//
//        ml.add(3.2);
//        sub_1.add(ml.get(3));
//        System.out.println(sub_1);
//
//        ArrayList<Double> sub_2 = new ArrayList<>();
//        sub_2.add(0.0);
//
//        ArrayList<ArrayList<Double>> col = new ArrayList<>();
//        col.add(sub_1);
//        col.add(sub_2);
//        System.out.println(col);

//    }

    public static double sum ( ArrayList<Double> list)
    {
        double sum = 0;

        for (int i = 0; i < list.size(); i++)
        {
            sum = sum + list.get(i);
        }

        return sum;
    }
}
