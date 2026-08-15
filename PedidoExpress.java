/**
 * Clase que representa un pedido express
 */

public class PedidoExpress extends Pedido {

    private boolean validarRepartidorCercano;

    /**
     * Constructor de la clase PedidoExpress
     * @param tipoPedido Tipo de pedido.
     * @param idPedido Número de identificación del pedido.
     * @param direccionEntrega Dirección de entrega del pedido.
     * @param validarRepartidorCercano validación de ubicación cercana.
     */

    public PedidoExpress(String tipoPedido, int idPedido, DireccionEntrega direccionEntrega, boolean validarRepartidorCercano) {
        super(tipoPedido, idPedido, direccionEntrega);

        this.validarRepartidorCercano = validarRepartidorCercano;
    }

    //Método getter
    public boolean getValidarRepartidorCercano() {
        return validarRepartidorCercano;
    }

    //Método setter
    public void setValidarRepartidorCercano(boolean validarRepartidorCercano) {
        this.validarRepartidorCercano = validarRepartidorCercano;
    }

    /**
     * Método asignarRepartidor
     * muestra la información en consola.
     */

    @Override
    public void asignarRepartidor() {
        super.asignarRepartidor();
        System.out.println("\nValidando cercanía del repartidor...");
    }
    /**
     * Método asignarRepartidor
     *
     * @param nombreRepartidor Nombre del repartidor.
     * @throws IllegalStateException Si el repartidor está lejos de la ubicación de la solicitud de reparto, no es posible asignar el pedido.
     */

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        asignarRepartidor();

        //Validador de validarRepartidorCercano.
        if (validarRepartidorCercano == true) {
            System.out.println("Repartidor cercano: Sí.");
            System.out.println("\nCercanía validada con GPS correctamente.");
        } else {
            throw new IllegalStateException("Repartidor cercano: No.");
        }
        System.out.println("Asignando repartidor...");
        System.out.println("Repartidor asignado: " + nombreRepartidor);
    }
}

