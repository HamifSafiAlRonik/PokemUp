package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class Trainer{
    private  ArrayList<Pokemon> party = new ArrayList<Pokemon>();
    private int curPokeIndex;//index in party of the current pokemon
    private Pokemon curPokemon;
    String name;

    public boolean canFight() {
        for (Pokemon p:party) {
            if(!p.isDead())
                return true;
        }
        return false;
    }

    public Pokemon getCurPokemon(){
        Pokemon curPokemon = null;
        if(party.size() > 0 && curPokeIndex < party.size())
            curPokemon = party.get(curPokeIndex);
        return  curPokemon;
    }

    public Pokemon swapPokemon(){//simply swaps with next pokemon
        return swapPokemon(curPokeIndex+1);
    }
    public Pokemon swapPokemon(int newIndex){
           newIndex = newIndex % party.size();
           Pokemon curPoke = getCurPokemon();
           if(!party.get(newIndex).isDead()){
               System.out.println(this.name+" recalled " + getCurPokemon().name +"!" );
               curPokeIndex = newIndex;
               curPoke = getCurPokemon();
               System.out.println(this.name+" sent out " + getCurPokemon().name +"!" );
           }
           return curPoke;
    }

    public Trainer(String _name, Pokemon... pokemons){//... used for quickness,use list or something better
        name = _name;
        curPokeIndex = 0;
        curPokemon = null;
        for (Pokemon p:pokemons) {
            party.add(p);
        }
        if(party.size() > 0)
            curPokemon = getCurPokemon();
        System.out.println("Pokemons "+ pokemons.length + " party " + party.size());
    }

    //needs a better name
    public Attack takeTurn(Scanner cin, Pokemon target){
        Pokemon curPoke = getCurPokemon();
        if(curPoke.isDead())
            curPoke = swapPokemon();

        curPoke.printTurn();
        System.out.println("enter command: ");
        int command=cin.nextInt();

        return curPoke.receiveCommand(command,target);
    }
}
