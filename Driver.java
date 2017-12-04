/*
1. Add a class to the root of your project called 'Driver' which has the main function in it (the one that you will run when executing your program).  Import all the other classes that you made.

2. Create three instances of Puppy.  The names of the puppies should be: 'Joey', 'Chandler', 'Ross'.  For each puppy, call the getName method and print it to the console.

3. Call the reverse method in the ArrayUtils with an array containing 9, 20, 3, 44, 88, 300, then turn the result into a string using the stringifyArray method and print it to the console.

4. Create a variable of type double with a value of 15.4.  Pass that variable as an argument to your factorial method.  Note that you will need to cast it to an 'int', since factorial does not know how to work with doubles.  Print the result of calling the factorial method to the console 
*/

public class Driver {
	public static void main(String[] args) {

		Puppy puppy0 = new Puppy("Joey"); 
		Puppy puppy1 = new Puppy("Chandler");
		Puppy puppy2 = new Puppy("Ross");

		System.out.println(puppy0.returnName());
		System.out.println(puppy1.returnName());
		System.out.println(puppy2.returnName());

		int[] arg = new int[]{9, 20, 3, 44, 88, 300};
		int[] res = ArrayUtils.reverse(arg);
		String stringifiedRes = ArrayUtils.stringifyArray(res);
		System.out.println(stringRes);


		double num1 = 15.4;
		System.out.println(Math.factorial( (int)num1));
	}
}