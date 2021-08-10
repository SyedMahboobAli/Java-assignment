package q2;

import java.util.regex.Matcher;
// Java program to read all mobile numbers 
// present in given file \
import java.util.regex.Pattern;
import java.io.*; 

class MobileNumberExtraction 
{ 
	public static void main(String[] args) throws IOException 
	{ 
		// Write Mobile Numbers to output.txt file 
		PrintWriter pw = new PrintWriter("C:\\Users\\HOME\\Desktop\\1234\\output.txt"); 

		// Regular expression for mobile number 
		Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}"); 

		// BufferedReader for reading from input.txt file 
		BufferedReader br = new BufferedReader 
				(new FileReader("C:\\Users\\HOME\\Desktop\\1234\\input.txt")); 
		String line = br.readLine(); 

		while (line != null) 
		{ 
			Matcher m = p.matcher(line);

			while (m.find()) 
			{ 
				// Write the mobile number to output.txt file 
				pw.println(m.group()); 
			} 

			line = br.readLine(); 
		} 
		pw.flush(); 
	} 
} 

