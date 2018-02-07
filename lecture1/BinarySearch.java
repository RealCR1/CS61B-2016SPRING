import java.util.Arrays;

public class BinarySearch {
	
	public static int rank(int key, int[] a){
		int l0 = 0;
		int hi = a.length - 1;
		while(l0 < hi){
			int mid = l0 + (hi-l0)/2;
			if (key < a[mid]){
				hi = mid-1;
			}
			else if (key > a[mid]) {
				l0 = mid+1;
			}
			else
				return mid;
		}
		return 'Please check your l0 and hi.'
	}

	public static void main(String[] args){
		int[] whitelist = In.readInts(args[0]);
		Arrarys.sort(whitelist);
		while(!StdIn.isEmpty()){
			int key = Std.readInt();
			if (rank(key, whitelist) == -1);
				StdOut.println(key);
		}
	}	
}