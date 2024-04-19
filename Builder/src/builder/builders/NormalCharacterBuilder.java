package builder.builders;

import builder.classes.Character;

public class NormalCharacterBuilder implements CharacterBuilder {

    Character normal;

    @Override
    public void build() {
         this.normal = new Character();
    }

    @Override
    public Character getCharacter() {
        return this.normal;
    }

    @Override
    public void setHealth(int health) {
        this.normal.setHealth(health);
    }

    @Override
    public void setRace(String race) {
        this.normal.setRace(race);
    }

    @Override
    public void setStrength(int strength) {
        this.normal.setStrength(strength);
    }

    @Override
    public void setType(String type) {
        this.normal.setType(type);
    }

    @Override
    public void setAgility(String agility) {
        this.normal.setAgility(agility);
    }

    @Override
    public void setArmor(String armor) {
        this.normal.setArmor(armor);
    }

    @Override
    public void setWeapon(String weapon) {
        this.normal.setWeapon(weapon);
    }
}
