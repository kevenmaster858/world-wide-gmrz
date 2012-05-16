/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wwg.infoTools.clan;

/**
 *
 * @author CmptrPrgmr
 */
public class clan extends clanPatterns {
	
	private static String url = "http://world-wide-gmrz.googlecode.com/git/src/wwg/database/"
			+ "clanInfo";
	
	public static String getClanCreator()
	{
		System.out.print(getInfo(clan.url, clanCreatorPattern).toString());
		return getInfo(clan.url, clanCreatorPattern).toString();
	}
	
	public static String getClanName()
	{
		return getInfo(clan.url, clanNamePattern).toString();
	}
	
	public static String getClanOwner()
	{
		return getInfo(clan.url, clanOwnerPattern).toString();
	}
	
	public static String getClanTag()
	{
		return getInfo(clan.url, clanTagPattern).toString();
	}
	
//	public static String getCurrentOpObjective()
//	{
//		return getInfo("lkjasdf", currentOpObjective).toString();
//	}
//	
//	public static String getCurrentOpTime()
//	{
//		return getInfo("lkjsdf", currentOpTime).toString();
//	}
	
	public static int getExpToNextLevel()
	{
		return Integer.parseInt(getInfo(clan.url, expToNextLevelPattern).toString());
	}
	
	public static int getExp()
	{
		return Integer.parseInt(getInfo(clan.url, currentExpPattern).toString());
	}
	
	public static int getHoursPlayed()
	{
		return Integer.parseInt(getInfo(clan.url, hoursPlayedPattern).toString());
	}
	
	public static double getKillDeathRatio()
	{
		return Double.parseDouble(getInfo(clan.url, killDeathRatioPattern).toString());
	}
	
	public static int getLevel()
	{
		return Integer.parseInt(getInfo(clan.url, levelPattern).toString());
	}
	
	public static String getMotto()
	{
		return getInfo(clan.url, mottoPattern).toString();
	}
	
//	public static String getNextOpObjective()
//	{
//		return getInfo("lkjsdf", nextOpObjective).toString();
//	}
//	
//	public static String getNextOpTime()
//	{
//		return getInfo("lkjsdfj", nextOpTime).toString();
//	}
	
}
