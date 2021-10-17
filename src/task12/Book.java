package task12;

public class Book {
	protected String title;
	protected String author;
	protected int price;
	protected int edition;
	
	Book()
	{
		this.title = null;
		this.author = null;
	}
	
	Book(String title, String author, int price, int edition)
	{
		this.title = title;
		this.author = author;
		this.price = price;
		this.edition = edition;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if (obj == null)
		{
			return false;
		}
		
		if (obj == this)
		{
			return true;
		}
		
		Book b = (Book)obj;
		
		return this.title.equals(b.title) &&
			   this.author.equals(b.author) &&
			   this.price == b.price &&
			   this.edition == b.edition;
	}
	
	@Override
	public int hashCode()
	{
		int hashcode = this.title.hashCode();
		hashcode = hashcode * 31 + this.author.hashCode();
		hashcode = hashcode * 31 + this.price;
		hashcode = hashcode * 31 + this.edition;
		
		return hashcode;
	}
	
	@Override 
	public String toString()
	{
		return this.title + " by " + 
			   this.author + ", edition " +
			   this.edition + ", " +
			   this.price + "$";
	}
	
	@Override
	protected Object clone()
	{
		return new Book(this.title, this.author,
						this.price, this.edition);
	}
}
