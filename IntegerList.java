import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntegerList {
	
	public static void main(StringManipulation[] args) {
		Scanner sc = new Scanner(System.in);;
		List<Integer> arr = new ArrayList<>();
		int high=0,low=Integer.MIN_VALUE;
		
		 while(sc.hasNextInt())
		 {
			 int num = sc.nextInt();
			 arr.add(num);
			 if(high<num) high=num;
			 
		 }
		 
		 
		 int sum=0;
		 for (Integer integer : arr) {
			sum+=integer;
		}
		 
//			 int sum = arr.stream()
//                     .mapToInt(Integer::intValue)
//                     .sum();
			 
			 
			 System.out.println("Sum of the integers in the list: " + sum);
			 System.out.println("Sum of the integers in the list: " + arr.size());
			 System.out.println("Highrst and lowest "+high+" "+low);
			 System.out.println(arr);
			 
			 
		 
		
	}
	
			
	
}
