package pqt_01;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ejemplo_02 {

	private static final String RUTA = "AleatorioEmple.dat";
	
	
	public static void main(String[] args) {
		File fic = new File(RUTA);
		
		RandomAccessFile rfile = null;
		int id, dep, posicion;
		Double salario;
		char apellido []= new char[12], aux;   // declaro un array de char y una variable char auxiliar
		posicion = 0; // para ubicar el puntero al principio
		
		try {
			rfile = new RandomAccessFile(fic, "rw");
			rfile.seek(posicion);
			while(rfile.getFilePointer() < rfile.length()) { // mientras el puntero este ubicado "dentro" del registrp
				id= rfile.readInt();
				// recorrer los caracteres del apellido
				for (int i=0; i<apellido.length;i++) {
					aux = rfile.readChar();
					apellido[i] = aux;
				}
				// convertir el array a string
				String apellidos = new String(apellido);
				dep = rfile.readInt(); // leo dep
				salario = rfile.readDouble(); // leo salario
				if (id>0) {
					System.out.printf("ID: %s, Apellido: %s, Departamento: %d, Salario: %.2f %n", id, apellidos.trim(), dep, salario);
					
				}
				
			}
			posicion= posicion + 26;
			rfile.close();
		} catch(IOException exc) {
			exc.printStackTrace();
		}

	}

}
