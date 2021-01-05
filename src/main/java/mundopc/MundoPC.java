package mundopc;

import com.gm.mundopc.Computadora;
import com.gm.mundopc.Monitor;
import com.gm.mundopc.Orden;
import com.gm.mundopc.Raton;
import com.gm.mundopc.Teclado;

public class MundoPC {

public static void main(String args[]) {
	
	Raton raton = new Raton("USB", "MSI");
	Teclado teclado = new Teclado("USB", "Ultra");
	Monitor monitor = new Monitor("Samsung", 22);
	Computadora computadora = new Computadora("Master Race OP", monitor, teclado, raton);
	Computadora computadora2 = new Computadora("Master Race OP", monitor, teclado, raton);
	Computadora computadora3 = new Computadora("Master Race OP", monitor, teclado, raton);
	Computadora computadora4 = new Computadora("Master Race OP", monitor, teclado, raton);
	Computadora computadora5 = new Computadora("Master Race OP", monitor, teclado, raton);

	Orden orden = new Orden();
	
	orden.AgregarComputadora(computadora);
	orden.AgregarComputadora(computadora2);

	orden.mostrarOrden();
	

}
	
}
