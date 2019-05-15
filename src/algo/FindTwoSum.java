package algo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindTwoSum {


    public static int[] findTwoSum(int[] list, int sum) {
//       List<Integer> sums = new ArrayList<Integer>();
      // int[] sums = new int[list.length];
       Map<Integer,Integer> hash = new HashMap<Integer, Integer>();
       Map<Integer,Integer> sums = new HashMap<Integer, Integer>();
       
       for(int i : list) {
    	   int sumMinusElement = sum - i;
    	   System.out.println("SumMinusElement: " + sumMinusElement);
    	   if(hash.containsKey(sumMinusElement)) {
    		   System.out.println("contain in hash:" + sumMinusElement);
    		   sums.put(i, sumMinusElement); 
    	   }
    	   hash.put(i, i);
       }
       return sums.entrySet().parallelStream().mapToInt(e -> e.getValue()).toArray();
       
    }
    
	public static int[] naiveTwoSum(int[] list, int sum) {
		List<Integer> sums = new ArrayList<Integer>();
		// Map<Integer,String> sums = new HashMap<Integer, Integer>();
		// check each element in array
		for (int i = 0; i < list.length; i++) {

			// check each other element in the array
			for (int j = i + 1; j < list.length; j++) {

				// determine if these two elements sum to S
				if (list[i] + list[j] == sum) {
					sums.add(list[i]);
					sums.add(list[j]);
					return sums.parallelStream().mapToInt(e -> e).toArray();
				}

			}

		}

		// return all pairs of integers that sum to S
		return sums.parallelStream().mapToInt(e -> e).toArray();

	}


    public static void main(String[] args) {
        int[] indices = naiveTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if(indices != null) {
        	for (int i = 0; i < indices.length; i ++) {
        		 System.out.println(indices[i]);
        	}
           
        }
    }
	
}
