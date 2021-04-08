
public class ArrayIndexFun {
	

		public static void main(String[] args) {
		    int[] numbers = {4, 9, 7, 3, 2, 8}; 
	        int element = 2;
	        int index = -1;
	         findindex(numbers);
		}
		public static void findindex(int[] numbers)
		{
	        int i = 0;
		int element = 2;
        int index = -1;
	        while(i < numbers.length) {
	            if(numbers[i] == element) {
	                index = i;
	                break;
	            }
	            i++;
	        }
	         
	        System.out.println("Index of "+element+" is : "+index);
	    }
	}

		



