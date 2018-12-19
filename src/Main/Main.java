package Main;
import comportamental.EsquemaOffline;
import comportamental.EsquemaOnline;
import creacional.ComprobanteElectronico;
import creacional.ComprobantesFactory;
import creacional.GuiaRemision;
import creacional.NotaCredito;
import comportamental.AutorizadorSRI;
import comportamental.Esquema;
import estructural.FooterDecorator;
import estructural.LogoDecorator;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ComprobantesFactory manager = new ComprobantesFactory();
        
        //Factura
        ComprobanteElectronico factura = manager.getComprobante("factura");

        factura.setClaveAcceso("mayonesa123");
        factura.setCodigo(12324);
        factura.setFecha(LocalDate.now());
        factura.setNombreCliente("Luiggi");
        factura.setNumeroAutorizacion("244475687");
        
        //Autorizacion Offline patron comportamental
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
    
        //Autorizacion online patron comportamental
        AutorizadorSRI autorizadorOnline = new AutorizadorSRI((Esquema) new EsquemaOnline());
        autorizadorOnline.autorizar(credito);
        
        System.out.println("Nota de credito: \n"+credito);
        
        //Guia de remision
        ComprobanteElectronico remision = (GuiaRemision)manager.getComprobante("guiaremision");
        remision.setCodigo(243546);
        remision.setClaveAcceso("barcelona123");
        remision.setNombreCliente("Josue Lasso");
        remision.setNumeroAutorizacion("2018");
        remision.setFecha(LocalDate.now());
        System.out.println("Guia de remision:\n"+remision);
        
        //Agregar un lema y un logo
        System.out.println("Decorators");
        credito=new FooterDecorator(credito);
        System.out.println(credito.getDetallesEmisor());
        factura=new LogoDecorator(factura);
        System.out.println(factura.getDetallesEmisor());
        
    }
    
}