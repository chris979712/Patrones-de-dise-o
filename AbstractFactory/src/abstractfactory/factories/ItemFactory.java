package abstractfactory.factories;
import abstractfactory.clases.Moneda;
import abstractfactory.clases.BloqueInterrogante;
/**
 *
 * @author chris
 */
public interface ItemFactory {
    public Moneda crearMoneda();
    public BloqueInterrogante crearBloqueInterrogante();
}
