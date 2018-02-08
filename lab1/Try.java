public class Try{
	public static void main(String[] args){
		System.out.println("hello Java");
	}
}

/**
*Something about the array in Java.
*/

double[] a;
a = new double[N];
for(int i=0; i<N; i++){
	a[i] = 0.0;
}

double[] a = new double[N];
int [] a = {1, 1, 3, 4, 8};

/**
*1. Most important is array aliasing. When we try to copy the array, you should create a new one,and
*declare, initialize a new array, then copy all of the elements.
*/

double [][] a = new double [M][N];
