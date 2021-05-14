/*
 *  Los productos que se compran se guardan el arreglo misProductos y los Proveedores en el 
 *  arreglo misProvedores
 */
public class Almacen {
    static int id;
    private String codigo;
    private Provedor [] misProvedores;
    private Producto [] misProductos;
	public Almacen(String codigo) {
	 this.codigo = codigo;
	 this.misProductos = new Producto[100];
	 this.misProvedores = new Provedor[10];
	}
    static void actualizarId() {
     id++;	
    }
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Almacen.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Provedor[] getMisProvedores() {
		return misProvedores;
	}
	public void setMisProvedores(Provedor[] misProvedores) {
		this.misProvedores = misProvedores;
	}
	public Producto[] getMisProductos() {
		return misProductos;
	}
	public void setMisProductos(Producto[] misProductos) {
		this.misProductos = misProductos;
	}
    
}
