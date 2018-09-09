class first_palindrome  
{  
	 public static boolean isPalindrome(String word) {
		  
		 String reverse = "";
		 
	        int length = word.length(); 
	        
	        for ( int i = length - 1; i >= 0; i-- )  
	           reverse = reverse + word.toLowerCase().charAt(i); 
	        if (word.equals(reverse))  
	        {  //System.out.println("Entered string/number is a palindrome.");  
	       	  System.out.println(true+"uu");
	        }
	       	  else  
	       	  {
	            System.out.println("Entered string/number isn't a palindrome."); 
	       
	     
	       	  }
	        throw new UnsupportedOperationException("Waiting to be implemented.");
		       
	    }
   public static void main(String args[])  
   {  
         
	   System.out.println(first_palindrome.isPalindrome("viv"));
      
     
     
  /*    if (original.equals(reverse))  
         //System.out.println("Entered string/number is a palindrome.");  
    	  System.out.println(first_palindrome.isPalindrome("viv"));
    	  else  
         System.out.println("Entered string/number isn't a palindrome.");   
   }  */
} 
}