package builder.builders;

import builder.classes.Character;

public class NormalCharacterBuilder extends CharacterBuilder {

    Character normal;

    @Override
    public void build() {
        System.out.println("Construyendo personaje...");
         this.normal = new Character();
    }

    @Override
    public Character getCharacter() {
        System.out.println("¡El personaje normal ha sido creado!");
        return this.normal;
    }

    @Override
    public void setHealth(int health) {
        System.out.println("La salud es demasiado baja");
        this.normal.setHealth(health);
    }

    @Override
    public void setRace(String race) {
        System.out.println("Este personaje pertenece a la raza humana");
        this.normal.setRace(race);
    }
    
    @Override
    public void setType(String type) {
        System.out.println("Este personaje es uno normal");
        this.normal.setType(type);
    }
}
