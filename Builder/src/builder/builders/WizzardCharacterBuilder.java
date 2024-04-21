package builder.builders;

import builder.classes.Character;

public class WizzardCharacterBuilder extends CharacterBuilder{
    Character wizzard;

    @Override
    public void build() {
        System.out.println("Construyendo personaje...");
        this.wizzard = new Character();
    }

    @Override
    public Character getCharacter() {
        System.out.println("¡El Mago ha sido creado!");
        return this.wizzard;
    }

    @Override
    public void setHealth(int health) {
        System.out.println("La salud es ???");
        this.wizzard.setHealth(health);
    }

    @Override
    public void setRace(String race) {
        System.out.println("Se dice que no es de este mundo...");
        this.wizzard.setRace(race);
    }

    @Override
    public void setStrength(int strength) {
        System.out.println("Su fuerza se debe a la cantidad de energía que maneja");
        this.wizzard.setStrength(strength);
    }

    @Override
    public void setType(String type) {
        System.out.println("Este tipo de personaje es un mago");
        this.wizzard.setType(type);
    }

}
