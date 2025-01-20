package ejer01_1;

public class Producto {
	
	//Atributos
	private int modelo;
	private byte stock;
	private double precio;
	private int id;
	private static int contador = 0;
	
	
	//Constructores
	public Producto(int modelo, byte stock, double precio) throws Exception {
		setModelo(modelo);
		setStock(stock);
		setPrecio(precio);
		id = ++contador;
	}
	
	public Producto() throws Exception {
		this(1, (byte)0, 0d);
	}
	
	
	//Métodos
	public byte disminuirStock(byte cantidad) {
		if(cantidad < 0 || cantidad > stock) {
			throw new IllegalArgumentException("Cantidad inválida");
		}
		
		return this.stock -= cantidad;
		
	}
	
	public void miId() {
		System.out.printf("Soy el producto número: %d\n\n", this.id);
	}
	
	
	//Get/Set
	int getModelo() {
		return modelo;
	}
	
	void setModelo(int modelo) {
		if(modelo < 1 || modelo > 1000) {
			throw new IllegalArgumentException("Modelo inválido"); 
		}
		this.modelo = modelo;
	}
	
	byte getStock() {
		return stock;
	}
	
	void setStock(byte stock) {
		if(stock < 0) {
			throw new IllegalArgumentException("Stock inválido"); 
		}
		this.stock = stock;
	}
	
	double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) throws Exception{
		if(precio < 0) {
			throw new Exception("Precio inválido"); 
		}
		this.precio = precio;
	}
	
	int getContador() {
		return contador;
	}
	
	int getId() {
		return id;
	}

	
	//toString
	@Override
	public String toString() {
		return String.format("Modelo del producto: %d\nStock del producto: %d\nPrecio del producto: %.2f\n\n", modelo, stock, precio);
	}
	
}
