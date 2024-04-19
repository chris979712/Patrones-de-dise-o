/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder.classes;

/**
 *
 * @author chris
 */
public class Character {
    String agility;
    String armor;
    String race;
    String weapon;
    String type;
    int health;
    int strength;

    public void setAgility(String agility) {
        this.agility = agility;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    
    
    @Override
    public String toString() {
        return "Character{" + "agility=" + agility + ", armor=" + armor + ", race=" + race + ", weapon=" + weapon + ", type=" + type + ", health=" + health + ", strength=" + strength + '}';
    }
    
}
