package main;

public class Main {

	public static void main(String[] args) {
		tipoNumero(0);
		tipoNumero(1);
		tipoNumero(-1);
		bucle(-3);
		bucleFor();
		estacionesSwitch("Verano");
		estacionesSwitch("Primavera");
		estacionesSwitch("Otoño");
		estacionesSwitch("Invierno");
		estacionesSwitch("Auto");
	}
	
	//Parte 1
	public static void tipoNumero(int numeroIf) {
		if(numeroIf < 0) {
			System.out.println("El número es negativo");
		}else if(numeroIf > 0) {
			System.out.println("El número es positivo");
		}else {
			System.out.println("El número es 0");
		}
	}
	

	public static void bucle(int numeroWhile) {
		//Parte 2
		//Bucle While
		while(numeroWhile < 3) {
			System.out.println("El valor de numeroWhile es: " + numeroWhile);
			numeroWhile++;
		}
		
		//Parte 3
		//Bucle Do While
		do {
			System.out.println("El valor de numeroWhile es: " + numeroWhile);
			numeroWhile++;
		} while (numeroWhile < 3);
		//El bucle siempre se ejecutara una vez ya que numeroWhile llega al do siendo ya 3
	}
	
	public static void bucleFor() {
		//Parte 4
		for(int numeroFor = 0; numeroFor <= 3; numeroFor++) {
			System.out.println("El valor de numeroFor es: " + numeroFor);
		}
	}
	
	public static void estacionesSwitch(String estacion) {
		switch(estacion) {
			case "Verano":
			case "verano":
				System.out.println("Estamos en verano");
				break;
			case "Otoño":
			case "otoño":
				System.out.println("Estamos en otoño");
				break;
			case "Invierno":
			case "invierno":
				System.out.println("Estamos en invierno");
				break;
			case "Primavera":
			case "primavera":
				System.out.println("Estamos en primavera");
				break;
			default:
				System.out.println("El dato ingresado NO es una estación");
				break;
				
		}
	}
}
