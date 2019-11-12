package algorithms;
import com.bridge.lab.*;


/******************************************************************************
 * Compilation: javac -d bin Prime.java Execution: java -cp bin
 * com.bridgelabz.util.Prime n
 * 
 * Purpose: to find the prime no between 0 to 1000 an if they are pallindrome or anagram or not
 ******************************************************************************/

public class Prime {
	public static void main(String[] args) {
		System.out.println("prime between 0 to 1000");
		Utility.prime();
		System.out.println("prime no between 0 to 1000 also pallindrome");
		Utility.primePallindrome();
		System.out.println("prime and anagrams");
		Utility.primeAnagrams();
	}
}
