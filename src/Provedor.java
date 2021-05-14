
public class Provedor {
	private String nombre;
	private String codigo;
	private Producto[] misProducto;

	public Provedor(String nombre, String codigo) {
		this.nombre = nombre;
		this.misProducto = new Producto[50];
		this.codigo = codigo;
	}

	public Producto vender(String codigo) {
	   
	 return null;  
	}

	private Producto revisarInventario(String codigo) {
		boolean seEncuentra = false;
		short contador = 0;
		while (seEncuentra) {
			if (this.misProducto[contador] != null
					&& this.misProducto[contador].getNombre().equalsIgnoreCase(codigo) == true) {
				return misProducto[contador];
			}
			contador++;
		}
		return null;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
