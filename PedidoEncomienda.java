/**
 * Clase que representa un pedido de encomienda.
 */

public class PedidoEncomienda extends Pedido {

    private boolean validarEmpaquetado;

    /**
     * Constructor de la clase PedidoEncomienda
     *
     * @param tipoPedido         Tipo de pedido.
     * @param idPedido           Número de identificación del pedido.
     * @param direccionEntrega   Dirección de entrega del pedido.
     * @param validarEmpaquetado Validación de empaquetado (peso y embalaje).
     */
    public PedidoEncomienda(String tipoPedido, int idPedido, DireccionEntrega direccionEntrega, boolean validarEmpaquetado) {
        super(tipoPedido, idPedido, direccionEntrega);

        this.validarEmpaquetado = validarEmpaquetado;
    }

    //Método getter
    public boolean getValidarEmpaquetado() {
        return validarEmpaquetado;
    }

    //Método setter
    public void setValidarEmpaquetado(boolean validarEmpaquetado) {
        this.validarEmpaquetado = validarEmpaquetado;
    }

    /**
     * Método asignarRepartidor
     * muestra la información en consola.
     */
    @Override
    public void asignarRepartidor() {
        super.asignarRepartidor();
        System.out.println("\nValidando peso y embalaje... ");
    }

    /**
     * Método asignarRepartidor
     * @param nombreRepartidor Nombre del repartidor.
     * @throws IllegalStateException Si el paquete no cumple con el peso ni embalaje adecuado, no es posible asignar el pedido.
     */
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        asignarRepartidor();

        //Validador de validarEmpaquetado.
        if (validarEmpaquetado == true) {
            System.out.println("Peso y empaquetado correctos: Sí.");
            System.out.println("\nPeso y empaquetado validados correctamente.");
        } else {
            throw new IllegalStateException("Peso y empaquetado correctos: No.");
        }
        System.out.println("Asignando repartidor...");
        System.out.println("Repartidor asignado: " + nombreRepartidor);
    }
}
