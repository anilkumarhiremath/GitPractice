package Demo.com;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {
    	
    	// Here regex having the valid email pattern
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        String email = "example@example.com";
        
        //Here compiles the pattern and stores in the pattern variable
        Pattern pattern = Pattern.compile(regex);
        
        //Here matcher class will help to verify the valid pattern and returns boolean value
        Matcher matcher = pattern.matcher(email);
        
        if (matcher.matches()) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }
    }
}
