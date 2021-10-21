package task12;

import java.util.Comparator;

public class TitleAuthorPriceComparator implements Comparator<Book> {
	@Override
	public int compare(Book o1, Book o2) {
		if (o1 == null || o2 == null)
		{
			throw new NullPointerException();
		}
		
		if (o1.getClass() != Book.class ||
			o2.getClass() != Book.class)
		{
			throw new ClassCastException();
		}
		
		int comp1 = o1.getTitle().compareTo(o2.getTitle());
		
		if (comp1 != 0)
		{
			return comp1;
		}
		
		int comp2 = o1.getAuthor().compareTo(o2.getAuthor());
		
		if (comp2 != 0)
		{
			return comp2;
		}
		
		int comp3 = o1.getPrice() - o2.getPrice();
		
		if (comp3 < 0)
		{
			return -1;
		}
		
		if (comp3 > 0)
		{
			return 1;
		}
		
		return 0;
	}
	
}
