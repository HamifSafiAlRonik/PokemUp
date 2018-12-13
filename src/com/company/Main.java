package com.company;

import java.net.SocketTimeoutException;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //move and pokemon decalrations for testinf data should be moved to a database later on
        Move aerialAce = new Move("Aerial ace", Type.Flying, 100,0),
            bolttackle = new Move("Bolt Tackle", Type.Electric, 140,0),
            thunder = new Move("Thunder", Type.Electric, 100,0),
            quickAttack = new Move("Quick Attack", Type.Normal, 40,1),
            flameThrower = new Move("FlameThrower",Type.Fire,80,0)
        ;
        Pokemon pidgeot = new Pokemon("Pidgeot",240,100,80,70,80,100,
                Type.Normal, Type.Flying,
                aerialAce,quickAttack);
        Pokemon pikachu = new Pokemon("Pikachu",120,50,60,80,65,110,
                Type.Normal, Type.Flying,
                bolttackle , thunder);
        Pokemon charizard  = new Pokemon("Charizard",220,80,80,110,80,100,
                Type.Fire, Type.Flying,
                aerialAce, flameThrower
                );
        Trainer ash = new Trainer("Ash",pikachu,charizard);
        Trainer gary = new Trainer("Gary",pidgeot);

        Battle battle = new Battle(ash,gary);
        battle.resolve();
    }
}

