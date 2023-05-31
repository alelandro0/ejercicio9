package barco;

import java.util.concurrent.ForkJoinPool;

import javax.swing.JOptionPane;

public class Barco {
	private String motor;
	private String nombre;
	private String tipo;
	private String tamano;
	private String modelo;
	public int codigo;

	public int getCodigo() {
		return codigo;
	}

	public Barco(String motor, String nombre, String tipo, String tamano, String modelo) {
		super();
		this.motor = motor;
		this.nombre = nombre;
		this.tipo = tipo;
		this.tamano = tamano;
		this.modelo = modelo;
	}

	public Barco() {
		codigo=Integer.parseInt(JOptionPane.showInputDialog("ingrese el codigo del barco"));
		motor = JOptionPane.showInputDialog("ingrese el tipo de motor del barco");
		nombre = JOptionPane.showInputDialog("ingrese el nombre del barco");
		tipo = JOptionPane.showInputDialog("ingrese el tipo de barco");
		tamano = JOptionPane.showInputDialog("ingrese el tamaño del barco");
		modelo = JOptionPane.showInputDialog("ingrese el modelo del barco");
	}

	public String imprimir() {
		String resul="**RESUTADO**\n\n";
		resul+="Nombre : "+nombre+"\n";
		resul+="tipo : "+tipo+"\n";
		resul+="Tamano : "+tamano+"\n";
		resul+="Modelo : "+modelo+"\n";
		resul+="motor : "+motor+"\n\n";
		System.out.println(resul);
		return resul;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public String toString() {
	    return imprimir();
	}

}
