package com.geektech;

public class Player {
    private int health;
    private int damage;
    private int superDamage;


    public void setSuperDamage(int superDamage) {
        this.superDamage = superDamage;
    }

    public Player(int health, int damage, int superDamage) {
        this.health = health;
        this.damage = damage;
        this.superDamage = damage + 10;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getSuperDamage() {
        return superDamage;
    }

}
