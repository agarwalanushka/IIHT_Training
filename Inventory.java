package assignmentSep23;

/*
 * User will enter the product that they want to buy
 * Output: The price of the product cheapest and the name of the seller
 * also ask if user want to see other sellers if yes then show with price
 */
import java.util.Scanner;
class Product{
	String product1,product2,product3;
	
	void setProduct(String str1,String str2,String str3) {
		this.product1=str1;
		this.product2=str2;
		this.product3=str3;
	}
	
	void getProduct() {
		System.out.println("Products available:");
		System.out.println("1- "+product1);
		System.out.println("2- "+product2);
		System.out.println("3- "+product3);
	}
}

abstract class SellerPrice{

	abstract int cost1();
	abstract int cost2();
	abstract int cost3();
	
}

class Seller1 extends SellerPrice{
	String checkseller() {
		return "Seller1";
	}
	
	//int price1,price2,price3;
	@Override
	public int cost1() {
		return 1000;
	}
	@Override
	public int cost2() {
		return 2000;
	}
	@Override
	public int cost3() {
		return 500;
	}
}

class Seller2 extends SellerPrice{
	String checkseller() {
		return "Seller2";
	}
	
	//int price1,price2,price3;
	@Override
	public int cost1() {
		return 2000;
	}
	@Override
	public int cost2() {
		return 1000;
	}
	@Override
	public int cost3() {
		return 600;
	}
}
public class Inventory {
	public static void main(String[] args) {
		Product product = new Product();
		product.setProduct("Samsung Phone", "Laptop", "Watch");
		product.getProduct();
		
		System.out.println("Enter the number of product you want to buy: ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Seller1 seller1 = new Seller1();
		Seller2 seller2 = new Seller2();
		
		int press = 0;
		if(n==1) {
			if(seller1.cost1()<seller2.cost1()) {
				System.out.println("Price: "+seller1.cost1()+" by seller 1");
				System.out.println("Do you want to see other seller price- Press 1");
				press = sc.nextInt();
				if(press==1) {
					System.out.println("Price: "+seller2.cost1()+" by seller 2");
				}
			}
			else {
				System.out.println("Price: "+seller2.cost1()+" by seller 2");
				System.out.println("Do you want to see other seller price- Press 1");
				press = sc.nextInt();
				if(press==1) {
					System.out.println("Price: "+seller1.cost1()+" by seller 1");
				}
			}
		}
		
		if(n==2) {
			if(seller1.cost2()<seller2.cost2()) {
				System.out.println("Price: "+seller1.cost2()+" by seller 1");
				System.out.println("Do you want to see other seller price- Press 1");
				press = sc.nextInt();
				if(press==1) {
					System.out.println("Price: "+seller2.cost2()+" by seller 2");
				}
			}
			else {
				System.out.println("Price: "+seller2.cost2()+" by seller 2");
				System.out.println("Do you want to see other seller price- Press 1");
				press = sc.nextInt();
				if(press==1) {
					System.out.println("Price: "+seller1.cost2()+" by seller 1");
				}
			}
		}
		
		if(n==3) {
			if(seller1.cost3()<seller2.cost3()) {
				System.out.println("Price: "+seller1.cost3()+" by seller 1");
				System.out.println("Do you want to see other seller price- Press 1");
				press = sc.nextInt();
				if(press==1) {
					System.out.println("Price: "+seller2.cost3()+" by seller 2");
				}
			}
			else {
				System.out.println("Price: "+seller2.cost3()+" by seller 2");
				System.out.println("Do you want to see other seller price- Press 1");
				press = sc.nextInt();
				if(press==1) {
					System.out.println("Price: "+seller1.cost3()+" by seller 1");
				}
			}		
		}
		
	}
}
