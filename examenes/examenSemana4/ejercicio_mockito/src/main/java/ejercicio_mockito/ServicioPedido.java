package ejercicio_mockito;

public class ServicioPedido {

	private EntradaPago entradaPago;
	public ServicioPedido(EntradaPago entradaPago) {
		 this.entradaPago = entradaPago;
	 }
	 public boolean procesarOrden(double cantidadTotal) {
	        // Realizar procesamiento del pedido
	        boolean resultadoPago = entradaPago.procesarPago(cantidadTotal);
	        return resultadoPago;
	    }
}
