public class Taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        ArrayList<String> productos = new ArrayList();
        productos.add("Maleta");
        productos.add("Fundas");
        productos.add("Jabones");

        productos.add("Lavaplatos");

        //
        //

        ComprobantesFactory manager = new ComprobantesFactory();
        
        
        ComprobanteElectronico factura =(Factura) manager.getComprobante("factura");

        factura.setClaveAcceso("mayonesa123");
              
        System.out.println("\nFactura: \n" +factura);
        
    }
    
}