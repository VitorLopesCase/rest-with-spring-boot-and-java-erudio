package br.com.erudio.math;

public class SimpleMath {

	public Double sum(Double numberOne, Double numberTwo ){
		
		return numberOne + numberTwo;
	}

	public Double multiply(Double numberOne, Double numberTwo ) {
		return numberOne * numberTwo;
	}

	public Double div(Double numberOne, Double numberTwo ) {
		return numberOne / numberTwo;
	}

	public Double sub(Double numberOne, Double numberTwo ) {
		return numberOne - numberTwo;
	}

	public Double sqrt(Double number ) {
		return Math.sqrt(number);
	}

	public Double average(Double numberOne, Double numberTwo ) {
		return (numberOne + numberTwo) / 2;
		
	}
}
