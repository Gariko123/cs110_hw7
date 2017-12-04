/*
1. Make a class called 'Puppy' and put it into a directory called animals. (the package name is the same as the directory name)

2. Create a constructor for Puppy that takes a string and stores that in it's private 'name' member

3. Create a public method called getName which returns the name of the puppy
*/

package animals;

public class Puppy {
  private String name;
  public Puppy (String name) {
    this.name = name;
  }
  public String returnName() {
    return this.name;
  }
}
