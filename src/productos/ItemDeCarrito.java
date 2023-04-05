package productos;

public class ItemDeCarrito {

	/*
	 * En mi item de carrito quiero el producto y la cantidad de ese producto
	 */
	private Producto producto; //producto es un tipo de dato Producto
	private int cantidad;
	
	public ItemDeCarrito(Producto producto,int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	/*
	 * Precio final de un item
	 * 
	 * accedo al precio del producto y lo multiplico por la cantidad
	 */
	
	public double precioItem() {
		return this.producto.getPrecio() * this.cantidad;
	}
}
