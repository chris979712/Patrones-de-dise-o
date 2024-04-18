package main;
import abstractfactory.aplicacion.Aplicacion;
import abstractfactory.factories.*;
import java.util.Scanner;
/**
 *
 * @author chris
 */
public class Main {
    public static void main(String[] args){
        int opcion=0;
        Scanner sc = new Scanner(System.in);
        ItemFactory factory;
        do{
            System.out.println("Seleccione el tipo de elementos que desee usar \n1.-Nintendo 64\n2.-Nintendo switch\n3.-Salir");
            opcion = sc.nextInt();
            switch(opcion){
                case 1 -> {
                    factory = new Nintendo64Factory();
                    Aplicacion aplicacionElementosNintendo64 = new Aplicacion(factory);
                    aplicacionElementosNintendo64.obtenerElementos();
                    aplicacionElementosNintendo64.mostrarElementos();
                }
                case 2 -> {
                    factory = new NintendoSwitchFactory();
                    Aplicacion aplicacionElementosNintendoSwitch = new Aplicacion(factory);
                    aplicacionElementosNintendoSwitch.obtenerElementos();
                    aplicacionElementosNintendoSwitch.mostrarElementos();
                }
                case 3 -> System.out.println("Adios :)");
                default -> System.out.println("Ingrese una opcion válida");
            }   
        }while(opcion==1||opcion==2);
    }
}
