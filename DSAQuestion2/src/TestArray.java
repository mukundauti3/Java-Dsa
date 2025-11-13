import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				
		System.out.println("Enter the Number of Elements in Array");
		int number = sc.nextInt();
		
		int[] array=new int[number];
		int[] array2=new int[number];
		
		ArrayAddition.acceptArray(array,array2);
		
		ArrayAddition.printArray(array);
		
		
		ArrayAddition.arrayAdditionSolution(array,array2);
		
		ArrayAddition.printArray(array);
	}

}
