package com.techreturners.exercise002;

public class Person {
    private String firstName;
    private String lasName;
    private String City;
    private int Age;

public Person(String first_name,String last_name,String city,int age){
    this.firstName=first_name;
    this.lasName=last_name;
    this.City=city;
    this.Age=age;
}
public String getFirstName(){
    return firstName;
}
public  String getLasName(){
    return lasName;
}
public String getCity(){ return City; }
public  int getAge(){
    return Age;
}
}
