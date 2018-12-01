package com.pinkReasons;

public class FoothillGenerics {
    public static void main(String[] args) {
//        int x = 10;
        String x = "Foothill College";
        displayInAsterisks(x);

        int largestInt = findLargestOfThree(4,9,-9);
        String largestString = findLargestOfThree("hi","mom","87");
        System.out.println(largestInt + "\t" + largestString);

        MyInt a = new MyInt(5);
        MyInt b = new MyInt(-29);
        MyInt c = new MyInt(77);

        MyInt f;

        f = findLargestOfThree(a,b,c);
        System.out.println(f.the_int);



    }

//    private static void displayInAsterisks(int x) {
//        System.out.println(" *** " + x + " *** ");
//    }

    private static <E> void displayInAsterisks(E x) {
        System.out.println(" *** " + x + " *** ");
    }

//    private static <E extends Comparable<E>> E findLargestOfThree(E x, E y, E z) {
//        if ( x.compareTo(y) > 0 ) return ( x.compareTo(z) > 0 ) ? x : z;
//        else return ( y.compareTo(z) > 0 ) ? y : z;
//
//    }

    private static  <E extends Comparable<? super E>> E findLargestOfThree(E x, E y, E z) {
        if (x.compareTo(y) > 0)
            return (x.compareTo(z) > 0) ? x : z;
        else
            return (y.compareTo(z) > 0) ? y : z;
    }

    private static class MyInt implements Comparable<MyInt> {

        public int the_int;
        public MyInt(int n) { the_int = n; }

        @Override
        public int compareTo(MyInt o) {
            return ( the_int - o.the_int );
        }
    }

    private static class SpecialInt extends MyInt {

        public SpecialInt(int n) {
            super(n);
        }
    }
}
