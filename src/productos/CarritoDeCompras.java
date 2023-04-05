package productos;


public class CarritoDeCompras {
	
	
	private Persona comprador; //El comprador tiene como tipo de variable Persona
	
	/*
	 * Los items van a tener como tipo de dato ItemDeCarrito, recordar que son 
	 * tipos de datos que se definen como complejos
	 */
	private ItemDeCarrito item1;
	private ItemDeCarrito item2;
	private ItemDeCarrito item3;
	
	
	
	public Persona getComprador() {
		return comprador;
	}

	public ItemDeCarrito getItem1() {
		return item1;
	}
	public void setItem1(ItemDeCarrito item1) {
		this.item1 = item1;
	}
	public ItemDeCarrito getItem2() {
		return item2;
	}
	public void setItem2(ItemDeCarrito item2) {
		this.item2 = item2;
	}
	public ItemDeCarrito getItem3() {
		return item3;
	}
	public void setItem3(ItemDeCarrito item3) {
		this.item3 = item3;
	}
  
	
	/*
	 * Precio final del carrito de compras 
	 */
	
	public double precioFinal() { //Devuelve un double 
		
		double precio = 0.0;
		
		if(this.item1 != null) { //Si tiene algo asignado
			
			precio+=this.item1.precioItem();
			
		}
         if(this.item1 != null) { //Si tiene algo asignado
			
			precio+=this.item1.precioItem();
			
		}
         if(this.item1 != null) { //Si tiene algo asignado
	
	        precio+=this.item1.precioItem();
	
        }
         return precio;		
	}

	public void setComprador(Persona unaPersona) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
