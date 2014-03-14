import java.util.Scanner;

public class Main {

		public static void main(String[] args) {

			Scanner in = new Scanner(System.in);
			int i, size, temp;
			
			size = in.nextInt();
			Vector x = new Vector (size);
			Vector y = new Vector (size);
			
			for (i=0; i<size; i++){
				temp = in.nextInt();
				x.setValue(i, temp);
			}
			
			for (i=0; i<size; i++){
				temp = in.nextInt();
				y.setValue(i, temp);
			}
			
			Vector sum = new Vector(size);
			sum = x.sum(y);
			
			int scalar = x.scalar(y);

			System.out.println();
			System.out.println("Input:");
			System.out.println();
			x.vprint();
			System.out.println();
			y.vprint();		
			
			System.out.println();
			System.out.println("Scalar: " + scalar);
			System.out.println();
			System.out.println("Sum:");
			sum.vprint();
	
			in.close();
			
		}

}