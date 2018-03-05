
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

		/*In modern way, we just use the following way.
		*System.arraycopy(x, 0, newArray, 0, position);
		*/

		while(i < position){
			newArray[i] = x[i];
			i += 1;
		}

		newArray[position] = item;


		/*In modern way, we just use the following way.
		*System.arraycopy(x, position, newArray, position + 1, x.length - position);
		*/
		int n = position + 1;
		while(n <= x.length + 1){
			newArray[n] = x[n - 1];
			n += 1;
		}
		return newArray;

	}


	public static void reverse(int[] x){
		for(int i = 0; i < x.length / 2; i++){
			//Try to initiate a integer to keep track of the item from last to i.
			int j = x.length - i - 1;
			//In order to keep item safe, copy it to a new array.
			int copy = x[i];
			x[i] = x[j];
			x[j] = copy;

		}
	}


	//An non-destructive method.
	//Replaces the number at index i with x[i] copies of itself.
	//For example, xify([3, 2, 1]) would return [3, 3, 3, 2, 2, 1].
	public static int[] xify(int[] x){
		//Size of array is unchangable, so get a state number.
		//Try to get the length of array.
		int size = 0;
		for(int item : x){
			size += item;
		}

		//Instantiate a new array that suits this new method's size well.
		int newArrayX = new int[size];

		int i = 0;
		for(int item : x){
			for(int n = 0; n < item; n++){
				newArrayX[i] = item;
				i += 1;
			}
		}
		return newArrayX;

	}


	public static void main(String[] args){
		
	}	
}