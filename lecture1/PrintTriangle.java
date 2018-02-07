/**
Try to print a trianle thing
*/
public class PrintTriangle {
	public static void main(String[] args){
		char m = '*';
		int i = 1;
      	int triangle_line = 5;
		while (i <= triangle_line){
			int j = 1;
        	while (j <= i){
            	System.out.print(m);
            	j = j + 1;
         	}
			System.out.println();
			i = i + 1;
		}
		
	}	
}

/**
public class PrintTriangle {

	public static void main(String[] args){
		col = col + 1;
		int col = 0;
		int row = 0;
		int SIZE = 5;
		row = row + 1;
		System.out.print('*');
		System.out.println('*');
		System.out.println();
		while (col <= row) {
		while (col < row) {
		while (row < SIZE) {
		while (row <= SIZE) {
		}
		
	}	
}
*/