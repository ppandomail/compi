package ar.edu.ub.dc.compilador_declaracion;

import java.io.FileReader;

public class Main {

	public static void main(String[] args) throws Exception {
		new Parser(new Scanner(new FileReader("src/ar/edu/ub/dc/compilador_declaracion/programa.txt"))).parse();
	}

}