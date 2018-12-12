package com.company;

class  Move{
    private String name;
    public final Type type;
    public final int power;
    public final int priority;

    public String getName(){
        return name;
    }
    public Move(String _name, Type _type, int _power, int _priority){
        name = _name;
        type = _type;
        power = _power;
        priority = _priority;
    }


    public void use(Pokemon user,Pokemon target){
        System.out.println(user.name + " used " + this.name + " on " + target.name +". " );
        target.takeHit(this,user.attack);
    }

}
