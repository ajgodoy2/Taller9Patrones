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
public class DetalleDecorator extends ComprobanteElectronico {
    protected ComprobanteElectronico comprobante;

    public DetalleDecorator(ComprobanteElectronico comprobante) {
        this.comprobante=comprobante;
    }

    public DetalleDecorator() {
    }

    @Override
    public List<String> getDetallesEmisor() {
        return detallesEmisor;
    }

    public ComprobanteElectronico getComprobante() {
        return null;
    }

}
