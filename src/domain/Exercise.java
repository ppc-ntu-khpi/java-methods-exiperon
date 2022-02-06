package domain;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * The class provides MD5 hashing functionality
 */
public class Exercise {
    /**
     * Performs hashing of text by MD5 algorithm
     * @param text Input text
     * @return Returns hashed text
     */
    public static String Calculate(String text){
        MessageDigest messageDigest;
        byte[] digest = new byte[0];

        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(text.getBytes());
            digest = messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        BigInteger bigInt = new BigInteger(1, digest);
        StringBuilder md5Hex = new StringBuilder(bigInt.toString(16));

        while(md5Hex.length() < 32){
            md5Hex.insert(0, "0");
        }

        return md5Hex.toString();
    }
}
