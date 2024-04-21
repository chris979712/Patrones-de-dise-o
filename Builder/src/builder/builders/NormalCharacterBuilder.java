package builder.builders;

import builder.classes.Character;

public class NormalCharacterBuilder extends CharacterBuilder {

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
    public void setType(String type) {
        this.normal.setType(type);
    }
}
