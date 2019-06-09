package vutureAssessment;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class vuture {
static int count=0;

	
	public static void main(String[] args) {
		
		//task 1 
		String task1_input = "I have some cheese";
		System.out.println("Task 1: Occurance of letter 'e' in " + task1_input + " is : " + task1('e', task1_input));
		
		//task2
		String task2_input = "'God saved Eva's dog'";
		System.out.println("Task 2: Is the string " +  task2_input + " a palindrome? : " + task2(task2_input));
		
		//task 3A
		String task3_input = "I have a cat named Meow and a dog name Woof. I love the dog a lot. He is larger than a small horse.";
		
		String[] wordsa = {"dog", "cat", "large"};
		System.out.println("Task 3A: Occurance of given words in the text are: " +task3a(wordsa, task3_input));
		
		//task 3B
		String[] wordsb = {"meow", "cat", "large"};
		System.out.println("Task 3B: Censored the given words in text: " + task3b(wordsb, task3_input));
		
		//task 3C
		String task3c_input = "Anna went to vote in the election to fulfil her civic duty";
		System.out.println("Task 3C: Censored palindromes in text: " + task3c(task3c_input));
		

	}
	
//task 1, function which counts the number of occurrences of a given letter in a string.
//checks each character of "sentence" against a given "letter" 
//if matches, increase the count. returns total count
	
public static int task1(char letter, String sentence)
{	
	for(int i =0; i<sentence.length(); i++)
	{		
		if(letter == sentence.charAt(i) ) {
			count++;
		}
	}
	return count;
}

//Task 2, function which decides if a string is a palindrome
//reverses the sentence after removing special characters, spaces and changing to lower case.
//compares the reversed sentence to the given sentence, if matches then its a palindrome. 

public static boolean task2(String sentence)
{
	String sentence2 ;
	String reversed = "";
	sentence2 = sentence.replaceAll("[' \\s]","").toLowerCase();
	
	for(int i=sentence2.length()-1; i>=0; i--){
		
		reversed += sentence2.charAt(i);
	}
		if(reversed.equals(sentence2) ){
			return true;
		}else{
			return false;
		}
}

//Task 3A, function which counts the number of occurrences of words from a "censored words list" in a text
//give the count of each words that is present is "words" and "sentence".
//compare occurrence of each word in "words" to the words in "sentence" to give total count 
public static String task3a(String[] words, String sentence)
{
	int count = 0;
	int count2 = 0;
	String result = "";

	String[] sentenceList = sentence.split(" ") ; 
    Map<String,Integer> hashmap = new TreeMap<>();
    
    for(String x:sentenceList){      		
    	for(String y: words) {
    		
    	if (x.contains(y)) {
    		count ++;
    		
    		if (hashmap.containsKey(y) ){
    			count2 = hashmap.get(y) + 1;

            } else {
            	count2 = 1;
            }
    		hashmap.put(y, count2);
    		hashmap.put("total", count);
    		
    		result = hashmap.toString();
    	}
    	
    	}
    }
    return result;
}

//Task 3B, function to create a way to censor words featured in the "censored words list" that appear in the text.
//compare each word of "sentence" to "words", if contains, run "replacing" on that word to cersor the word.
public static String task3b(String[] words, String sentence)
{
	
String[] sentenceList =sentence.toLowerCase().split(" ");
String result = "";

   for(int i=0; i<sentenceList.length; i++) {
	   for(int j=0; j<words.length; j++) {
		   
		   if ((sentenceList[i].contains(words[j]) )){
			   sentenceList[i] = replacing(sentenceList[i]);             
		   }
	   }   
   }
   result = String.join(" ", sentenceList);

   return result;
}

//function for task 3b. Takes a word and replaces the all the characters between the first and last.
public static String replacing(String word) {
	
char[] result = word.toCharArray();
int first = 1;
int last = result.length - 1;
    
    for (int i = first; i<last; i++){
    	result[i] = '$';
    }
    return new String(result);	
}

// Task 3C, function to create a way to censor a single word palindrome in a text
// for each word in "sentence" run "task2". If it is palindrome, run "replacing" to cersor the word.
public static String task3c(String sentence) {
	String result = "";
	String[] sentenceList = sentence.split(" ");
	
	for(int i=0; i<sentenceList.length; i++) {
		 if (task2(sentenceList[i])){
             
			 sentenceList[i] = replacing(sentenceList[i]);
         } 
	} 
	result =String.join(" ", sentenceList);
	return result;
}



}
