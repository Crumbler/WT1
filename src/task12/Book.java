package task12;

public class Book implements Comparable {
	protected String title;
	protected String author;
	protected int price;
	protected int edition;
	protected long isbn;
	
	Book()
	{
		this.title = null;
		this.author = null;
	}
	
	Book(String title, String author, int price, int edition, long isbn)
	{
		this.title = title;
		this.author = author;
		this.price = price;
		this.edition = edition;
		this.isbn = isbn;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
		{
			return true;
		}
		
		if (obj == null)
		{
			return false;
		}
		
		if (this.getClass() != obj.getClass())
		{
			return false;
		}
		
		Book b = (Book)obj;
		
		return this.title.equals(b.title) &&
			   this.author.equals(b.author) &&
			   this.price == b.price &&
			   this.edition == b.edition &&
			   this.isbn == b.isbn;
	}
	
	@Override
	public int hashCode()
	{
		int hashcode = this.title.hashCode();
		hashcode = hashcode * 31 + this.author.hashCode();
		hashcode = hashcode * 31 + this.price;
		hashcode = hashcode * 31 + this.edition;
		hashcode = (int)(hashcode * 31 + this.isbn);
		
		return hashcode;
	}
	
	protected static String isbnToString(long isbn)
	{
		long part2 = isbn / 10L,
			 part3 = part2 / 1000_000L,
			 part4 = part3 / 100L,
			 part5 = part4 / 10L;
		
		return isbn % 10L + "-" +
			   part2 % 1000_000L + "-" +
			   part3 % 100L + "-" +
			   part4 % 10L + "-" +
			   part5;
	}
	
	@Override 
	public String toString()
	{
		return Book.isbnToString(this.isbn) + " " +
			   this.title + " by " + 
			   this.author + ", edition " +
			   this.edition + ", " +
			   this.price + "$";
	}
	
	@Override
	protected Object clone()
	{
		return new Book(this.title, this.author,
						this.price, this.edition,
						this.isbn);
	}
	
	public int compareTo(Object o)
	{
		if (o == null)
		{
			throw new NullPointerException();
		}
		
		if (this.getClass() != o.getClass())
		{
			throw new ClassCastException();
		}
		
		Book b = (Book)o;
		
		if (this.isbn < b.isbn)
		{
			return -1;
		}
		
		if (this.isbn > b.isbn)
		{
			return 1;
		}
		
		return 0;
	}
}
