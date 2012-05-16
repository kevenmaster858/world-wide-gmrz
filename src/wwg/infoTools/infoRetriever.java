
package wwg.infoTools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author CmptrPrgmr
 */
public class infoRetriever {
	
	public static Object getInfo(String strURL, String infoPattern) {
			BufferedReader x = null;
			try
			{
				Pattern pattern = Pattern.compile(infoPattern);
				URL url = new URL(strURL);
				x = new BufferedReader(new InputStreamReader(url.openStream()));
				String inputLine;
				while ((inputLine = x.readLine()) != null)
				{
					Matcher matcher = pattern.matcher(inputLine);
					if(matcher.find())
					{
						//return matcher.group(1);
						return (inputLine = x.readLine());
					}
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
			return -1;
		}
	
}
