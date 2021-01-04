package seventhwork;
import java.util.Scanner;
public class tuduoxinmianji {
	public static void main(String args[]){
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter ten number of the points: ");
		double n = kb.nextDouble();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten coordinates of the points: ");
        double[] a = new double[10];
        double[] b = new double[10];
		for(int i = 0; i < n; i++){
			a[i] = input.nextDouble();
			b[i] = input.nextDouble();
			}
		double area = 0;
        for (int i = 0; i < n; i++) {
            int t = i + 1;
            if (t == n) {
                t = 0;
            }
            area += (a[i] * b[t] - a[t] * b[i])/2.0;
        }
        System.out.println(String.format("%.3f", Math.abs(area)));
    }
}