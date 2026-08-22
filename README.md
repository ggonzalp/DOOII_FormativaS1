#Speedfast

Proyecto de sistema para la gestión de pedidos para una empresa de reparto a domicilio, desarrollado en Java.
En esta semana se nos solicita diseñar e implementar una clase abstracta que contenga atributos y métodos comunes aplicables a un conjunto de objetos relacionados, para crear clases derivadas que reutilicen y personalicen estos comportamientos según sus propias características. 

#Descripción
SpeedFast ofrece tres tipos de servicio, y cada uno tiene un criterio distinto para asignar repartidor, además cada uno tiene un tiempo
base de tiempo estimado de entrega al que se le suman minutos por kilómetros de distancia del punto de entrega:

Tipo de pedido | Criterio de asignación  | Tiempo Base | Tiempo extra          
Comida         | Mochila térmica         |    15       |    2         
Encomienda     | Peso y embalaje         |    20       |   1.5
Compra         | Cercanía del repartidor |    10       |   Condición: si es > 5 km, se agregan 5 min extra.

#Estructura del proyecto
src/
├── DireccionEntrega.java    Dirección de entrega.
├── Pedido.java              Clase abstracta base.
├── PedidoComida.java        Subclase: valida mochila térmica y tiempo  15 min + 2 min/km.
├── PedidoEncomienda.java    Subclase: valida peso y embalaje y tiempo 20 min + 1.5 min/km.
├── PedidoExpress.java       Subclase: valida cercanía del repartidor y tiempo 10 min + (+5 si > 5 km).
└── Main.java                Clase principal que da inicio al sistema

#Jerarquía de clases
Pedido
├── PedidoComida
├── PedidoEncomienda
└── PedidoExpress
- Pedido además mantiene una relación de composición con DirecciónEntrega.

# Implememtación de métodos
- mostrarResumen: Método concreto que muestra información común en todas las subclases
- calcularTiempoEntrega: Método abstracto que cada clase sobrescribe con su propia formula (ver tabla arriba).
- asignarRepartidor: Método utilizado para validar los requerimientos para el repartidor (ver tabla arriba).
- procesarPedido: Template Method en Pedido que dirige el proceso completo incorporando todos los métodos anteriores en uno.


#Ejecución
1° Clonar el repositorio: 

2° Abrir el proyecto en IntelliJ IDEA

3° Ejecutar la clase principal: src/ui/Main.java

4° El programa cargará automáticamente los datos ingresados de forma local y manual.

Autoría Estudiante: Gabriela González Peirano 
Asignatura: Desarrollo Orientado a Objetos II
Instituto: DuocUC





