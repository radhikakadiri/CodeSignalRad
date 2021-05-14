package Codesignal;

import java.util.Arrays;

public class ArrayMissingNum {

	 public static void main(String[] args) {
		 int[] missing1 =new int[3];
		 int[] input = {6,2,3,8};
		 Arrays.sort(input);
		 missing1 = findMissing(input);
		 System.out.println("Number of missing items - "+missing1.length);
	 }
	private static final int[] findMissing(int[] data) {
	    if (data == null || data.length <= 1) {
	        // nothing missing.
	        return new int[0];
	    }
	    int first = data[0];
	    int last = data[data.length - 1];
	    int[] missing = new int[last - first - data.length + 1];
	    int missingCursor = 0;
	    int expect = first;
	    for (int value : data) {
	        while (expect < value) {
	            missing[missingCursor] = expect;
	            missingCursor++;
	            expect++;
	        }
	        expect++;
	    }
	    return missing;
	}
}
