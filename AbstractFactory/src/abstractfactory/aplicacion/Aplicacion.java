package abstractfactory.aplicacion;
import abstractfactory.clases.BloqueInterrogante;
import abstractfactory.clases.Moneda;
import abstractfactory.factories.ItemFactory;
/**
 *
 * @author chris
 */
public class Aplicacion {
    private final ItemFactory factory;
    private Moneda moneda;
    private BloqueInterrogante bloqueInterrogante;
    
    public Aplicacion(ItemFactory factory){
        this.factory = factory;
    }
    
    public void obtenerElementos(){
        this.moneda = factory.crearMoneda();
        this.bloqueInterrogante = factory.crearBloqueInterrogante();
    }
    
    public void mostrarElementos(){
        System.out.println(moneda.mostrarMoneda());
        System.out.println(bloqueInterrogante.mostrarBloqueInterrogante());
    }
    
}
