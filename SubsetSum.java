package com.pinkReasons;

import java.util.ArrayList;

public class SubsetSum implements Cloneable
{
    private int sum = 0;        // stores sum of each sublist
    private ArrayList<Double> originalObjects;
    private ArrayList<Integer> indices;     // indices of the elements in master list

    protected ArrayList<Double> col = new ArrayList<>();

    public SubsetSum ( ArrayList<Double> orig )
    {
        sum = 0;
        originalObjects = orig;     // reference to the master list
        indices = new ArrayList<Integer>();
    }

    public int getSum()
    {
        return sum;
    }

    public Object clone() throws CloneNotSupportedException
    {
        SubsetSum newObject = (SubsetSum)super.clone();
        newObject.indices = (ArrayList<Integer>)indices.clone();
        return newObject;
    }

    /**
     *
     * @param indexOfItemToAdd takes item(index) from master list
     * @return  return the augmented list
     */
    public SubsetSum addItem( int indexOfItemToAdd )
    {

        col.add(originalObjects.get(indexOfItemToAdd));


        return null;
    }

    public void showSubset()
    {

    }
    public ArrayList<Double> getCol(){
        return col;
    }
}
