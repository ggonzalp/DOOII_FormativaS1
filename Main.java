/**
 * Clase principal del programa
 * Es la entrada al sistema.
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("=====================");
    System.out.println("----- SpeedFast -----");
    System.out.println("=====================");

    Pedido pedido1 = new PedidoComida("PEDIDO COMIDA", 101, new DireccionEntrega(202, "Los aromos", "Chillán"), 2, true);
    try {
      pedido1.procesarPedido("Isidora López");
    }catch (IllegalStateException e) {
      System.out.println(e.getMessage() + "\nNo es posible asignar repartidor para este pedido.");
    }

    System.out.println("\n----------------------------");

    Pedido pedido2 = new PedidoEncomienda("PEDIDO ENCOMIENDA", 102, new DireccionEntrega(303, "Las azucenas", "Concepción"), 12, false);
    try {
      pedido2.procesarPedido("Roberto Labra");
    } catch (IllegalStateException e) {
      System.out.println(e.getMessage() + "\nNo es posible asignar repartidor para este pedido.");
    }

    System.out.println("\n----------------------------");

    Pedido pedido3 = new PedidoExpress("PEDIDO EXPRESS",103, new DireccionEntrega(202, "Los maitenes", "Temuco"), 6, true);
    try {
      pedido3.procesarPedido("Martina Donaire");
    } catch (IllegalStateException e) {
      System.out.println(e.getMessage() + "\nNo es posible asignar repartidor para este pedido.");
    }

    System.out.println("\n---Comparación tiempos de pedido---");
    System.out.println("Pedido Comida: " + pedido1.calcularTiempoEntrega() + " minutos");
    System.out.println("Pedido Encomienda: " + pedido2.calcularTiempoEntrega() + " minutos");
    System.out.println("Pedido Express: " + pedido3.calcularTiempoEntrega() + " minutos");

    System.out.println("\n======================" +
                       "\n---FIN DEL PROGRAMA---" +
                       "\n======================");
  }
}
