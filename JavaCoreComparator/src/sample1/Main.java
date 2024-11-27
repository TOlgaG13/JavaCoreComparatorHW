package sample1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat("Mia", 7);
		Cat cat2 = new Cat("Martin", 12);
		Cat cat3 = new Cat("Francheska", 5);
		Cat cat4 = new Cat("Ricki", 2);
		Cat cat5 = new Cat("Grisha", 4);
		Cat[] cats = new Cat[] { cat1, cat2, cat3, cat4, cat5 };

		CatNameComparator comp = new CatNameComparator();
		Arrays.sort(cats, comp);
		for (Cat cat : cats) {
			System.out.println(cat.getName() + " - " + cat.getAge());
		}
	}
}

class CatNameComparator implements Comparator<Cat> {
	@Override
    public int compare(Cat o1, Cat o2) {
        int lengthComparison = Integer.compare(o1.getName().length(), o2.getName().length());
        
        
        if (lengthComparison == 0) {
            return o1.getName().compareTo(o2.getName());
        }
        
        return lengthComparison;
	}
}