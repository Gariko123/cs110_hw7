/*
1. Add another class to the utils package called ArrayUtils.

2. Add a static method to ArrayUtils called 'reverse', which takes an array of 'int's and reverses it (use a for loop)

3. Add a static method to ArrayUtils called 'stringifyArray' which returns a string with each member in the array concatenated together with ', ' in between.
*/

package utils;

public class ArrayUtils {
  public static int[] reverse (int[] arr) {
    int[] noarg = new int[arr.length];
    for(int i = 0; i < arr.length; i++) {
      noarg[i] = arr[arr.length -1 - i];
    }
    return noarg;
  }
public static String stringifyArray  (int[] arr) {
  	String result = " ";
  	for(int i = 0; i < arr.length; i++) {
  	  if(i == arr.length - 1) {
    	  result += arr[arr.length - 1];
    	  return result;
  	  }
  		result += arr[i] + ", ";
  	}
  	return result;
  }
}