package testclientews;

import clientews.servicio.ServicioSumarImplService;
import clientews.servicio.ServicioSumarWS;

public class TestServicioSumarWs {
	public static void main(String[] args) {
		ServicioSumarWS servicioSumar = new ServicioSumarImplService().getServicioSumarImplPort();
		int x = servicioSumar.sumar(5, 3);
		System.out.println("La suma es: "+ x);
	}
}
