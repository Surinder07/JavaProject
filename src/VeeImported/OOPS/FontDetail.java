package VeeImported.OOPS;

class Font
{
	private String fontName;
	private int size;
	private String fontstyle;
	
	
	public Font()
	{
		this.fontName = "Time New Roman";
		this.size = 21;
		this.fontstyle ="BOLD";		
	}
	public void show()
	{
			System.out.println("Font Name   : "+fontName);
			System.out.println("Font Size   : "+size);
			System.out.println("Font Style  : "+fontstyle);
	}
}
public class FontDetail 
{
	public static void main(String[] args) 
	{
		Font f = new Font();
		
		f.show();
		
	}
}
