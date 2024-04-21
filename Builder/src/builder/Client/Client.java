package builder.Client;

import builder.classes.Character;
import builder.builders.CharacterDirector;
import java.util.Scanner;

public class Client {

    
    public static void main(String[] args) {
       int nivel = 0;
       Scanner sc = new Scanner(System.in);
       
       do{
           System.out.println("Ingrese el nivel de su personaje");
           nivel = sc.nextInt();
           
           if(nivel<0){
               System.out.println("Ingrese un nivel válido");
           }else{
               CharacterDirector director = new CharacterDirector();
               Character personaje = director.createCharacter(nivel);
               System.out.println(personaje.toString());
           }
           
       }while(nivel!=-1);
    }
    
}
