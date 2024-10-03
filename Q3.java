package ClassRoom;

public class Q3 {
    public static void main(String[] args) {
        String password = "Myp@aSs12";
        int specialCharCount = 0, numberCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                specialCharCount++;
            }
            if (Character.isDigit(ch)) {
                numberCount++;
            }
        }
        if (password.length() > 8 && specialCharCount >= 2 && numberCount >= 2) {
            System.out.println("Password Accepted");
        } else {
            System.out.println("Password Rejected");
        }
    }
}

