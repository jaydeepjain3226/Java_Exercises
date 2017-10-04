import java.util.Scanner;

public class Pe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Scanner scan=new Scanner(System.in);
	    System.out.print("enter no. of rows:");
		int m=scan.nextInt();
		
		System.out.print("enter no. of columns:");
		int n=scan.nextInt();
		
		int[][] mat1=new int[m][n];
		int[][] mat2=new int[m][n];
		
		
		
		
			System.out.print("enter elements of matrix1:");
			for(int j=0;j<m;j++)
				for(int k=0;k<n;k++)
					mat1[j][k]=scan.nextInt();
			
		
			System.out.print("enter elements of matrix2:");
			for(int j=0;j<m;j++)
				for(int k=0;k<n;k++)
					mat2[j][k]=scan.nextInt();
		
		int[][] sum_mat=new int[m][n];
		
		for(int j=0;j<m;j++)
			for(int k=0;k<n;k++)
				sum_mat[j][k]=mat1[j][k]+mat2[j][k];
		
		for(int j=0;j<m;j++)
		{
			for(int k=0;k<n;k++)
				System.out.print(sum_mat[j][k]+"\t");
			System.out.println();
		}
	}

}
