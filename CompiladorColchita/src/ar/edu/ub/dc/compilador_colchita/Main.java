package ar.edu.ub.dc.compilador_colchita;

import java.io.FileReader;

public class Main {

	public static void main(String[] args) throws Exception {
		new Parser(new Scanner(new FileReader("src/ar/edu/ub/dc/compilador_colchita/programa.txt"))).parse();
	}

}