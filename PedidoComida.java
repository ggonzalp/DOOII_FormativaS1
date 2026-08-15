/**
 * Clase que representa un pedido de comida.
 */

public class PedidoComida extends Pedido {

    private boolean validarMochila;

    /**
     * Constructor de la clase PedidoComida.
     * @param tipoPedido Tipo de pedido.
     * @param idPedido Número de identificación del pedido.
     * @param direccionEntrega Dirección de entrega del pedido.
     * @param validarMochila Validación de mochila térmica.
     */
    public PedidoComida(String tipoPedido, int idPedido, DireccionEntrega direccionEntrega, boolean validarMochila) {
        super(tipoPedido, idPedido, direccionEntrega);

        this.validarMochila = validarMochila;
    }
    //Método getter
     public boolean getValidarMochila() {
        return validarMochila;
    }
    //Método setter
    public void setValidarMochila(boolean validarMochila) {
        this.validarMochila = validarMochila;
    }

    /**
     * Método asignarRepartidor
     * muestra la información en consola.
     */
    @Override
    public void asignarRepartidor() {
        super.asignarRepartidor();
        System.out.println("\nValidando mochila térmica...");
    }

    /**
     * Método asignarRepartidor
     * @param nombreRepartidor Nombre del repartidor.
     * @throws IllegalStateException Si el repartidor no cuenta con mochila térmica no es posible asignar el pedido.
     */
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        asignarRepartidor();

        //Validador de validarMochila.
        if (validarMochila == true) {
            System.out.println("Mochila térmica: Sí.");
            System.out.println("\nMochila térmica validada correctamente.");
        } else {
            throw new IllegalStateException("Mochila térmica: No.");
        }
        System.out.println("Asignando repartidor...");
        System.out.println("Repartidor asignado: " + nombreRepartidor);
    }
}
