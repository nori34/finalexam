package finaltestcheck;

public class SelectionSort {

	
	 private int temp;

		/** Creates a new instance of SelectionSort */
	    public SelectionSort() {
	    }
	    
	    /* A simple SelectionSort algorithm
	     * pre-condition: 
	     * post-condition:
	     * inputs:
	     * outputs:
	     * special conditions:
	     */    
	    public int[] Sort(int arr[]) {
	    	 int N = arr.length;

	         int i, j=0, pos, temp;

	         for (i = 0; i < N-1; i++)

	         {

	             pos = i;

	             for (j = i+1; j < N; j++)

	             {

	                 if (arr[j] < arr[pos])

	                 {

	                     pos = j;

	                 }

	             }

	             /* Swap arr[i] and arr[pos] */

	             temp = arr[i];

	             arr[i] = arr[pos];

	             arr[pos]= temp;           

	         }       
return arr;
	       }

	
}
