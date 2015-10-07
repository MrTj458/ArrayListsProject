package lists.contoller;

import java.util.ArrayList;
import lists.view.ListView;

public class ArrayListController
{
	private ArrayList<String> firstWords;
	private ListView listDisplay;
	
	public ArrayListController()
	{
		firstWords = new ArrayList<String>();
		listDisplay = new ListView();
	}
	
	public void start()
	{	
		firstWords.add("Hello Lists!");
		
		System.out.println(firstWords);
	}
}
