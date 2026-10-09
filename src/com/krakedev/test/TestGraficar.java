package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Hexagono;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.TrianguloRectangulo;

public class TestGraficar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Graficador graficador = new Graficador();

		Cuadrado cuadrado = new Cuadrado("CUADRADO", "ROJO", 5);
		Rectangulo rectangulo = new Rectangulo("RECTANGULO", "AZUL", 4, 6);
		TrianguloRectangulo tr = new TrianguloRectangulo("TRIANGULO RECTANGULO", "AMARILLO", 3, 4);
		Hexagono hexagono = new Hexagono("HEXAGONO", "VERDE", 6);

		graficador.graficar(cuadrado);
		graficador.graficar(rectangulo);
		graficador.graficar(tr);
		graficador.graficar(hexagono);
	}

}