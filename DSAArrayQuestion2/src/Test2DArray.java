import java.util.Scanner;

public class Test2DArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of Rows in Array");
		int row=sc.nextInt();
		int[][] array=new int[row][];
		for(int i=0;i<row;i++)
		{
			System.out.println("Enter the number of colm for "+(i+1)+" row");
			int col=sc.nextInt();
			array[i]=new int[col];
			
		}
		
		ReverseEveryRow.accept(array);
		
//		ReverseEveryRow.reverseEveryRow(array);
		
		ReverseEveryRow.maxOddNumber(array);

	}

}
