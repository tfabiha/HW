// Tabassum Fabiha
// APCS1 pd2
// HW22 -- Not Up to Pig Latin Just Yet
// 2017-10-23

/***
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 ***/

public class Pig
{
    //Q: How does this initialization make your life easier
    //A: You have one place where all the vowels can be referenced
    //   from. It makes for easier debugging, and fewer errors in the
    //   code due to typos.
    private static final String VOWELS = "aeiou";


    /*=====================================
      boolean hasA(String,String) -- checks for a letter in a String
      pre:  w != null, letter.length() == 1
      post: hasA("cat", "a") -> true
      hasA("cat", "p")       -> false
      =====================================*/
    public static boolean hasA( String w, String letter ) 
    {
	for (int i  = 0; i < w.length(); i++) {
	    if (w.substring(i,i+1).equals(letter)) {
		return true;
	    }
	}

	return false;
    }//end hasA()


    /*=====================================
      boolean isAVowel(String) -- tells whether a letter is a vowel
      precondition: letter.length() == 1
      =====================================*/
    public static boolean isAVowel( String letter ) 
    {
	return hasA(VOWELS,letter);
    }


    /*=====================================
      int countVowels(String) -- counts vowels in a String
      pre:  w != null
      post: countVowels("meatball") -> 3
      =====================================*/
    public static int countVowels( String w ) 
    {
	int counter = 0;
	for (int i = 0; i < w.length(); i++) {
	    if (isAVowel(w.substring(i,i+1))) {
		counter += 1;
	    }
	}

	return counter;
    }


    /*=====================================
      boolean hasAVowel(String) -- tells whether a String has a vowel
      pre:  w != null
      post: hasAVowel("cat") -> true
      hasAVowel("zzz")       -> false
      =====================================*/
    public static boolean hasAVowel( String w ) 
    {
	for (int i = 0; i < w.length(); i++) {
	    if (isAVowel(w.substring(i,i+1))) {
		return true;
	    }
	}
      
	return false;
    }


    /*=====================================
      String allVowels(String) -- returns vowels in a String
      pre:  w != null
      post: allVowels("meatball") -> "eaa"
      =====================================*/
    public static String allVowels( String w ) 
    {
	String all = "";
	for (int i = 0; i < w.length(); i++) {
	    if (isAVowel(w.substring(i,i+1))) {
		all += w.substring(i,i+1);
	    }
	}

	return all;
    }

    public static void main( String[] args ) 
    {
	System.out.println("hasA test cases");
	System.out.println("hasA('a','a') => "+hasA("a","a"));// true
	System.out.println("hasA('dog','g') => "+hasA("dog","g"));// true
	System.out.println("hasA('car','a') => "+hasA("car","a"));// true
	System.out.println("hasA('fish','f') => "+hasA("fishy","f"));// true
	System.out.println("hasA('done','p') => "+hasA("done","p"));// false

	System.out.println("\n==========================\n");

	System.out.println("isAVowel test cases");
	System.out.println("isAVowel('a') => "+isAVowel("a"));// true
	System.out.println("isAVowel('i') => "+isAVowel("i"));// true
	System.out.println("isAVowel('u') => "+isAVowel("u"));// true
	System.out.println("isAVowel('f') => "+isAVowel("f"));// false

	System.out.println("\n==========================\n");

	System.out.println("countVowels test cases");
	System.out.println("countVowels('word') => "+countVowels("word"));// 1
	System.out.println("countVowels('fishy') => "+countVowels("fishy"));// 1
	System.out.println("countVowels('rhythm') => "+countVowels("rhythm"));// 0
	System.out.println("countVowels('ouenouaou') => "+countVowels("ouenouaou"));// 8

	System.out.println("\n==========================\n");

	System.out.println("hasAVowel test cases");
	System.out.println("hasAVowel('word') => "+hasAVowel("word"));// true
	System.out.println("hasAVowel('fishy') => "+hasAVowel("fishy"));// true
	System.out.println("hasAVowel('rhythm') => "+hasAVowel("rhythm"));// fa;se
	System.out.println("hasAVowel('ouenouaou') => "+hasAVowel("ouenouaou"));// true

	System.out.println("\n==========================\n");

	System.out.println("allVowels test cases");
	System.out.println("allVowels('word') => "+allVowels("word"));// "o"
	System.out.println("allVowels('fishy') => "+allVowels("fishy"));// "i"
	System.out.println("allVowels('rhythm') => "+allVowels("rhythm"));// ""
	System.out.println("allVowels('ouenouaou') => "+allVowels("ouenouaou"));// "oueouaou"
      
      
    }//end main()

}//end class Pig
