package builder.builders;
import builder.classes.Character;

public abstract class CharacterBuilder {
    private Character character;
    
    public void build(){
        character = new Character();
    }
    public Character getCharacter(){
        return this.character;
    }
    public void setAgility(String agility){
    }
    public void setArmor(String armor){
    }
    public void setHealth(int health){
    }
    public void setRace(String race){
    }
    public void setStrength(int strength){
    }
    public void setType(String type){
    }
    public void setWeapon(String weapon){
    }
}
