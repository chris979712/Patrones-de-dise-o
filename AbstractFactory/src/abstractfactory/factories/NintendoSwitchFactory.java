package abstractfactory.factories;

import abstractfactory.clases.BloqueInterrogante;
import abstractfactory.clases.Moneda;
import abstractfactory.clases.NintendoSwitchBloqueInterrogante;
import abstractfactory.clases.NintendoSwitchMoneda;
/**
 *
 * @author chris
 */
public class NintendoSwitchFactory implements ItemFactory{

    @Override
    public Moneda crearMoneda() {
        return new NintendoSwitchMoneda();
    }

    @Override
    public BloqueInterrogante crearBloqueInterrogante() {
        return new NintendoSwitchBloqueInterrogante();
    }
    
}
