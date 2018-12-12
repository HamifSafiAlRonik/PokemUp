package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class Trainer{
    ArrayList<Pokemon> party = new ArrayList<Pokemon>();
    String name;

    public boolean canFight() {
        for (Pokemon p:party) {
            if(!p.isDead())
                return true;
        }
        return false;
    }
    public Trainer(String _name, Pokemon... pokemons){
        name = _name;
        for (Pokemon p:pokemons) {
            party.add(p);
        }
        System.out.println("Pokemons "+ pokemons.length + " party " + party.size());

    }

    //needs a better name
    public Attack takeTurn(Scanner cin, Pokemon target){
        party.get(0).printTurn();
        System.out.println("enter command: ");
        int command=cin.nextInt();

        return party.get(0).receiveCommand(command,target);
    }
}
