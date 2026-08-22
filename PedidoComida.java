/**
 * Clase que representa un pedido de comida.
 */

public class PedidoComida extends Pedido {

    private boolean validarMochila;

    /**
     * Constructor de la clase PedidoComida.
     *
     * @param tipoPedido       Tipo de pedido.
     * @param idPedido         Número de identificación del pedido.
     * @param direccionEntrega Dirección de entrega del pedido.
     * @param distanciaKm      Distancia en kilómetros del lugar de entrega del producto.
     * @param validarMochila   Valida la presencia de mochila térmica.
     */
    public PedidoComida(String tipoPedido, int idPedido, DireccionEntrega direccionEntrega, int distanciaKm, boolean validarMochila) {
        super(tipoPedido, idPedido, direccionEntrega, distanciaKm);

        this.validarMochila = validarMochila;
    }

    //Metodo getter
    public boolean getValidarMochila() {
        return validarMochila;
    }

    //Metodo setter
    public void setValidarMochila(boolean validarMochila) {
        this.validarMochila = validarMochila;
    }

    /**
     * Metodo asignarRepartidor
     * @param nombreRepartidor Nombre del repartidor.
     * @throws IllegalStateException Si el repartidor no cuenta con mochila térmica no es posible asignar el pedido.
     */
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        super.asignarRepartidor();
        System.out.println("\nValidando mochila térmica...");

        //Validador de validarMochila.
        if (validarMochila == true) {
            System.out.println("Mochila térmica: Sí.");
            System.out.println("Mochila térmica validada correctamente.");
        } else {
            throw new IllegalStateException("Mochila térmica: No.");
        }
        System.out.println("\nAsignando repartidor...");
        System.out.println("Repartidor asignado: " + nombreRepartidor);
    }

    /**
     * Metodo que calcula el tiempo de entrega del pedido.
     * @return tiempo estimado de entrega del pedido.
     */
    @Override
    public int calcularTiempoEntrega() {
        return 15 + (2 * getDistanciaKm());
    }
}
