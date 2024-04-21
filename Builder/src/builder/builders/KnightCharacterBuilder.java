package builder.builders;

import builder.classes.Character;


public class KnightCharacterBuilder extends CharacterBuilder{
    Character knight;

    @Override
    public void build() {
        System.out.println("Construyendo personaje...");
        this.knight = new Character();
    }

    @Override
    public Character getCharacter() {
        System.out.println("¡El caballero ha sido creado!");
        return this.knight;
    }

    @Override
    public void setAgility(String agility) {
        System.out.println("Por su tamaño debe ser alguien lento");
        this.knight.setAgility(agility);
    }
    @Override
    public void setArmor(String armor) {
        System.out.println("La armadura de hierro ha sido asignada");
        this.knight.setArmor(armor);
    }

    @Override
    public void setHealth(int health) {
        System.out.println("La salud del caballero es insuperable");
        this.knight.setHealth(health);
    }

    @Override
    public void setRace(String race) {
        System.out.println("El caballero pertenece a la raza de los gigantes");
        this.knight.setRace(race);
    }

    @Override
    public void setStrength(int strength) {
        System.out.println("Su fuerza es la de 20 hombres");
        this.knight.setStrength(strength);
    }

    @Override
    public void setType(String type) {
        System.out.println("Este personaje es un caballero");
        this.knight.setType(type);
    }

    @Override
    public void setWeapon(String weapon) {
        System.out.println("La espada de hierro ha sido asignada");
        this.knight.setWeapon(weapon);
    }
    
}
