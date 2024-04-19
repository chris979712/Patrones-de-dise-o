package builder.builders;
import builder.classes.Character;

public interface CharacterBuilder {
    public void build();
    public Character getCharacter();
    public void setAgility(String agility);
    public void setArmor(String armor);
    public void setHealth(int health);
    public void setRace(String race);
    public void setStrength(int strength);
    public void setType(String type);
    public void setWeapon(String weapon);
}
