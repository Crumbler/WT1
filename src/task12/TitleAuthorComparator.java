package task12;

import java.util.Comparator;

public class TitleAuthorComparator implements Comparator<Book> {
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
		
		return o1.getAuthor().compareTo(o2.getAuthor());
	}
	
}
