import java.util.Scanner;
public class PasswordStrength{
    public static void main(String[] args){
      boolean hasLower = false, hasUpper = false,
                hasDigit = false, specialChar = false;
      char ch;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the password :");
      String password = sc.nextLine();     
        for (int i=0;i<password.length();i++)
        {
          ch = password.charAt(i);
            if (Character.isLowerCase(ch))
                hasLower = true;
            else if (Character.isUpperCase(ch))
                hasUpper = true;
            else if (Character.isDigit(ch))
                hasDigit = true;
            else
                specialChar = true;
        }
       
        // Strength of password
        System.out.print("Strength of password:- ");
        if (hasDigit && hasLower && hasUpper && specialChar
            && (password.length() >= 8))
            System.out.print(" Strong");
        else if ((hasLower || hasUpper || specialChar)
                 && (password.length() >= 6 && password.length()<=8))
            System.out.print(" Moderate");
        else
            System.out.print(" Weak");
    }
}
