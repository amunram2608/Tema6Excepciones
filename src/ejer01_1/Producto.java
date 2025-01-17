package ejer01_1;

public class Producto {
	
	//Atributos
	private int modelo;
	private byte stock;
	private double precio;
	
	
	//Constructores
	public Producto(int modelo, byte stock, double precio) {
		this.modelo = modelo;
		this.stock = stock;
		this.precio = precio;
	}
	
	
	public Producto() {
		this(1, (byte)0, 0d);
	}
	
	
	//Get/Set
	int getModelo() {
		return modelo;
	}
	
	void setModelo(int modelo) {
		if(modelo < 0 && modelo > 100) {
			throw new ArithmeticException("Modelo inválido"); 
		}
		this.modelo = modelo;
	}
	
	byte getStock() {
		return stock;
	}
	
	void setStock(byte stock) {
		if(stock < 0) {
			throw new ArithmeticException("Stock inválido"); 
		}
		this.stock = stock;
	}
	
	double getPrecio() {
		return precio;
	}
	
	void setPrecio(double precio) {
		if(stock < 0) {
			throw new ArithmeticException("Stock inválido"); 
		}
		this.precio = precio;
	}
}
