package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.TrianguloRectangulo;

public class TestGraficar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Graficador graficador = new Graficador();

		Figura figura = new Figura("CIRCULO", "VERDE");
		Cuadrado cuadrado = new Cuadrado("CUADRADO", "ROJO", 5);
		Rectangulo rectangulo = new Rectangulo("RECTANGULO", "AZUL", 4, 6);
		TrianguloRectangulo tr = new TrianguloRectangulo("TRIANGULO RECTANGULO", "AMARILLO", 3, 4);

		graficador.graficar(figura);
		graficador.graficar(cuadrado);
		graficador.graficar(rectangulo);
		graficador.graficar(tr);
	}

}