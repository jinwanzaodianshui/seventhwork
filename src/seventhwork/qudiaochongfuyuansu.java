package seventhwork;
import java.util.Scanner;
public class qudiaochongfuyuansu {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		int[] a = new int[10];
		for(int i = 0; i < 10; i++){
			a[i] = input.nextInt();
			}
		System.out.print("The distinct numbers are: ");
		int[] b = {1,1,1,1,1,1,1,1,1,1};
		for(int i = 0; i < 10; i++){
			for(int j = 9; j > i; j--)
			{
				if(a[i] == a[j])
				{
					b[j] = -1;
					}
				}
			}
		for(int i = 0; i < 10; i++)
		{
			if(b[i] == 1)
			{
				System.out.print(a[i] +" ");
				}
			}
		}
}
