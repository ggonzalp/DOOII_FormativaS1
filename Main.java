/**
 * Clase principal del programa
 * Es la entrada al sistema.
 */
public class Main {
  public static void main(String[] args) {
    System.out.println("=====================");
    System.out.println("----- SpeedFast -----");
    System.out.println("=====================");

    System.out.println("\n--- PRUEBA DE SOBRECARGA ---");

    PedidoComida pedidoComida = new PedidoComida("PEDIDO COMIDA", 1, new DireccionEntrega(23, "Las golondrinas", "Santiago"), true);
    PedidoEncomienda pedidoEncomienda = new PedidoEncomienda("PEDIDO ENCOMIENDA", 2, new DireccionEntrega(567, "Los gorriones", "Valparaíso"), false);
    PedidoExpress pedidoExpress = new PedidoExpress("PEDIDO EXPRESS", 3, new DireccionEntrega(536, "Los canarios", "Concepción"), true);

    try {
      pedidoComida.asignarRepartidor("Isidora Martínez");
    } catch (IllegalStateException e) {
      System.out.println(e.getMessage() + "\nEl pedido necesita mochila térmica. \nNo es posible asignar repartidor. ");
    }

    System.out.println("\n-----------------------------\n");

    try{
      pedidoEncomienda.asignarRepartidor("Roberto Llanos");
    } catch (IllegalStateException e) {
      System.out.println(e.getMessage() + "\nEl pedido no cuenta con el peso ni embalaje adecuados.");
    }

    System.out.println("\n-----------------------------\n");

    try{
      pedidoExpress.asignarRepartidor("Lucas Martínez");

    } catch (IllegalStateException e) {
      System.out.println(e.getMessage() + "\nNo hay repartidores cerca de la ubicación solicitada.");
    }

    System.out.println("\n-----------------------------\n");

    System.out.println("--- PRUEBA DE SOBRESCRITURA ---");

    pedidoComida.asignarRepartidor();
    System.out.println("\n-----------------------------\n");
    pedidoEncomienda.asignarRepartidor();
    System.out.println("\n-----------------------------\n");
    pedidoExpress.asignarRepartidor();
    System.out.println("\n-----------------------------\n");
  }
}
