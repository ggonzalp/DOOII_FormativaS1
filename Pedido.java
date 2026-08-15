/**
 * Clase base del sistema de pedidos.
 * Representa un pedido genérico.
 */

public class Pedido {

    private String tipoPedido;
    private int idPedido;
    private DireccionEntrega direccionEntrega;

    /**
     * Constructor de la clase Pedido:
     * @param tipoPedido tipo de pedido.
     * @param idPedido Número de identificación del pedido.
     * @param direccionEntrega Dirección de entrega del pedido.
     */
    public Pedido(String tipoPedido, int idPedido, DireccionEntrega direccionEntrega){

        this.tipoPedido = tipoPedido;
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
    }

    //Métodos getter.

    public String getTipoPedido(){
        return tipoPedido;
    }

    public int getId() {
        return idPedido;
    }

    public DireccionEntrega getDireccionEntrega() {
        return direccionEntrega;
    }

    //Métodos setter.

    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public void setId(int idPedido) {
        this.idPedido = idPedido;
    }

    public void setDireccionEntrega(DireccionEntrega direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    /**
     * Método asignarRepartidor
     * Muestra los datos en consola.
     */
    public void asignarRepartidor() {

        System.out.println("\n[" + tipoPedido + "]");
        System.out.println("N° " + idPedido);
        System.out.println("Dirección de entrega: " + direccionEntrega);
    }

    /**
     * Método asignarRepartidor
     * @param nombreRepartidor Nombre del repartidor.
     */
    public void asignarRepartidor(String nombreRepartidor){
        asignarRepartidor();
        System.out.println("Buscando repartidor...");
        System.out.println("Repartidor asignado: " + nombreRepartidor);
    }
}
