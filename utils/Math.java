/*
1. Make a package called utils

2. Put a class in it called Math

3. Add a static function to your Math class called factorial which recursively computes the factorial of a given integer

4. Add a static function to your Math class called 'factorialLoop' which computes the factorial of a given integer using a loop (e.g. for or while)
*/

package utils;

public class Math{
  public static long factorial (long num){
    
    if (num == 0){
      return 1;
    }
    return num * factorial(--num);
  }
}

 public static long factorialLoop (long num){
  	long fact = 1;
  	for(int i = num; i > 0; i--) {
  		fact = fact * i;
  	}
  	if(num == 0) return 1;
  	return fact;
  }
}