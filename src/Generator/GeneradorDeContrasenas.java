package Generator;

import java.util.Scanner;

public class GeneradorDeContrasenas {
//	CONSTANTES STRING
	private static final String CONSTANTES = "bcdfghjklmnpqrstvwxyz";
	private static final String VOCALES  = "aeiou";
	private static final String NUMEROS = "0123456789";
	private static final String SIMBOLOS = "!@#$~&/\\°(){}=?*+-,.;:><\"";
//	CONSTANTES INT
	private static final int NUM_PARES = 3;
	private static final int NUM_NUMS = 2;
	private static final int NUM_SIMB = 1;
	
	private static final String OTRA = "N";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String respuesta;
		
		do {
			String password = "";
			for (int i=0;i<NUM_PARES;i++) {
				password += generatorPair();
			}
			for (int i=0;i<NUM_NUMS;i++ ) {
				password += getRandom(NUMEROS);
			}
			for (int i=0;i<NUM_SIMB;i++ ) {
				password += getRandom(SIMBOLOS);
			}
			System.out.println("La contraseña propuesta es: \n\t"+password+
					"\nSi quiere otra opcion de contraseña pulse "+OTRA);
			respuesta = sc.next();
		} while(respuesta.equalsIgnoreCase(OTRA));
		System.out.println("\n*************  FIN :D  ******************");
		sc.close();
	}

	private static char getRandom(String opc) {
		int pos = (int)(Math.random() * opc.length());
		return opc.charAt(pos);
	}
	
	private static String generatorPair() {
		String par = "";
		par += getRandom(CONSTANTES);
		par += getRandom(VOCALES);
		return par;
	}
	
	
}
