/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crearrfc;

import java.util.Scanner;

/**
 *
 * @author carlosjoseanguiano
 */
public class CrearRFC {

    public static void main(String[] args) {
		// TODO Auto-generated method stub

		String apellidoPaterno;
		String apellidoMaterno;
		String nombres;
		int fechaNacimiento;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingresa tu Apellido Paterno");
		apellidoPaterno = entrada.nextLine();
		String apPaterno = apellidoPaterno;
		char[] aCaracteres = apPaterno.toCharArray();

		selecionarVocal(aCaracteres);
		/*
		 * System.out.println("Ingresa tu Apellido Materno"); apellidoMaterno =
		 * entrada.nextLine();
		 * 
		 * System.out.println("Ingresa tu Edad"); fechaNacimiento =
		 * entrada.nextInt();
		 * 
		 * System.out .println("Paterno: " + apellidoPaterno + " Materno: " +
		 * apellidoMaterno + " Edad: " + fechaNacimiento);
		 * 
		 * apellidoPaterno.substring(0, 1);
		 * System.out.println(apellidoPaterno.substring(0, 1));
		 */
	}

	private static void selecionarVocal(char[] aCaracteres) {
		// TODO Auto-generated method stub
		String[] myvocal = new String[5];
		myvocal[0] = "a";
		myvocal[1] = "e";
		myvocal[2] = "i";
		myvocal[3] = "o";
		myvocal[4] = "u";
		for (int i = 0; i < aCaracteres.length; i++) {
			if (aCaracteres != null) {
				  System.out.println("[" + i + "] " + aCaracteres[i]);
			} else {
				System.out.println("NO");
			}
		}
	}

}
