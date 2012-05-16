/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wwg.infoTools.members;

import wwg.infoTools.infoRetriever;

/**
 *
 * @author CmptrPrgmr
 */
public class member extends memberPatterns {
	
	private int currentExp;
	private int expToNextLevel;
	private int hoursPlayed;
	private double killDeathRatio;
	private int level;
	private String psn;
	private boolean premium;
	private int prestige;
	private int winPercentage;
	
	private static String url = "http://world-wide-gmrz.googlecode.com/git/src/wwg/database/"
			+ "memberInfo";
	
	public member(String psn)
	{
		this.currentExp = Integer.parseInt(getInfo(url, psn + currentExpPattern).toString());
		this.expToNextLevel = Integer.parseInt(getInfo(url, psn + expToNextLevelPattern).
				toString());
		this.hoursPlayed = Integer.parseInt(getInfo(url, psn + hoursPlayedPattern).toString());
		this.killDeathRatio = Double.parseDouble(getInfo(url, psn + killDeathRatioPattern).
				toString());
		this.level = Integer.parseInt(getInfo(url, psn + levelPattern).toString());
		this.psn = psn;
		this.premium = Boolean.parseBoolean(getInfo(url, psn + premiumPattern).toString());
		this.prestige = Integer.parseInt(getInfo(url, psn + prestigePattern).toString());
		this.winPercentage = Integer.parseInt(getInfo(url, psn + winPercentagePattern).
				toString());
	}
	
	public int getExp()
	{
		return this.currentExp;
	}
	
	public int getExpToNextLevel()
	{
		return this.expToNextLevel;
	}
	
	public int getHoursPlayed()
	{
		return this.hoursPlayed;
	}
	
	public double getKillDeathRatio()
	{
		return this.killDeathRatio;
	}
	
	public int getLevel()
	{
		return this.level;
	}
	
	public String getPSN()
	{
		return this.psn;
	}
	
	public int getPrestige()
	{
		return this.prestige;
	}
	
	public int getWinPercentage()
	{
		return this.winPercentage;
	}
	
	public boolean isPremium()
	{
		return this.premium;
	}
	
}
