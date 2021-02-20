package com.techreturners.exercise001;

import java.util.Collections;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.charAt(0) + "." + lastName.charAt(0);
    }

    public double addVat(double originalPrice, double vatRate) {
        double answer = Math.round(originalPrice * (vatRate / 100 + 1) * 100.0) / 100.0;
        return answer;
    }

    public String checkSentenceReverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();

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
