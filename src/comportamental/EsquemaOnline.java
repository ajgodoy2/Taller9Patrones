/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamental;

import creacional.ComprobanteElectronico;
import java.util.Random;

/**
 *
 * @author CltControl
 */
public class EsquemaOnline implements Esquema{
    
     @Override
     public void autorizar(ComprobanteElectronico comprobante){
     Random rand = new Random();
     int n = rand.nextInt(10000000) + 1;
     String codigo= Integer.toString(n);
     comprobante.setNumeroAutorizacion(codigo);
    }
}
