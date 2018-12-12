package com.company;

import java.net.SocketTimeoutException;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        Move aerialAce = new Move("Aerial ace", Type.Flying, 100,0),
            bolttackle = new Move("Bolt Tackle", Type.Electric, 140,0),
            thunder = new Move("Thunder", Type.Electric, 100,0),
            quickAttack = new Move("Quick Attack", Type.Normal, 40,1)
        ;
        Pokemon pidgeot = new Pokemon("Pidgeot",240,100,80,70,80,100,
                Type.Normal, Type.Flying,
                aerialAce,quickAttack);
        Pokemon pikachu = new Pokemon("Pikachu",120,50,60,80,65,110,
                Type.Normal, Type.Flying,
                bolttackle , thunder);
        Trainer ash = new Trainer("Ash",pikachu);
        Trainer gary = new Trainer("Gary",pidgeot);

        Battle battle = new Battle(ash,gary);
        battle.resolve();

    }
}

