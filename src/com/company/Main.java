package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Move aerialAce = new Move("Aerial ace", Type.Flying, 100,0),
            bolttackle = new Move("Bolt Tackle", Type.Electric, 140,0),
            thunder = new Move("Thunder", Type.Electric, 100,0),
            slam = new Move("Slam", Type.Normal, 75,0)
        ;
        Pokemon pidgey = new Pokemon("Pidgeot",240,100,80,70,80,100,
                Type.Normal, Type.Flying,
                aerialAce,slam);
        Pokemon pikachu = new Pokemon("Pikachu",120,50,60,80,65,110,
                Type.Normal, Type.Flying,
                bolttackle , thunder);
        Trainer ash = new Trainer("Ash",pikachu);
        Trainer gary = new Trainer("Gary",pidgey);

        Battle battle = new Battle(ash,gary);
        battle.resolve();

    }
}

