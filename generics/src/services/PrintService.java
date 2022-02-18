package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {

	private List<Integer> list = new ArrayList<>();
	
	public void addValue(int value) {
		list.add(value);
	}
	
	public int first() {
		if (list.isEmpty()) {
			throw new IllegalArgumentException("List is empty");
		}
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			list.get(i);
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}
}	
	
