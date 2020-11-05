package LecturaYEscritura;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copiarOriginal {

	private static final int TAMANNO=1024*16;
	public static void main(String[] args) {
		
		try (BufferedInputStream bin= new BufferedInputStream(new FileInputStream("original.png"));
				BufferedOutputStream bout= new BufferedOutputStream(new FileOutputStream("copia.png"))){
			
			int cantidadBytesLeidos;
			byte[]buffer= new byte[TAMANNO];
			int i=1;
			
			cantidadBytesLeidos=bin.read(buffer,0,TAMANNO);
			
			while (cantidadBytesLeidos!=-1) {
				
				bout.write(buffer,0,TAMANNO);
				System.out.println("Leidos " + cantidadBytesLeidos + " Bytes en la iteración " + i++ + "-ésima.");
				cantidadBytesLeidos=bin.read(buffer,0,TAMANNO);
			}
			System.out.println("Ha finalizado la copia del fichero.");
		} catch (IOException e) {
			e.getMessage();
		}

	}

}
