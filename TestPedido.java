
/**
 *  Clase para probar el resto de clases
 *  @author Sara López Vicente
 */
public class TestPedido
{
    private Pedido pedido1; 
    private Pedido pedido2; 

    /**
     * Constructor  
     */
    public TestPedido()    {
        // crear pedido1
        pedido1 = new Pedido(new Fecha(4, 9, 2019), 
                  new Cliente("Juan Soto", "Avda. Pío XII", "Pamplona", "Navarra"),
                  new LineaPedido(new Producto("Rotulador fosforescente", 6.70), 20),
                  new LineaPedido(new Producto("Memoria USB 64GB", 14.80), 10));  
        // crear pedido2
        pedido2 = new Pedido(new Fecha(8, 10, 2019), 
                  new Cliente("Elisa Nuin", "C/ Río Alzania 7", "Pamplona", "Navarra"),
                  new LineaPedido(new Producto("Sacapuntas manual", 16.64), 8),
                  new LineaPedido(new Producto("Corrector tippex", 5.99), 20));

    }

    /**
     * Muestra la información de los dos pedidos (ver enunciado)
     */
    public void mostrarPedidos() {
        System.out.println("Pedido 1\n------------------" + pedido1.toString());
        System.out.println("Pedido 2\n------------------" + pedido2.toString());

    }
}
