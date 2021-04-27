package oopIntro;

public class Product {
	
	public Product() {  //constructor
		System.out.println("Ben �al��t�m.");
	}
	
	public Product(int id, String name, double unitPrice, String detail) { //constructor
		this();                  // �stteki parametersiz constructor �n bir kere bu constructor dan �al��mas�n� sa�lar
		
		this.id = id;            // this --> bu class 'daki anlam�na gelir. this.id bu class 'daki id demektir.
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		
	}
	
	//class properties
	int id;
	String name;
	double unitPrice;
	String detail;

}
