package com.techreturners.exercise001;

import java.util.Collections;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        return firstName.charAt(0) + "." + lastName.charAt(0);
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        double answer = Math.round(originalPrice * (vatRate / 100 + 1) * 100.0) / 100.0;
        return answer;
    }

    public String checkSentenceReverse(String str) {
        String words[] = str.split("\\s");
        String reverseWord = "";
        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseWord += sb.toString() + " ";
        }
        String reversedSentence = reverseWord.trim();
        String reversedSentenceArray[] = reversedSentence.split(" ");
        String ouputSentence = "";
        for (int i = reversedSentenceArray.length - 1; i >= 0; i--) {
            ouputSentence += reversedSentenceArray[i] + " ";
        }
        return ouputSentence.replaceAll("\\s+$", "");

    }

    public int countLinuxUsers(List<User> users) {
        int noOfLinuxUsers = 0;
        for (User eachUser : users) {
            if (eachUser.getType().equals("Linux")) {
                noOfLinuxUsers += 1;
            }
        }
        return noOfLinuxUsers;
    }
}
