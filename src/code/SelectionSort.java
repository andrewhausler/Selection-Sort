package code;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Generic Class SelectionSort Which Implements AlgorithmBasics
 */
public class SelectionSort<Type extends Comparable<Type>> implements AlgorithmBasics<Type>
{
    // Private ArrayList Variable
    private ArrayList<Type> unsortedArray;

    // SelectionSort Default Constructor
    public SelectionSort()
    {
        unsortedArray = new ArrayList<Type>();
    }

    // SelectionSort Constructor With ArrayList Parameter
    public SelectionSort(ArrayList<Type> unsortedArray)
    {
        this.unsortedArray = unsortedArray;
    }

    /**
     * Sort Method Which Uses Selection Sort
     */
    public void sort()
    {
        int minIndex = 0;
        Type temp = null;
        for(int i=0; i<unsortedArray.size(); i++)
        {
            minIndex = i;
            for(int j=i+1; j<unsortedArray.size(); j++)
            {
                if(unsortedArray.get(minIndex).compareTo(unsortedArray.get(j)) == 1)
                {
                    minIndex = j;
                }
            }
            temp = unsortedArray.get(i);
            unsortedArray.set(i, unsortedArray.get(minIndex));
            unsortedArray.set(minIndex, temp);
        }
    }

    /**
     * Displays Objects Memory Address As String
     * @return returns the arraylist
     */
    public String toString()
    {
        return String.valueOf(unsortedArray);
    }

    public ArrayList<Type> getArray()
    {
        return unsortedArray;
    }

    /**
     * Main Method
     * @param args command line argument
     */
    public static void main(String[] args)
    {
        SelectionSort<Integer> myArray = new SelectionSort<Integer>(new ArrayList<Integer>(Arrays.asList(6, 1, 3, 5, 8, 2)));
        System.out.println("Unsorted: " + myArray);
        myArray.sort();
        System.out.println("Sorted: " + myArray);
    }
}