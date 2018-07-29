//source: http://www.cs.usyd.edu.au/~jchan3/soft1001/jme/debugging/debugging_task.html

package _02_debug_me;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class Person 
{ 
  // Instance variables 
    private String name; 
    private int age; 
  
  // Constructor 
    public Person(String _name, int _age) 
    { 
        this.name = _name; 
        this.age = _age;
    } 

  // Instance methods 
    public String getName() 
    { 
        return name; 
    } 

    public int getAge() 
    { 
        return age; 
    } 

   
} 