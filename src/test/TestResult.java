package test;

import domain.Exercise;

/**
 * The class provides functionality for testing the hashing algorithm
 */
public class TestResult {
    public static void main(String[] args) {
        String text = "TEXT";
        System.out.println("Text " + text + " is hashed by MD5 algorithm: " + Exercise.Calculate(text));
    }
}
