package Codesignal;

public class ArraySeqValidRem1Ele {
	public static void main(String[] args) {
		 
		System.out.println(almostIncreasingSequence(new int[] {1,2,3,4,3,6}));
		}
	static boolean almostIncreasingSequence(int[] sequence) {
    int removeCount = 0;
    for (int i = 0; i < sequence.length - 1; i++) {
        int current = sequence[i];
        int next = sequence[i + 1];

        if (current >= next) {
            removeCount++;
            // Try to remove current. Skip removed element(current). Check
            // if previous is less than next element around current
            // if i is 0 there is no previous element
            // if removeCurrent is true it is possible to remove it and
            // arrays stays increasing
            boolean removeCurrent = i == 0 || sequence[i - 1] < next;
            // if removeNext is true it is possible to remove it and arrays
            // stays increasing
            boolean removeNext = i + 1 == sequence.length - 1 || current < sequence[i + 2];

            if (!removeCurrent && !removeNext)
                // if current is removed and array isn't increasing and if
                // next is removed and array is not increasing,
                // increment removeCount to return false
                removeCount++;
        }
        if (removeCount > 1) {
            return false;
        }
    }
    return true;
}
	
	
}
