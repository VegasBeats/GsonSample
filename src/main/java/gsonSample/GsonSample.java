package gsonSample;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonSample {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		Persona p;
		String Nombre, Apellidos;
		int Edad;
		System.out.println("Introduzca su nombre aquí: ");
		Nombre=teclado.nextLine();
		System.out.println("Introduzca sus Apellidos aquí: ");
		Apellidos=teclado.nextLine();
		System.out.println("Introduzca su edad aquí: ");
		Edad=teclado.nextInt();
		p=new Persona(Nombre,Apellidos,Edad);
		System.out.println(Convert_to_Json(p));
		teclado.close();
		
	}
	
	public static String Convert_to_Json (Persona p) {
		Persona aux;
		aux=p;
		Gson gson= new GsonBuilder().setPrettyPrinting().create();
		String Texto_Json=gson.toJson(aux);
		
		return Texto_Json;
	}

}

class Persona {
	private String Nombre;
	private String Apellidos;
	private int Edad;
	public Persona(String Nombre, String Apellidos, int Edad) {
		this.Nombre=Nombre;
		this.Apellidos=Apellidos;
		this.Edad=Edad;
	}
	
}


