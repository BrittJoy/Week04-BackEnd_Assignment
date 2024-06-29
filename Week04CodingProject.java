package backendgithw;

import java.util.Arrays;

public class Week04CodingProject {

	public static void main(String[] args) {
		
		
		/*
		 * 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.

				a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  

				b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
		
					i. Make sure that there are 9 elements of type int in this new array.  
			
					ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
			
					iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).

				c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		 */
		
		
		// Step 1. created array of int called "ages"	
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};	
		
		// Step 1a. Identified new int called "result" to store the value of subtracting the last element in ages[] from the first element, and printed to console.
		int result = ages[ages.length - 1] - ages[0];
		System.out.println("Prompt 1a) Result: " + result);
		
		// *Step 1b. created new array of 9 elements called "ages2". I contributed these 9 elements.
		int[] ages2 = {4, 8, 12, 16, 21, 24, 36, 48, 50};  
		
		//Step 1bii. using the same formula as above to subtract the first element from the last of the array to show that using the index values works for arrays of different length.
		int result2 = ages2[ages2.length - 1] - ages2[0]; 
		
		// Step 1biii. printing the result of ages2 to show that using the index values is dynamic and works for arrays of different lengths.
		System.out.println("Prompt 1biii) Result: " + result2);					
		
		// Step 1c. Using a for loop to iterate through the array and calculate the average numbers of the array.
		int sum = 0;								
		for (int i = 0; i < ages.length; i++) {
		sum += ages[i];
		}		
		double average = sum / ages.length;  		

		System.out.println("Prompt 1c) Average of elements in ages array: " + average);
		
		
		// Step 2. Created an array called "names" and calculated the average number of letters per name
		String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
			
		int namesSum = 0;
		for(String name : names) {
			namesSum += name.length(); }
					
		// Step 2a. iterated through the array to calculate the average number of letters per name. 	
			double averageLetters = (double)namesSum / names.length;	
			System.out.println("Prompt 2a) Average of number of characters in the array for prompt: " + averageLetters);
			
		// Step 2b. Using a for loop to iterate through the array again to concatenate all names together separated by spaces.
			StringBuilder conNames = new StringBuilder();		
			for(int j = 0; j < names.length; j++) {	
				conNames.append(names[j]);
				conNames.append(" ");
			}
			
			System.out.println("Prompt 2b) Concatenated array: " + conNames.toString());
			
		
			// Step 3. This is how you access the last element of any array:
			System.out.println("Prompt 3) Use 'arrayName.length - 1' to access the element of an array");
			
			// Step 4. This is how you access the first element of any array:
			System.out.println("Prompt 4) Use 'array[0]' to access the first element of an array");	
		
			
			 // Step 5. Created a new array of int called nameLengths. Used a loop to iterate over the previously created names array and added the length of each name to the nameLengths array.
			
				int[] nameLengths = new int[names.length];
				for(int i = 0; i < names.length; i++) {
					nameLengths[i] = names[i].length();
			}
				System.out.println("Prompt 5) Length of each element in the previous names array: " + Arrays.toString(nameLengths)); //Printing to console simply to show functionality.
				
			// Step 6. Used a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array.
				
				// "sum6" to identify the counter as being a part of prompt #6. 
				int sum6 = 0;  
				for(int i = 0; i < nameLengths.length; i++) {
					sum6 += nameLengths[i];
				}
					System.out.println("Prompt 6) Sum of all elements in Prompt 5: " + sum6);
					
					
			// A7. This is testing Step 7 method.
				
			String multiplyString = multiplyString("Hello", 3);
			System.out.println("Prompt 7) test to show prompt 7 method return: " + multiplyString);
						
	
			// A8. This is testing Step 8 method.
			
			String firstName = "Brittany";
			String lastName = "Butrym";
			String fullName = fullName (firstName, lastName);
			System.out.println("Prompt 8) test to show prompt 8 method return: " + fullName);
			
			
			// A9. This is testing Step 9 method. 
							
			 int[] array9a = {10, 20, 30, 40};  // Sum = 100, returns false
		     int[] array9b = {50, 60, 70};      // Sum = 180, returns true
		        
		     System.out.println("Prompt 9) test to show example of 'false' return for Prompt 9 method return | Array 1: " + sumPrompt9(array9a)); // false
		     System.out.println("Prompt 9) test to show example of 'true' return for Prompt 9 method return | Array 2: " + sumPrompt9(array9b)); // true
		
	
		    // A10. This is testing Step 10 method.
		     double[] array10 = {9.8, 7.6, 6.5, 5.4, 4.3}; // I contributed these numbers
		     System.out.println("Prompt 10) test to show example for Prompt 10 method return: " + calculateAverage(array10)); 
		     
		     
		     // A11. This is testing Step 11 method.
		     
		     double[] array11a = {9.8, 7.6, 6.5, 5.4, 4.3}; 	// Average = 6.72; first array is less than second
		     double[] array11b = {5.5, 10.0, 15.2, 20.4, 25.0}; // Average = 15.22; second array is greater than first
		     
		     boolean method11Result = arrayAverage(array11a, array11b);
		     System.out.println("Prompt 11) test to show example for Prompt 11 method return: " + method11Result);
	
		     
		     // A12. This is testing Step 12 method.
		     
		     double moneyInPocket = 15.50;
		     boolean isHotOutside = true;
				
			 System.out.println("Prompt 12) test to show example for prompt 12 method return: " + willBuyDrink(isHotOutside, moneyInPocket));
			
			
			// A13. This is testing Step 13 method.
			
			//Conversion Rate = (Number of Visitors / Number of Clicks)*100
			
			int clicks = 450;
			int totalVisitors = 6000;
			
			double ctr = marketingConversionRate(clicks, totalVisitors); // ctr == click through rate
			double ctrPercentage = ctr * 100;
			System.out.println("Prompt 13) test for prompt 13 method: " + ctrPercentage + "%");
		     
	} // end of method body for first method
	
			//*Start of Methods//
			
			// Step 7. A method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
				public static String multiplyString (String word, int num) {
				StringBuilder result = new StringBuilder(); //using StringBuilder because it is mutable 
				
				for (int i = 0; i < num; i++) {
					result.append(word); // using append to dynamically create the String
				}

				return result.toString(); // Returning the full String concatenated.
				
				}
			
				
				// Step 8. A method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
				public static String fullName(String firstName, String lastName) {
					return firstName + " " + lastName; 		//returns the value within the method parameters. These are instructions for when the method is called upon (see A8 example above.)

				}
					
				
				// Step 9. A method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100. See A9 above for example.
				public static boolean sumPrompt9 (int[] array) {
					 int sum = 0;
				        
				        // Calculating the sum of all elements in the array
				        for (int num : array) {
				            sum += num;
				        }
				        
				        // Checking if the sum is greater than 100
				        return sum > 100;
				}
				
				
				// Step 10.  A method that takes an array of double and returns the average of all the elements in the array. See A10 above for example.
				public static double calculateAverage (double[] array) {
					double sum = 0; 
					
					// Calculating the sum of all elements in the array
					for (double num : array) {  
						sum += num;
					}
					
					// Calculating the average
					double average = sum / array.length; 
					return average;
				}

				
				// Step 11. A method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
				public static boolean arrayAverage (double[] array11a, double[] array11b ) {
					
					// Counter for each loop
					double sum1 = 0;
					double sum2 = 0;
					
					// Enhanced for loop to retrieve all elements in the array
					for (double num : array11a) {
						sum1 += num;
					}
					
					for (double num : array11b) {
						sum2 += num;
					}
					
					double average1 = sum1 / array11a.length;
					double average2 = sum2 / array11b.length;
					
					return average1 > average2;
										
				}
				
				
				// Step 12. A method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
				public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
					return isHotOutside && moneyInPocket > 10.50;  // See A12 above for example print out
					
				}
				
				
				// Step 13. Prompt: Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
				
				/*
				 * This method is created as a solution for easily calculating the conversion rate of digital marketing related efforts. This metric is important to know for evaluating the ROI (Return On Investment) and effectiveness of marketing campaigns and strategies.
				 * In this method specifically, we are returning the click through rate with the goal of finding the conversion percentage of website clicks to measure the effectiveness of a campaign driving web traffic to the site with the goal of clicking on a link.
				 */
				
				public static double marketingConversionRate (int clicks, int totalVisitors) {
					double ctr = (double) clicks / totalVisitors;
					return ctr; 
				}	// See A13 above for final print out
					
}//end of class 


		




