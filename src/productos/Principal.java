package productos;

public class Principal {
	public static void main (String[] args) {
		
		/*
		 * Implemente usted mismo el ejemplo visto en clase de “carrito de compras”: 
		 * una clase
         Producto (que pueda tener hasta 3 items), otra ItemCarrito, 
         otra Carrito y otra
         Descuento, con 2 subclases.
		 */
		
		Persona unaPersona = new Persona("Lalo","Haag");
		
		System.out.println(unaPersona.presentacion()); //Me saldra lo que retorna este metodo con los parametros que le pase
		
		
		/*
		 * Recordar que en public Producto() hay 3 parametros,
		 * debemos pasarlos obligatoraimente al nombre, codigo y precio
		 */
		Producto product1 = new Producto("Galletitas","7502", 500);
		Producto product2 = new Producto("Gatorade","8322",500);
		
		/*
		 * Ahora el item de carrito necesita 2 parametros: el producto y la
		 * cantidad de ese producto
		 */
		
		ItemDeCarrito galletitas = new ItemDeCarrito(product1,1);
		ItemDeCarrito gatorade = new ItemDeCarrito(product2,1);
		
		CarritoDeCompras carritoGonzalo = new CarritoDeCompras();
		carritoGonzalo.setComprador(unaPersona); //UnaPersona tiene guardado mi nombre y apellido
				
		
		/*
		 * Ahora en 2 items guardo mis productos
		 */
		carritoGonzalo.setItem1(galletitas);
		carritoGonzalo.setItem2(gatorade); 
		
		System.out.println("Precio final del carrito de gonzalo: " + carritoGonzalo.precioFinal());
		
		
		
		
		
		
	}

}
