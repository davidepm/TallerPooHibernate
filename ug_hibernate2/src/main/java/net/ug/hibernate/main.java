package net.ug.hibernate;

public class main {
	
	
	public static void main(String[] args) {
		crear();
		read();
		update();
		delete();
	}
	
	public static void crear() {
		DaoCliente daoCliente = new DaoCliente();
		Cliente client = new Cliente(1,"Maria","Perez","guayaquil","12/02/1999","123456789","mariap9@hotmail.com");		
		daoCliente.setup();
		daoCliente.create(client);
		client = new Cliente(1,"David","Parrales","Duran","11/24/1994","1234565","davidp3@hotmail.com");
		daoCliente.create(client);		
	}
	
	public static void read() {
		DaoCliente daoCliente = new DaoCliente();
		daoCliente.setup();
		Cliente book = daoCliente.read(1);
		book.imprimir();
	}

	public static void update() {
		DaoCliente daoCliente = new DaoCliente();
		daoCliente.setup();
		Cliente client = daoCliente.read(1);
		client.setNombre("Daniel");
		daoCliente.update(client);
	}
	
	public static void delete() {
		DaoCliente daoCliente = new DaoCliente();
		daoCliente.setup();
		daoCliente.delete(1);
	}
}
