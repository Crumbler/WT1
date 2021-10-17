package task12;

public class ProgrammerBook extends Book {
	private String language;
	private int level;
	
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
		
		ProgrammerBook b = (ProgrammerBook)obj;
		
		return this.title.equals(b.title) &&
			   this.author.equals(b.author) &&
			   this.price == b.price &&
			   this.edition == b.edition &&
			   this.language.equals(b.language) &&
			   this.level == b.level;
	}
	
	@Override
	public int hashCode()
	{
		int hashcode = this.title.hashCode();
		hashcode = hashcode * 31 + this.author.hashCode();
		hashcode = hashcode * 31 + this.price;
		hashcode = hashcode * 31 + this.edition;
		hashcode = hashcode * 31 + this.language.hashCode();
		hashcode = hashcode * 31 + this.level;
		
		return hashcode;
	}
	
	@Override 
	public String toString()
	{
		return this.title + " by " + 
			   this.author + ", edition " +
			   this.edition + ", " +
			   this.price + "$ in " +
			   this.language + " of " +
			   this.level + " level";
	}
}
