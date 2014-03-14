/*

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int i, j, size, temp;	
		
		int h, w;
		h =  in.nextInt();
		w =  in.nextInt();
		Matrix m1 = new Matrix(h,w);
		for(i=0; i<h; i++){
			m1.values[i] = new Vector(w);
			for (j=0; j<w; j++){
				temp = in.nextInt();
				m1.values[i].setValue(j, temp);
			}
		}
		
		h =  in.nextInt();
		w =  in.nextInt();
		Matrix m2 = new Matrix(h,w);
		for(i=0; i<h; i++){
			m2.values[i] = new Vector(w);
			for (j=0; j<w; j++){
				temp = in.nextInt();
				m2.values[i].setValue(j, temp);
			}
		}
		
		System.out.println();
		System.out.println("Input:");	
		System.out.println();
		m1.mprint();
		System.out.println();
		m2.mprint();

		Matrix summa = m1.msum(m2);
		System.out.println();
		System.out.println("Sum:");
		summa.mprint();
		
		Matrix compos = m1.composition(m2);
		System.out.println();
		System.out.println("Composition:");
		compos.mprint();

		System.out.println();
		System.out.println("Determinant of 1:");
		System.out.println(m1.determinant());
		System.out.println();
		System.out.println("Determinant of 2:");
		System.out.println(m2.determinant());
		
		in.close();
		
	}

}
*/