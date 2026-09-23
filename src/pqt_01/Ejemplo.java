package pqt_01;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ejemplo {
	
	// elementos constantes
	private static final String RUTA = "AleatorioEmple.dat";

	public static void main (String args[]) {
		File fichero = new File(RUTA);
		RandomAccessFile rfile = null;
		StringBuffer buffer = null; 
		
		
		String apellido[]= {"Fernandez", "Gil", "Lopez", "Ramos", "Sevilla", "Casilla", "Rey"};
		int dep[]= {10, 20, 10, 10, 30, 30, 20};
		Double salario[]= {1000.45, 2400.60, 3000.0, 1500.56, 2200.0, 1435.87, 2000.0};
		
		int n= apellido.length;
		try {
			rfile = new RandomAccessFile(fichero, "rw");
			for (int i=0; i<n; i++) {
				rfile.writeInt(i+1);
				buffer = new StringBuffer (apellido[i]);
				buffer.setLength(12);
				rfile.writeChars(buffer.toString());
				rfile.writeInt(dep[i]);
				rfile.writeDouble(salario[i]);
			}
			rfile.close();
			
		}
		catch(IOException exc) {
			System.out.println("Error");
		}
		
	
	}
}
