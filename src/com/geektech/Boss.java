package com.geektech;

public class Boss extends Player{

 private int bossDefence;
 

public Boss(int health, int damage, int bossDefence) {
    super(health, damage,bossDefence);
    this.bossDefence = bossDefence + 20;
}
}
