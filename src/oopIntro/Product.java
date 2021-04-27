package oopIntro;

public class Product {
	
	public Product() {  //constructor
		System.out.println("Ben çalýþtým.");
	}
	
	public Product(int id, String name, double unitPrice, String detail) { //constructor
		this();                  // Üstteki parametersiz constructor ýn bir kere bu constructor dan çalýþmasýný saðlar
		
		this.id = id;            // this --> bu class 'daki anlamýna gelir. this.id bu class 'daki id demektir.
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
