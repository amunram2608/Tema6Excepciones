package ejer01_1;

public class Main {
	
	public void show() {
		try {
			Producto producto1 = new Producto();
			Producto producto2 = new Producto();
			Producto producto3 = new Producto();
			
			//producto1.setPrecio(-1);
			//producto1.setModelo(0);
			//producto1.setStock((byte)-1);
			
			producto1.miId();
			producto2.miId();
			producto3.miId();
			
			System.out.println(producto1);
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		new Main().show();
	}

}
