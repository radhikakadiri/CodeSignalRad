package Codesignal;

public class ArraySeqMissingNum {

	public static void main(String[] args) {
		  /*if (IncreasingSequence(new int[] {1,2,3,4,3,6}))
		    System.out.println("By removing one element the array is increasing");
		  else
		    System.out.println("By removing one element the array is Not increasing");*/
		System.out.println(IncreasingSequence(new int[] {1,2,3,4,3,6}));
		}
   
		private static boolean IncreasingSequence(int[] sequence) {
		  int[] nextArray;
		  for (int i = 0; i < sequence.length; i++) {
		      nextArray = MinusOneElement(sequence, i);
		      if (CheckSequenceIncreasing(nextArray)) 
		         return true;
		    } 
		  return false;
		}

		private static boolean CheckSequenceIncreasing(int[] sequence) {
		    for (int i = 0; i < sequence.length - 1; i++) {
		       if (sequence[i] >= sequence[i + 1]) {
		           return false;
		    }
		  }
		  return true;
		}

		private static int[] MinusOneElement(int[] sequence, int elementToRemove) {
		   int[] newArray = new int[sequence.length - 1];
		   int index = 0;
		   for (int i = 0; i < sequence.length; i++) {
		        if (i != elementToRemove) {
		            newArray[index] = sequence[i];
		            index++;
		        }
		   }
		   return newArray;
		}
	
	
}
