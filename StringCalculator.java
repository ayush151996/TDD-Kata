/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	static String extractInt(String str){
		// Replacing every non-digit number
		// with a space(" ")
		str = str.replaceAll("[^\\d]", " ");

		// Remove extra spaces from the beginning
		// and the ending of the string
		str = str.trim();

		// Replace all the consecutive white
		// spaces with a single space
		str = str.replaceAll(" +", " ");

		if (str.equals(""))
			return "-1";

		return str;
	}

	// Function to calculate sum of all numbers present
	// in a string containing alphanumeric characters
	static int findSum(String str){
	    int sum = 0;
	    if(str.contains(",")|str.contains("\n")|str.contains("0")|str.contains("1")){
	    String temp = "0";

		// holds sum of all numbers present in the string
		

		// read each character in input string
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			// if current character is a digit
			if (Character.isDigit(ch))
				temp += ch;

			// if current character is an alphabet
			else {
				// increment sum by number found earlier
				// (if any)
				sum += Integer.parseInt(temp);

				// reset temporary string to empty
				temp = "0";
			}
		}

		// atoi(temp.c_str()) takes care of trailing
		// numbers
		return sum + Integer.parseInt(temp);
	}
		// A temporary string
	return sum;	
	}

	// Driver code
	public static void main(String[] args)
	{

		// input alphanumeric string
		String str = "111,01\n";
         str = extractInt(str);
		// Function call
		System.out.println(findSum(str));
	}
}
