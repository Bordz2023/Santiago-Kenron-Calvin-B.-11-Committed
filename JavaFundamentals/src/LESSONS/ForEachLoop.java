package LESSONS;

public class ForEachLoop {

	public static void main(String[] args) {
		
		int[] numbers = {532, 432, 653, 123, 89, 21, 2, 42};
		int sum = 0;
		
		for(int num:numbers) {
		    sum = sum + num;
		    }
		System.out.println("Sum : " + sum);

    }
}
