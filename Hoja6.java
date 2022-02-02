import java.util.Scanner;

public class Hoja6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int opcion = 0;

		System.out.println(
				"que ejercicio/caso quiere resolver?\n 1.- \n 2.- \n 3.- \n 4.- \n 5.- \n 6.- \n 7.- \n 8.- \n 9.- \n 10.- \n 11.- \n 12.- \n 13.- \n 14.- \n 15.- \n 16.- \n 17.- \n 17.- \n 18.- \n 19.- \n 20.-");

		opcion = sc.nextInt();
		int numero = 0;
		int a = 0;
		int b = 0;

		switch (opcion) {

		case 1:

//			Realizar un programa que pida un número entero entre 1 y 10, ambos incluidos. 
//			Después se debe mostrar por pantalla el número introducido, pero en formato texto. 
//			Si el número introducido es 1 → La salida será: uno
//			 Si el número introducido es 2 → La salida será: dos
//			 ......
//			 Si el número introducido es 10 → La salida será: diez
//			 Si el número introducido no está entre 1 y 10 → La salida será: número no válido

			a = 1;
			b = 10;
			numero = pedirNumero();
			if (validarRangoNumero(a, b, numero)) {

				mostrarNumeroEscrito(numero);
				
			} else {
				mostrarError();
			}

			break;

		case 2:

//			Realizar un programa que pida un número entero entre 1 y 10, ambos incluidos. Debe seguir pidiéndose mientras el número no esté en dicho intervalo. 
//			Después se debe mostrar por pantalla el número introducido, pero en formato texto. 
//			Si el número introducido es 1 → La salida será: uno Si el número introducido es 2 → La salida será: dos ......

			a = 1;
			b = 10;
			

			while (!validarRangoNumero(a, b, pedirNumero())) {

				System.out.println("muy bien");

			}
			
			mostrarNumeroEscrito(numero);

			break;

		case 3:

//			Realizar un programa que pida el mes en forma numérica (1 ..12) y devuelva el número de días que tiene ese mes. 
//			Para Febrero devolver 28.

			a = 1;
			b = 12;

			while (!validarRangoNumero(a, b, pedirNumero())) {

				System.out.println("muy mejorable");

			}
			mostrarDiasMes(numero);

			break;

		case 4:

//			Escribir un programa, en lenguaje Java, que:
//				 1o) Pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis caras. 
//				2o) Muestre por pantalla el número en letras (dato String) de la cara opuesta al resultado obtenido. Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4. 
//				Nota 2: Si el número del dado introducido es menor que 1 ó mayor que 6, se mostrará el mensaje: "ERROR: Número incorrecto.". 

			a=1;
			b=6;
			
			validarRangoNumero(a,b,pedirNumero());
			mostrarNumeroEscrito(caraOpuestaDado(numero));
			if(!validarRangoNumero(a,b,numero)) {
				
				mostrarError();
				
			}else {
				
				System.out.println("vale ya");
			}
			
			
			break;

		case 5:

//			En la siguiente tabla se muestra el número de camas de las habitaciones de una casa rural, además de la planta donde está ubicada cada una de ellas: 
//				 
//				Escribir un programa, en lenguaje Java, que: 
//				1o) Muestre el listado de las habitaciones de la casa rural. 
//				2o) Pida por teclado el número (dato entero) asociado a una habitación. 
//				3o) Muestre por pantalla la planta y el número de camas de la habitación seleccionada. 
//				Nota: Si el número introducido por el usuario, no está asociado a ninguna habitación, se mostrará el mensaje: "ERROR: <número> no está asociado a ninguna habitación.". 

			
			
			
			
			break;

		case 6:

//			Escribir un programa que pida un número entero y escriba por pantalla dependiendo del valor del número: 
//				“El número introducido es < valor_numero >”, en el caso de que sea positivo. “El número introducido es NEGATIVO”, en el caso de que sea negativo.

			break;

		case 7:

//			Escribir un programa que pida tres valores enteros e imprima por pantalla el mayor de ellos. Si existen valores iguales se imprimirá cualquiera de ellos. 
//			“El número mayor es : <numero_mayor >”

			break;

		case 8:

//			Un almacén realiza un descuento del 40% si se compran más de 100 unidades de un mismo artículo;
//			un 20% si se compran entre 25 y 100 unidades y un 10% si se compran entre 10 y 24 unidades. 
//			Escribir un programa que pregunte el precio de un artículo y la cantidad comprada y calcule
//			e informe del total a pagar así como del descuento aplicado.

			break;

		case 9:

//			Escribir un programa que pida un número entero, cuyo valor esté entre 0 y 9999. 
//			El programa debe informar de la cantidad de dígitos que tiene o dar un mensaje de error si el número introducido no está en el intervalo deseado.

			break;

		case 10:

//			Realizar un programa en Java que lea una secuencia de números positivos.
//			 Mostrar por pantalla su suma y su producto.
//			 Se terminará de procesar números cuando el usuario introduzca un número negativo.

			break;

		case 11:

//			Realizar un programa que lea una secuencia de números, se terminará de recoger números cuando el usuario introduzca un 0. 
//			Mostrar por pantalla su suma, su producto y su media. 
//			Deberás tener cuidado si el primer número introducido es un 0, no se habrá introducido ningún número y al calcular la media, recuerda que la división por cero no existe.

			break;

		case 12:

//			Realizar un programa en Java que lea una secuencia de números y determine cual es el mayor de ellos y el número de veces que aparece. 
//			Cada vez que se introduce un número se debe preguntar “Se desea continuar (s /n)”. La ejecución se terminará siempre que el usuario pulse algo distinto de s.

			break;

		case 13:

//			Realizar un programa en java que realice las siguientes acciones: 
//				➢  Pida el número de alumnos de una clase, debe comprobarse que la cifra está entre 5 (mínimo) y 30 
//				(máximo). 
//				➢  Pida tantas notas como alumnos hay en la clase, las notas son enteros entre 0 y 10 
//				➢  Informe por pantalla del número de aprobados (nota >=5) y suspensos (nota<5).

			break;

		case 14:

//			Realizar un programa en java que calcule e imprima la suma de los múltiplos de 2 comprendidos entre dos valores a y b que pedirá por pantalla. 
//			No se debe permitir que se introduzcan valores negativos para a y b. Se deberá controlar que a < b. Si a > b se intercambiarán estos valores

			break;

		case 15:

//			Escribir un programa en java que lea temperaturas en grados Celsius y las transforme a la escala Fahrenheit. 
//			La formula de transformación es: 
//			F=9/5∗C32
//			 Tras cada ejecución, el programa muestra por pantalla el mensaje: “Desea continuar [s/n]”. La ejecución finaliza cuando se responde algo distinto de ‘s’.

			break;

		case 16:

//			Realizar un programa que muestre por pantalla las secuencias:
//				•	1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
//				•	1 3 5 7 9 11 13 15 17 19
//				•	5 10 15 20 25 3035404550
//				•	100 90 80 70 60 50 40 30 20 10 0
//				•	2 4 6 10 12 14 18 20 22 26

			break;

		case 17:

//			Realizar un programa que muestre por pantalla la secuencia: 
//				135791113151719 
//				Primero de la secuencia Mi número de la suerte 
//				No soy supersticioso Último de la secuencia

			break;

		case 18:

//			Realizar un programa que lea 30 notas de examen, podrán usarse decimales. Se debe comprobar que cada una de ellas está entre 0 y 10, si alguna no lo cumple se seguirá pidiendo hasta que sea correcta. 
//			Calcular la nota media, la más alta y la más baja e informar del resultado por pantalla.

			break;

		case 19:

//			Realizar un programa que pida dos números enteros positivos, si los números introducidos no son positivos se seguirán pidiendo hasta que lo sean. 
//			Calcular su producto mediante sumas e informar por pantalla del resultado. 
//			Por ejemplo: si los números son 3 y 6, las siguientes operaciones serían equivalentes: 
//			•	3*6 
//			•	3 + 3 + 3 +3 + 3 + 3 
//			•	6+ 6+ 6

			break;

		case 20:

//			Realizar un programa que pida un número entero y calcule su factorial. Si el número introducido es negativo se seguirá pidiendo hasta que sea positivo. 
//			Una vez calculado se informará del resultado con el siguiente formato: “El factorial de <número> es <factorial>”
//			Para todo número natural n, se llama factorial de n al producto de todos los naturales desde 1 hasta n.

			break;

		}

	}

	// METODOS A IMPLEMENTAR

	private static int pedirNumero() {

		return 0;
	}

	private static String mostrarNumeroEscrito(int a) {

		return "";
	}

	private static boolean validarRangoNumero(int a, int b, int numero) {

		return true;
	}

	private static int mostrarDiasMes(int mes) {

		return 0;
	}

	private static int caraOpuestaDado(int resultadoDado) {

		return 0;
	}

	private static String mostrarError() {

		return "";
	}

	private static String mostrarListadoHabitaciones() {

		return "";
	}

	private static String mostrarDetallesHabitacion(int habitacion) {

		return "";
	}

	private static boolean validarPositividad(int numero) {

		return true;
	}

	private static void guardarNumeros() {

	}

	private static String mostrarMayor(int[] numeros) {

		return "";
	}

	private static String mostrarDescuentos() {

		return "";
	}

	private static String aplicarDescuento(int unidades, int precio) {

		return "";
	}

	private static String mostrarCuantosDigitos(int numero) {

		return "";
	}

	private static String mostrarSumaYProducto(int[] numeros) {

		return "";
	}

	private static boolean validacionIgualANum(int numero) {

		return true;
	}

	private static String mostrarMedia(int[] numeros) {

		return "";
	}

	private static void contadorDeNumero(int numero) {

	}

	private static boolean continuar() {

		return true;
	}

	private static String mostrarAprobados(int[] notas) {

		return "";
	}

	private static int mostrarsumaMultiplosNume(int multiplo, int a, int b) {

		return 0;
	}

	private static int intercambiarNumeros(int a, int b) {

		return 0;
	}

	private static int pasarAFarenheit(int gradosCelsius) {

		return 0;
	}

	private static String mostrarSecuencia() {

		return "";
	}

	private static String mostrarSecuencia2(int a, int b) {

		return "";

	}

	private static float pedirNotas() {

		return 0;
	}

	private static String mostrarProductoSuma(int[] numeros) {

		return "";
	}

	private static String calcularYMostrarFactorial(int numero) {

		return "";
	}

}
