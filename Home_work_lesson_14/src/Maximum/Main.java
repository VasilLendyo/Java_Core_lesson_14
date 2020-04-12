package Maximum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Commodity commodity = new Commodity();

		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();
			switch (sc.next()) {
			case "1": {
				commodity.addProduct();
				commodity.show();
				break;
			}
			case "2": {
				commodity.removeProduct();
				commodity.show();
				break;
			}
			case "3": {
				commodity.replaceProduct();
				commodity.show();
				break;
			}
			case "4": {
				commodity.sortingByName();
				break;
			}
			case "5": {
				commodity.sortingByLength();
				break;
			}
			case "6": {
				commodity.sortingByWidth();
				break;
			}
			case "7": {
				commodity.sortingByWeight();
				break;
			}
			case "8": {
				commodity.printElement();
				break;
			}
			case "9": {
				commodity.exit();
				break;
			}
			}
		}
	}

	public static void menu() {
		System.out.println();
		System.out.println("Enter 1, to add a product");
		System.out.println("Enter 2, to remove a product");
		System.out.println("Enter 3, to replace a product");
		System.out.println("Enter 4, to sorting by name");
		System.out.println("Enter 5, to sorting by length");
		System.out.println("Enter 6, to sorting by width");
		System.out.println("Enter 7, to sorting by weight");
		System.out.println("Enter 8, to ptint elemtnt by index");
		System.out.println("Enter 9, to exit from program");
	}
}
