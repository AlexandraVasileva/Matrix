
public class Matrix {
	
	public int width;
	public int height;
	public Vector values[];
	
	public void mprint(){
		int i, j;
		for (i=0; i<height; i++){
			for (j=0; j<width; j++) System.out.print(values[i].values[j] + " ");
			System.out.println();
		}
	}
	
	public Matrix factor (int a){
		Matrix temp = new Matrix (height, width);
		int i;
		for (i=0; i<height; i++){
			temp.values[i] = new Vector(width);
			temp.values[i] = values[i].factor(a);
		}
		return temp;
	}
	
	public Matrix flip(){
		int i, j;
		Matrix temp = new Matrix (width, height);
		for (i=0; i<width; i++){
			temp.values[i] = new Vector(height);
			for (j=0; j<height; j++) temp.values[i].values[j] = values[j].values[i];
		}
		return temp;
	}
	
	public Matrix composition(Matrix A){
		Matrix temp = new Matrix (height, A.width);
		Matrix flipped = A.flip();
		int i, j, sum;
		for (i=0; i<height; i++){
			temp.values[i] = new Vector(A.width);
			for (j=0; j<A.width; j++){
				temp.values[i].values[j] = values[i].scalar(flipped.values[j]);
			}
		}
		return temp;
	}
	
	public Matrix msum(Matrix A){
		if((width != A.width) || (height != A.height)){
			System.out.println("Error: wrong matrix size");
			return this;
		}
		int i;
		Matrix sum = new Matrix (height, width);
		for (i=0; i<height; i++) sum.values[i] = values[i].sum(A.values[i]);
		return sum;
	}
	
	
	private void swap(Vector x, Vector y){
		Vector temp = new Vector(x.size);
		int i;
		for (i=0; i<x.size; i++) temp.values[i] = y.values[i];
		for (i=0; i<x.size; i++) y.values[i] = x.values[i];
		for (i=0; i<x.size; i++) x.values[i] = temp.values[i];
	}
	
	public int determinant(){
		if (height != width){
			System.out.println("Error: determinant is undefined");
			return 0;
		}
		int i, j, k, fact;
		for(i=0; i<height; i++){
			if(values[i].values[i] == 0){
				for(k=i; k<height; k++){
					if(values[k].values[i] != 0){
						swap(values[i], values[k]);
						break;
					}
				}
			}
			
			for(j=0; j<height; j++){
				if(i != j){
					fact = -1*values[j].values[i]/values[i].values[i];
					values[j] = values[j].sum(values[i].factor(fact));
				}
			}
		}
		
		int res = 1;
		for(i=0; i<height; i++) res *= values[i].values[i];
		
		return res;
	}
	
	public Matrix(int h, int w){
		width = w;
		height = h;
		values = new Vector[height];
	}
	
	
}
