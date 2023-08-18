package ejercicio_mockito;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;
import org.junit.Test;

public class ServicioPedidoTest {

	 @Test
	    public void testProcessOrderWithMock() {
	        // Crear un objeto simulado de la interfaz EntradaPago
		 	EntradaPago entradaPagoMock = mock(EntradaPago.class);

	        // Configurar el comportamiento simulado
	        when(entradaPagoMock.procesarPago(anyDouble())).thenReturn(true);

	        // Crear una instancia de ServicioPedido con el objeto simulado
	        ServicioPedido servicioPedido = new ServicioPedido(entradaPagoMock);

	        // Probar el método procesarOrden en ServicioPedido
	        boolean ordenProcesada = servicioPedido.procesarOrden(100.0);

	        assertTrue(ordenProcesada); // Verificar que el pedido se procesó correctamente
	    }
}
