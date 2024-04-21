package builder.builders;

import builder.classes.Character;

public class WizzardCharacterBuilder extends CharacterBuilder{
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

}
