package com.company;

public class Player {
    private int maxhealth;
    private int currenthealth;
    private int armor;
    private int currentarmor;
    private int attack;
    private int currentattack;
    public void start(){
        maxhealth=30;
        currenthealth=maxhealth;
        armor=0;
        currentarmor=armor;
        attack=3;
        currentattack=attack;
    }
    public void Attack(villain x){
        x.attacked(currentattack);
    }
}
