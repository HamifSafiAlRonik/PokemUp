package com.company;

import java.util.*;

public class Attack implements Comparable<Attack> {
    private Pokemon user;
    private Pokemon target;
    private Move move;

    public Attack(Pokemon user, Pokemon target, Move m) {
        this.user = user;
        this.target = target;
        this.move = m;
    }

    public int compareTo(Attack other){
        int retVal;
        if(move.priority != other.move.priority)
            return  move.priority - other.move.priority;
        else
            return  (this.user.speed - other.user.speed);
    }

    public void execute(){
        target.takeHit(move,user.attack);
    }
}
