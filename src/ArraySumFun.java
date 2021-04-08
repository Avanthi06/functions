
public class ArraySumFun {
 
	    public static void main(String[] args) {  
	         
	        int [] arr = new int [] {1, 2, 3, 4, 5};  
	       arraysum(arr);
	    }
	    public static void arraysum(int[] arr)
	    {
	        int sum = 0;  
	        for (int i = 0; i < arr.length; i++) {  
	           sum = sum + arr[i];  
	        }  
	        System.out.println("Sum of all the elements of an array: " + sum);  
	    }  
	} 


