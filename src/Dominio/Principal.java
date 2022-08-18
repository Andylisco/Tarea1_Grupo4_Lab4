package Dominio;

//import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {

       Empleado[]  empleados = new Empleado[5];
       
       empleados[0]= new Empleado();
       empleados[1]= new Empleado("Roberto",50);
       empleados[2]= new Empleado("Juan",35);
       empleados[3]= new Empleado();
       empleados[4]= new Empleado("Agustin",25);
       
       
       for (Empleado empleado : empleados) {
		System.out.println(empleado.toString());
	}
       System.out.println("Próximo ID de Empleado: " + Empleado.DevuelveProximoID());
	}

}
