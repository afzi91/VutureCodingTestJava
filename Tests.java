package vutureAssessment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

@SuppressWarnings("static-access")
public class Tests {
	
	private vuture tes;


    public void setUp() {
        tes = new vuture();
    }
    
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    
    /*
	  * Task 1 tests
	  */
    
	@Test
    public void task1Test1(){

        char word = 'e';
        String text = "I have some cheese";

        int expected = 5;

        int actual = tes.task1(word, text);

        assertEquals(expected, actual);
    }
	
	@Test
    public void task1Test2(){

        char word = 'q';
        String text = "I have some cheese";
        
        int expected = 0;
        // actual
        int actual = tes.task1(word, text);
        // test
        assertEquals(expected, actual);
    }
	
	 @Test
	    public void task1Test3(){
	        char word = 'w';
	        String text = "I have a cat named Meow";

	        int expected = 1;
	        
	        int actual = tes.task1(word, text);
	        
	        assertEquals(expected, actual);
	    }
	 
	 
	 /*
	  * Task 2 tests
	  */
	   @Test
	    public void task2Test1(){
	        String text = "I have some cheese";
	        
	        assertFalse(tes.task2(text));
	    }
	   
	   @Test
	    public void task2Test2(){
	        String text = "Radar";
	        
	        assertTrue(tes.task2(text));
	    }
	   
	   
	   /*
		  * Task 3A tests
		  */
	   
	   @Test	
	   public void task3aTest1(){
		   
	        String [] words = {"dog", "cat", "large"};
	        String text = "I have a cat named Meow and a dog name Woof. I love the dog a lot. He is larger than a small horse.";

	        String expected = "{cat=1, dog=2, large=1, total=4}";

	        String actual = tes.task3a(words, text);

	        assertEquals(expected, actual);
	    }
	   
	   @Test
	   public void task3aTest2(){
	        // setup
	        String [] words = {"apple", "hello", "mouse"};
	        String text = "I have a cat named Meow and a dog name Woof. I love the dog a lot. He is larger than a small horse.";
	        // expected
	        String expected = "";
	        // actual
	        String actual = tes.task3a(words, text);
	        // test
	        assertEquals(expected, actual);
	    }
	   
	   /*
		  * Task 3B tests
		  */
	   
	   @Test
	   public void task3bTest1(){

	        String [] words = {"meow", "cat", "large"};
	        String text = "I have a cat named Meow and a dog name Woof. I love the dog a lot. He is larger than a small horse.";

	        String expected = "i have a c$t named m$$w and a dog name woof. i love the dog a lot. he is l$$$$r than a small horse.";

	        String actual = tes.task3b(words, text);

	        assertEquals(expected, actual);
	    }
	   
	   @Test
	   public void task3bTest2(){
	        // setup
	        String [] words = {"have", "woof", "love", "small"};
	        String text = "I have a cat named Meow and a dog name Woof. I love the dog a lot. He is larger than a small horse.";
	        // expected
	        String expected = "i h$$e a cat named meow and a dog name w$$$. i l$$e the dog a lot. he is larger than a s$$$l horse.";
	        // actual
	        String actual = tes.task3b(words, text);
	        // test
	        assertEquals(expected, actual);
	    }
	   
	   /*
	    * Task 3B tests
		*/
	   
	   @Test
	   public void task3cTest1(){
	        
	        String text = "Anna went to vote in the election to fulfil her civic duty";

	        String expected = "A$$a went to vote in the election to fulfil her c$$$c duty";

	        String actual = tes.task3c(text);

	        assertEquals(expected, actual);
	    }
	   
	   @Test
	   public void task3cTest2(){
	        
	        String text = "Madam is checking radar to refer Solos and groups";

	        String expected = "M$$$m is checking r$$$r to r$$$r S$$$s and groups";

	        String actual = tes.task3c(text);

	        assertEquals(expected, actual);
	    }
	   

}

