import java.util.ArrayList;

public class PriceCalculations {

    /* WHAT IS THIS CLASS FOR? */
    /* This class takes the ArrayList of prices from SiteConnect and it's what does the math to calcaulte */
    /* values such as averages and such*/

    /* Variables */

    ArrayList<Integer> prices; /* List of all prices */

    /* Functions */

    /* Constructor, first it loads in the prices, but then it uses quicksort to sort them*/
    public PriceCalculations(ArrayList<Integer> list)
    {
        prices = list;
        sort(prices, 0, prices.size()-1);
    }

    /* Debug function that prints what is in the array */

    private void print()
    {
        for (int i=0; i<prices.size(); i++)
        {
            System.out.println(i+1 + ": " + prices.get(i));
        }
    }

    /* Function that gets the average, first it removes outliers and then it calculates based on the new array */

    public int getAverage()
    {
        removeOutliers();
        int total = 0;
        for (int i=0; i<prices.size(); i++)
        {
            total += prices.get(i);
        }
        return (total/prices.size());
    }

    /* Function that removes all values 1.5 times higher than quartile 3, and 1.5 lower than quartile 1 */

    private void removeOutliers()
    {
        /* This part of the function gets the median index so we can then find the values if Q1 and Q3, giving us our upper and lower ranges */
        int medianIndex;
        if (prices.size()%2 == 0)
        {
            int sum = prices.size()/2 + prices.size()/2+1;
            medianIndex = sum/2;
        }
        else
        {
            medianIndex = prices.size()/2;
        }
        int q1 = getMedian(prices, 0, medianIndex);
        int q3 = getMedian(prices, medianIndex, prices.size());
        int iqr = q3 - q1;
        int upperRange = q3 + (int)(iqr * 1.5);
        int lowerRange = q1 - (int)(iqr * 1.5);

        /* Two while loops that check the bottom and top of the list to remove higher and lower values in the ranges */

        while (prices.get(0) < lowerRange)
        {
            prices.remove(0);
        }

        while (prices.get(prices.size()-1) > upperRange)
        {
            prices.remove(prices.size()-1);
        }

    }

    /* Function used in removeOutliers to find the median value in a list given the high and low points */

    private int getMedian(ArrayList<Integer> list, int low, int high)
    {
        int range = high-low;
        if (range%2 == 0)
        {
            int sum = list.get(range/2+low) + list.get(range/2+low+1);
            return sum/2;
        }
        else
        {
            return list.get(range/2+low);
        }
    }

    /* These two functions are for quicksort, I'm going to assume you know what quicksort is and not bother explaining */
    /* If you don't, this is only used to sort the initial data from lowest to highest */

    int partition(ArrayList<Integer> arr, int low, int high)
    {
        int pivot = arr.get(high);
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than the pivot
            if (arr.get(j) < pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr.get(i+1);
        arr.set(i+1, arr.get(high));
        arr.set(high, temp);

        return i+1;
    }

    void sort(ArrayList<Integer> arr, int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }



}
