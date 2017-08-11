package Examples;
import java.util.*;

public class Arrays {
	
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5};
		int[][] array2d = {{1,2,3,4,5},{1,2,3,4,5}};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<array.length;i++)
			System.out.print(i);
	
		
		System.out.println("");
		
		for(int e:array)
			list.add(e);
		
		for(int e: list)
			System.out.println(e);
		
		System.out.println(java.util.Arrays.toString(list.toArray()));
		System.out.println((java.util.Arrays.deepToString(array2d)));
		
	}
}
