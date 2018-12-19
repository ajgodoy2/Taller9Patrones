package Main;
import comportamental.EsquemaOffline;
import comportamental.EsquemaOnline;
import creacional.ComprobanteElectronico;
import creacional.ComprobantesFactory;
import creacional.GuiaRemision;
import creacional.NotaCredito;
import estructural.AutorizadorSRI;
import estructural.Esquema;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ComprobantesFactory manager = new ComprobantesFactory();
        
        //FActura
        ComprobanteElectronico factura = manager.getComprobante("factura");

        factura.setClaveAcceso("mayonesa123");
        factura.setCodigo(12324);
        factura.setFecha(LocalDate.now());
        factura.setNombreCliente("Luiggi");
        factura.setNumeroAutorizacion("244475687");
        AutorizadorSRI autorizadorOffline = new AutorizadorSRI((Esquema) new EsquemaOffline());
        autorizadorOffline.autorizar(factura);
        
        System.out.println("\nFactura: \n" +factura);
        
        
        //Nota de credito
        ComprobanteElectronico credito = (NotaCredito)manager.getComprobante("notacredito");
        credito.setNumeroAutorizacion("1997");
        credito.setFecha(LocalDate.now());
        credito.setClaveAcceso("SalsadeTomate");
        credito.setCodigo(1110001);
        credito.setNombreCliente("Steven");
    
        AutorizadorSRI autorizadorOnline = new AutorizadorSRI((Esquema) new EsquemaOnline());
        autorizadorOnline.autorizar(credito);
        
        System.out.println("NOTA DE CREDITO: \n"+credito);
        
        
        //Guia de remision
        ComprobanteElectronico remision = (GuiaRemision)manager.getComprobante("guiaremision");
        remision.setCodigo(243546);
        remision.setClaveAcceso("barcelona123");
        remision.setNombreCliente("Jeremy Laso");
        remision.setNumeroAutorizacion("2018");
        remision.setFecha(LocalDate.now());
        System.out.println("GUIA DE REMISION:\n"+remision);
    }
    
}