package pqt_01;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ejemplo_01 {
	
	//	declarar ruta como constante
	
	private static final String RUTA = "AleatorioEmple2.dat";
	private static final int TAM_REGISTRO = 40;

	public static void main(String[] args) {
		File fic = new File(RUTA);
		RandomAccessFile rfile = null;
		StringBuffer buffer = null;
		
		//datos a rellenar
		String apellido = "Gonzalez";
		Double salario= 1230.87;
		int dep= 10;
		
		//posicionar el puntero
		int id=20;
		long posicion= (id-1)*TAM_REGISTRO;
		
		//escribir
		try {
			rfile= new RandomAccessFile(fic, "rw");
			rfile.seek(posicion);
			rfile.writeInt(id);
			buffer = new StringBuffer(apellido);
			buffer.setLength(12);
			rfile.writeChars(buffer.toString());
			rfile.writeInt(dep);
			rfile.writeDouble(salario);
			rfile.close();
			
		}catch (IOException exc) {
			System.out.println();
		}
	}

}
