package net.ug.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Cliente {
	@Id
	@Column(name = "cliente_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column(name = "nombre")
	private String nombre;
	private String apellido;
	private String direccion;
	private String FechaNacimiento;
	private String telefono;
	private String email;
	public Cliente(int id, String nombre, String apellido, String direccion, String fechaNacimiento, String telefono,
			String email) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		FechaNacimiento = fechaNacimiento;
		this.telefono = telefono;
		this.email = email;
	}
	public Cliente() {

	}
	public void imprimir() {
		System.out.println(nombre);
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getFechaNacimiento() {
		return FechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

    
	
	
	
    
    
}
