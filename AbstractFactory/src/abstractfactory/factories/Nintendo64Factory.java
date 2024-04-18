package abstractfactory.factories;

import abstractfactory.clases.BloqueInterrogante;
import abstractfactory.clases.Moneda;
import abstractfactory.clases.Nintendo64Moneda;
import abstractfactory.clases.Nintendo64BloqueInterrogante;

/**
 *
 * @author chris
 */
public class Nintendo64Factory implements ItemFactory{

    @Override
    public Moneda crearMoneda() {
        return new Nintendo64Moneda();
    }

    @Override
    public BloqueInterrogante crearBloqueInterrogante() {
        return new Nintendo64BloqueInterrogante();
    }
    
}
