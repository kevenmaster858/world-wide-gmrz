
package wwg.infoTools.members;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import wwg.infoTools.infoRetriever;

/**
 *
 * @author CmptrPrgmr
 */
public class members {
	
	private static ArrayList<String> allMembers = new ArrayList<String>();
	
	private static String strURL = "http://world-wide-gmrz.googlecode.com/git/src/wwg/database/"
			+ "members";
	
	public static member get(String psn)
	{
		getMembers(members.strURL);
		if (allMembers.contains(psn))
			return new member(psn);
		return null;
	}
	
	public static member[] getMembers()
	{
		if (allMembers.isEmpty())
			getMembers(members.strURL);
		member[] allMembers2 = new member[allMembers.size()];
		for (int i = 0; i < allMembers.size(); i++)
		{
			allMembers2[i] = new member(allMembers.get(i));
		}
		//allMembers2 = allMembers.toArray(new String[allMembers.size()]);
		return allMembers2;
	}
	
	public static int getMemberCount()
	{
		if (allMembers.isEmpty())
			getMembers(members.strURL);
		return allMembers.size();
	}
	
	private static void getMembers(String strURL) {
			BufferedReader x = null;
			try
			{
				//Pattern pattern = Pattern.compile(infoPattern);
				URL url = new URL(strURL);
				x = new BufferedReader(new InputStreamReader(url.openStream()));
				String inputLine;
				while ((inputLine = x.readLine()) != null)
				{
					allMembers.add(inputLine);
//					System.out.print(inputLine);
//					Matcher matcher = pattern.matcher(inputLine);
//					if(matcher.find())
//					{
//						return matcher.group(1);
//					}
				}
				x.close();
			}
			catch (MalformedURLException e)
			{
			}
			catch (IOException e)
			{
			}
			finally
			{
				if(x!=null)
				{
					try
					{
						x.close();
					}
					catch(Exception e)
					{
					}
				}
			}
		}
	
}
