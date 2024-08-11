import java.security.SecureRandom;

public class PasswordAndOTPGenerator {

    // Characters allowed in the password
    private static final String PASSWORD_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_+=<>?";
    // Digits allowed in the OTP
    private static final String OTP_DIGITS = "0123456789";

    // SecureRandom is preferred over Random for cryptographic purposes
    private static final SecureRandom random = new SecureRandom();

    // Method to generate a random password
    public static String generatePassword(int length) {
        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(PASSWORD_CHARACTERS.length());
            password.append(PASSWORD_CHARACTERS.charAt(index));
        }
        return password.toString();
    }

    // Method to generate a random OTP
    public static String generateOTP(int length) {
        StringBuilder otp = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(OTP_DIGITS.length());
            otp.append(OTP_DIGITS.charAt(index));
        }
        return otp.toString();
    }

    public static void main(String[] args) {
        // Example usage:
        int passwordLength = 12; // Length of the password
        int otpLength = 6; // Length of the OTP

        String password = generatePassword(passwordLength);
        String otp = generateOTP(otpLength);

        System.out.println("Generated Password: " + password);
        System.out.println("Generated OTP: " + otp);
    }
}
