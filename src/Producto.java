
public class Producto {
    private String Nombre;
    private String Codigo;
    private float Precio;
    private String Fabricante;
    private String Estado;
    static int id;
	public Producto(String Nombre,String Codigo,float Precio,String Fabricante) {
	 this.Nombre  = Nombre;
	 this.Codigo = Codigo;
	 this.Precio = Precio;
	 this.Fabricante = Fabricante;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public float getPrecio() {
		return Precio;
	}
	public void setPrecio(float precio) {
		Precio = precio;
	}
	public String getFabricante() {
		return Fabricante;
	}
	public void setFabricante(String fabricante) {
		Fabricante = fabricante;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
  
}
