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
		firstWords.add("jlksjdfqiwuernmvncxzbxcv");
		firstWords.add("bababababababababababababa");
		firstWords.add(1, "CRYING INSANELY");
		displayList();
		firstWords.set(2, "mamamamamamamamamamamama");
		displayList();
		firstWords.remove(0);
		displayList();
		showOtherLoop();
	}
	
	private void displayList()
	{
		popupDisplay.showList("The size of the list is: " + firstWords.size());
		for(int spot = 0; spot < firstWords.size(); spot++)
		{
			popupDisplay.showList("The contents at spot " + spot + " are \"" + firstWords.get(spot) + "\"");
			firstWords.remove(0);
		}
	}
	
	private void showOtherLoop()
	{
		for(String words : firstWords)
		{
			popupDisplay.showList(words);
		}
	}
}
