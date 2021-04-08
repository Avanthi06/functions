
public class ArraySpecFun {
		
		   public static void main(String args[]){
		      int[] myArray = {55, 45, 69, 44};
		      arrayspec(myArray);
		   }
		   public static void arrayspec(int[] myArray)
		   {
		      int num = 55;

		      for(int i = 0; i<myArray.length; i++){
		         if(num == myArray[i]){
		            System.out.println("Array contains the given element");
		         }
		      }
		   }
		}


