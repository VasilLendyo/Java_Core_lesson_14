package Minimum;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Set<Person> hs = new HashSet<>();
		hs.add(new Person("Karl", 46));
		hs.add(new Person("Andrew", 25));
		hs.add(new Person("Nazar", 19));
		hs.add(new Person("Natali", 22));
		
		System.out.println("Before sorting: ");
		for (Person person : hs) {
			System.out.println(person);
		}
		
		System.out.println();
		
		Set<Person> ts = new TreeSet<>();
		ts.addAll(hs);
		
		System.out.println("After sorting by age: ");
		for (Person person : ts) {
			System.out.println(person);
		}
		
		System.out.println();
		
		Set<Person> ts2 = new TreeSet<>(new PersonNameComparator());
		ts2.addAll(hs);
		
		System.out.println("After sorting by name: ");
		for (Person person : ts2) {
			System.out.println(person);
		}
	}
}

class PersonNameComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		
		
		return o1.getName().compareTo(o2.getName());
	}
	
}
