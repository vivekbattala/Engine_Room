import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Username {
	 //public static Pattern pattern;
	 // public static Matcher matcher;
	public static Pattern usrNamePtrn = Pattern.compile("^[A-Z]([a-z-]?[A-Z]?){6,16}$");

	public static boolean validate(String username) {
		//throw new UnsupportedOperationException("Waiting to be implemented.");
		  Matcher mtch = usrNamePtrn.matcher(username);
	        if(mtch.matches()){
	            return true;
	        }
	        return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validate("Mike-Standish")); // Valid username
        System.out.println(validate("Mike Standish")); // Invalid username
        
	}

}
