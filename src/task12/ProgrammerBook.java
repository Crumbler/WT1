package task12;

public class ProgrammerBook extends Book {
	private String language;
	private int level;
	
	@Override
	public boolean equals(Object obj)
	{
		if (!super.equals(obj))
		{
			return false;
		}
		
		ProgrammerBook b = (ProgrammerBook)obj;
		
		return this.language.equals(b.language) &&
			   this.level == b.level;
	}
	
	@Override
	public int hashCode()
	{
		int hashcode = super.hashCode();
		hashcode = hashcode * 31 + this.language.hashCode();
		hashcode = hashcode * 31 + this.level;
		
		return hashcode;
	}
	
	@Override 
	public String toString()
	{
		return super.toString() + " in " +
					 this.language + " of " +
					 this.level + " level";
	}
}
