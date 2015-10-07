package lists.contoller;

import java.util.ArrayList;
import lists.view.ListView;

public class ArrayListController
{
	private ArrayList<String> firstWords;
	private ListView popupDisplay;
	
	public ArrayListController()
	{
		firstWords = new ArrayList<String>();
		popupDisplay = new ListView();
	}
	
	public void start()
	{	
		firstWords.add("Hello Lists!");
		displayList();
	}
	
	private void displayList()
	{
		for(int spot = 0; spot < firstWords.size(); spot++)
		{
			popupDisplay.showList("The contents at spot " + spot + " are \"" + firstWords.get(spot) + "\"");
		}
	}
}
