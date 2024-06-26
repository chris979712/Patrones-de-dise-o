package builder.builders;

import builder.classes.Character;

public class CharacterDirector {
    private CharacterBuilder builder;
    
    public Character createCharacter(int nivel){
        Character personaje = new Character();
        
        if(nivel>=0&&nivel<=100){
            this.builder = new NormalCharacterBuilder();
            builder.build();
            builder.setHealth(100);
            builder.setRace("Mortal");
            builder.setType("Normal");
            personaje = builder.getCharacter();
        }else if(nivel>=101&&nivel<=1000){
            this.builder = new KnightCharacterBuilder();
            builder.build();
            builder.setArmor("Iron");
            builder.setHealth(500);
            builder.setRace("Giant");
            builder.setStrength(230);
            builder.setType("Knight");
            builder.setWeapon("Sword");
            personaje = builder.getCharacter();
        }else if(nivel>=1001&&nivel<=2000){
            this.builder = new WizzardCharacterBuilder();
            builder.build();
            builder.setHealth(2500);
            builder.setRace("???");
            builder.setStrength(750);
            builder.setType("???");
            personaje = builder.getCharacter();
        }
        return personaje;
    }
}
