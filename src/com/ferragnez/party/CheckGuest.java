package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] invitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
				"Ilary Blasi", "Bebe Vio", "Luis Sal", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };
		Boolean inLista = false;
		String nome = "";
		int cursor = 0;
		
		System.out.println("Buonasera, mi spiace che anche lei sia alla festa delle persone peggiori del mondo...qual è il suo nome?");
		nome = scan.nextLine();
		System.out.println("\n");
		
		while(inLista == false && cursor < invitati.length) {
			if (invitati[cursor].equals(nome)) {
				inLista = true;
			}
			cursor++;
		}
		
		if(inLista == true) {
			System.out.println("Abbiamo controllato la lista invitati e lei ne fa parte, quindi entri pure.");
		}else {
			System.out.println("Abbiamo controllato la lista invitati e lei non è presente, quindi per stasera si è risparmiato la festa di brutte persone.");
		}

		scan.close();
	}

}
