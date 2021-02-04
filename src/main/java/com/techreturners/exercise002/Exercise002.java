package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester( Person p1) {
        if (p1.getCity() == "Manchester") return true;
        else return false;
    }

    public boolean canWatchFilm(Person p2, int ageLimit) {
       if(ageLimit<=p2.getAge()) return true;
       else return false;
    }
    
}
