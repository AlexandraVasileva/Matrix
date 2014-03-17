public class Vector {

	// AP: аналогично - private
	public int size;
	public int values [];
	
	public void setValue(int place, int value){
		values[place] = value;
	}
	
	public Vector factor(int a){
		int i;
		Vector temp = new Vector(size);
		for (i=0; i<size; i++) temp.values[i] = values[i]*a;
		
		return temp;
	}
	
	public int scalar(Vector x){
		int i;
		int sum = 0;
		if(x.size != size){
			System.out.println("Error: wrong vector size");
			return 0;
		}
		
		for (i=0; i<size; i++) sum += values[i]*x.values[i];
			
		return sum;
	}
	
	public Vector sum(Vector x){
		Vector temp = new Vector(size);
		int i;
		for (i=0; i<size; i++) temp.values[i] = values[i] + x.values[i];

		return temp;
	}
	
	public void vprint(){
		int i;
		for (i=0; i<size; i++) System.out.println(values[i]);
	}
	
	
	public Vector(int s){
		size = s;
		values = new int[size];
	}
}
