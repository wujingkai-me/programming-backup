package com.generic;

public class User implements Comparable<User> {
    private int points;
    
    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User Other) {        
        return points - Other.points;
    }

    @Override
    public String toString() {
        return "point = " + points;
    }

}
