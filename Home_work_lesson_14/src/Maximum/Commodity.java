package Maximum;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Commodity {

	private String name;
	private int lenght;
	private int width;
	private int weight;

	Set<Commodity> product = new HashSet<>();

	public Commodity() {

	}

	public Commodity(String name, int lenght, int width, int weight) {
		super();
		this.name = name;
		this.lenght = lenght;
		this.width = width;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Commodity [name=" + name + ", lenght=" + lenght + ", width=" + width + ", weight=" + weight + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lenght;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + weight;
		result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commodity other = (Commodity) obj;
		if (lenght != other.lenght)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (weight != other.weight)
			return false;
		if (width != other.width)
			return false;
		return true;
	}

	public void addProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of product: ");
		String name = sc.next();
		System.out.println("Enter lenght of product: ");
		int lenght = sc.nextInt();
		System.out.println("Enter width of product: ");
		int widht = sc.nextInt();
		System.out.println("Enter weight of product: ");
		int width = sc.nextInt();

		product.add(new Commodity(name, lenght, width, width));
		System.out.println("Added");
	}

	public void removeProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of product: ");
		String name = sc.next();

		Iterator<Commodity> iterator = product.iterator();

		while (iterator.hasNext()) {
			Commodity next = iterator.next();
			if (next.getName().equalsIgnoreCase(name)) {
				iterator.remove();
			}
		}
		System.out.println("Removed");
	}

	public void replaceProduct() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.next();

		Iterator<Commodity> iterator = product.iterator();
		while (iterator.hasNext()) {
			Commodity next = iterator.next();
			if (next.getName().equalsIgnoreCase(name)) {
				System.out.println("Enter new name: ");
				next.setName(sc.next());
				System.out.println("Enter new length: ");
				next.setLenght(sc.nextInt());
				System.out.println("Enter new width: ");
				next.setWidth(sc.nextInt());
				System.out.println("Enter new weight: ");
				next.setWeight(sc.nextInt());
			}
		}
	}

	public void sortingByName() {

		Set<Commodity> productS = new TreeSet<>(new CommodityNameComparator());

		productS.addAll(product);
		for (Commodity commodity : productS) {
			System.out.println(commodity);
		}
	}

	public void sortingByLength() {
		Set<Commodity> productS = new TreeSet<>(new CommodityLengthComparator());

		productS.addAll(product);
		for (Commodity commodity : productS) {
			System.out.println(commodity);
		}
	}

	public void sortingByWidth() {
		Set<Commodity> productS = new TreeSet<>(new CommodityWidthComparator());

		productS.addAll(product);
		for (Commodity commodity : productS) {
			System.out.println(commodity);
		}
	}

	public void sortingByWeight() {
		Set<Commodity> productS = new TreeSet<>(new CommodityWeightComparator());

		productS.addAll(product);
		for (Commodity commodity : productS) {
			System.out.println(commodity);
		}
	}

	public void printElement() {
		List<Commodity> productList = new ArrayList<>();
		productList.addAll(product);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index: ");
		int i = sc.nextInt();

		System.out.println(productList.get(i));
	}

	public void show() {
		for (Commodity commodity : product) {
			System.out.println(commodity);
		}
	}

	public void exit() {
		System.out.println("Exit");
		System.exit(0);
	}
}
