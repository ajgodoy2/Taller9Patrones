/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructural;

import creacional.ComprobanteElectronico;
import java.util.List;

/**
 *
 * @author CltControl
 */
public class FooterDecorator extends DetalleDecorator {

    public FooterDecorator(ComprobanteElectronico comprobante) {
    }

    public FooterDecorator() {
    }

    @Override
    public List<String> getDetallesEmisor() {
        return detallesEmisor;
    }

}
