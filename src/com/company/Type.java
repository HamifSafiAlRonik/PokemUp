package com.company;

enum Type{
    Fire,Water,Electric,Ice,Rock,Ground,Grass,Bug,Dragon,
    Flying,Psychic,Dark,Fighting,Normal,Ghost,Steel,Poison,
    None;//dummy for single type mons

    public Double getModifier(Type other){
        double retVal = 1;
        switch(this){
            case Fire:
                if(other == Water || other == Rock || other == Ground)
                    retVal = 2;
                else if(other == Grass || other == Fire || other == Bug)
                    retVal = .5;
                break;
            case Water:
                if(other == Grass || other == Electric )
                    retVal = 2;
                else if(other == Ice || other == Water || other == Fire)
                    retVal = .5;
                break;
            case Grass:
                if(other == Fire || other == Bug || other == Poison || other  == Flying || other == Ice)
                    retVal = 2;
                else if(other == Grass || other == Electric || other == Ground)
                    retVal = .5;
                break;
            case Electric:
                if(other == Ground)
                    retVal = 2;
                else if(other == Electric || other == Flying || other == Steel)
                    retVal = .5;
                break;
            case Poison:
                if(other == Ground || other == Psychic)
                    retVal = 2;
                else if(other == Bug || other == Grass || other == Fighting || other == Poison)
                    retVal = .5;
                break;
            case Flying:
                if(other == Electric )
                    retVal = 2;
                else if(other == Bug || other == Grass || other == Fighting )
                    retVal = .5;
                else if(other == Ground)
                    retVal = 0;
                break;
            default:
                System.out.println("I'm too lazy to implement " + this);
                retVal = 1;
                break;
        }
        return retVal;
    }

}
