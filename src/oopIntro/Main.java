package oopIntro;

public class Main {

	public static void main(String[] args) {
		
	Product product1 = new Product(1, "Lenovo V14", 8000, "16 GB RAM", 10); //ornek olusturma, referans olusturma, crate instance

	
	Product product2 = new Product();  //ornek olusturma, referans olusturma, crate instance
	product2.setId(2);
	product2.setName("Lenovo V15");
	product2.setDetail("8 GB RAM");
	product2.setDiscount(12);
	product2.setUnitPrice(6000);
	
	System.out.println(product2.getUnitPriceAfterDiscount());
	
	
	Category category1 = new Category();
	category1.setId(1);
	category1.setName("Ýçecek");
	
	Category category2 = new Category();
	category2.setId(2);
	category2.setName("Yiyecek");
	
	System.out.println(category1.getName());
	System.out.println(category2.getName());
	
	}
	
}
	
	
