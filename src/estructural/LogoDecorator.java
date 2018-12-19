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
public class LogoDecorator extends DetalleDecorator {

    public LogoDecorator(ComprobanteElectronico comprobante) {
        super(comprobante);
    }

    public LogoDecorator() {
    }

    @Override
    public List<String> getDetallesEmisor() {
        String logo = "Se agrego un logo";
        this.comprobante.getDetallesEmisor().add(logo);
        return this.comprobante.getDetallesEmisor();
    }

}
