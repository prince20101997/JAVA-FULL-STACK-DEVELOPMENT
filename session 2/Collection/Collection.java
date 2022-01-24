package Collection;
import java.util.*;

public class Collection {

	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("prince");
	    list.add("premna");
	    list.add("richa");
	    list.add("rhieds");
	    System.out.println(list);
	    list.remove(3);
	    System.out.println(list);
	    System.out.println(list.contains("prince"));
	    System.out.println("element from index 3"+list.get(1));
	}
}
