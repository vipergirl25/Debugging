//source: http://www.cs.usyd.edu.au/~jchan3/soft1001/jme/debugging/debugging_task.html

package _02_debug_me;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class Marker 
{ 
    public Marker() 
    { 
        // no initialisation to do 
    } 
   

    public String printGrade(int mark) 
    { 
        if (mark >= 85) 
            return "High Distinction";
        if (mark >= 75) 
            return "Distinction";
        if (mark >= 65) 
           return "Credit";
        if (mark >= 50) 
            return "Pass";
        if (mark >= 45) 
            return "Concessional Pass";
        else
            return "Fail";
    } 
    @Test
	void test() {
    	 Marker mark = new Marker();
		assertEquals("High Distinction", mark.printGrade(85));
		
	}

} 