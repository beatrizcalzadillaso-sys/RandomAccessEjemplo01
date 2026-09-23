package pqt_01;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ejemplo_02 {

	private static final String RUTA = "AleatorioEmple2.dat";
	
	
	public static void main(String[] args) {
		File fic = new File(RUTA);
		RandomAccessFile rfile = null;
		int id, dep, posicion;
		Double salario;
		char apellido []= new char[10], aux;
		posicion = 0; // para ubicar el puntero al principio
		
		try {
			rfile.seek(posicion);
			while(rfile.getFilePointer() < rfile.length()) { // mientras el puntero este ubicado "dentro" del registrp
				id= rfile.readInt();
			}
		} catch(IOException exc) {
			exc.printStackTrace();
		}

	}

}
