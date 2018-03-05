
public class Array {
	
	public int[] items;
	public int size;

	public Array(){
		items = new int[100];
		size = 0;
	}

	//A method that non-destructively inserts item into array x at the given position.
	//Shoulf return the resulting array.
	public static int[] insert(int[] x, int item, int position){
		int[] newArray = new int[x.length + 1];
		int i = 0;
		while(i < position){
			newArray[i] = x[i];
			i += 1;
		}
		
		newArray[position] = item;

		int n = position + 1;
		while(n <= x.length + 1){
			newArray[n] = x[n - 1];
			n += 1;
		}
		return newArray;

	}



	public static void main(String[] args){
		
	}	
}