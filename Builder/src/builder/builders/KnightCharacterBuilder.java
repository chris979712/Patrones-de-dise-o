package builder.builders;

import builder.classes.Character;


public class KnightCharacterBuilder extends CharacterBuilder{
    Character knight;

    @Override
    public void build() {
         this.knight = new Character();
    }

    @Override
    public Character getCharacter() {
        return this.knight;
    }

    @Override
    public void setAgility(String agility) {
        this.knight.setAgility(agility);
    }
    @Override
    public void setArmor(String armor) {
        this.knight.setArmor(armor);
    }

    @Override
    public void setHealth(int health) {
        this.knight.setHealth(health);
    }

    @Override
    public void setRace(String race) {
        this.knight.setRace(race);
    }

    @Override
    public void setStrength(int strength) {
        this.knight.setStrength(strength);
    }

    @Override
    public void setType(String type) {
        this.knight.setType(type);
    }

    @Override
    public void setWeapon(String weapon) {
        this.knight.setWeapon(weapon);
    }
    
}
