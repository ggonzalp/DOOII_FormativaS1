#Speedfast

Proyecto de sistema para la gestión de pedidos para una empresa de reparto a domicilio, desarrollado en Java.
implementar una jerarquía de clases, aplicando el concepto de polimorfismo mediante métodos sobrecargados y métodos sobrescritos

#Descripción
SpeedFast ofrece tres tipos de servicio, y cada uno tiene un criterio distinto para asignar repartidor:

Tipo de pedido | Criterio de asignación          
Comida         | Mochila térmica                 
Encomienda     | Peso y embalaje        
Compra         | Cercanía del repartidor 

#Estructura del proyecto
src/
├── DireccionEntrega.java    Dirección de entrega (número, calle, ciudad)
├── Pedido.java              Clase base: idPedido, direccionEntrega, tipoPedido
├── PedidoComida.java        Subclase: valida mochila térmica
├── PedidoEncomienda.java    Subclase: valida peso y embalaje
├── PedidoExpress.java       Subclase: valida cercanía del repartidor
└── Main.java                Clase principal con las pruebas del sistema

#Jerarquía de clases
Pedido
├── PedidoComida
├── PedidoEncomienda
└── PedidoExpress
- Pedido además mantiene una relación de composición con DirecciónEntrega.

#Ejecución
1° Clonar el repositorio: https://github.com/ggonzalp/DOOII_FormativaS1.git

2° Abrir el proyecto en IntelliJ IDEA

3° Ejecutar la clase principal: src/ui/Main.java

4° El programa cargará automáticamente los datos ingresados de forma local y manual.

Autoría Estudiante: Gabriela González Peirano 
Asignatura: Desarrollo Orientado a Objetos II
Instituto: DuocUC





