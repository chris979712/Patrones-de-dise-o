package builder.builders;

import builder.classes.Character;

public class WizzardCharacterBuilder implements CharacterBuilder{
    Character wizzard;

    @Override
    public void build() {
         this.wizzard = new Character();
    }

    @Override
    public Character getCharacter() {
        return this.wizzard;
    }

    @Override
    public void setAgility(String agility) {
        this.wizzard.setAgility(agility);
    }
    @Override
    public void setArmor(String armor) {
        this.wizzard.setArmor(armor);
    }

    @Override
    public void setHealth(int health) {
        this.wizzard.setHealth(health);
    }

    @Override
    public void setRace(String race) {
        this.wizzard.setRace(race);
    }

    @Override
    public void setStrength(int strength) {
        this.wizzard.setStrength(strength);
    }

    @Override
    public void setType(String type) {
        this.wizzard.setType(type);
    }

    @Override
    public void setWeapon(String weapon) {
        this.wizzard.setWeapon(weapon);
    }
}
