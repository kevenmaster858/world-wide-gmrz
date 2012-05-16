
package wwg.infoTools.members;

import wwg.infoTools.infoRetriever;

/**
 *
 * @author CmptrPrgmr
 */
public class memberPatterns  extends infoRetriever {

	static String currentExpPattern = "\\p{Punct}Current\\sExp\\p{Punct}";
	static String expToNextLevelPattern = "\\p{Punct}Exp\\sTo\\sNext\\sLevel\\p{Punct}";
	static String killDeathRatioPattern = "\\p{Punct}Kill\\sDeath\\sRatio\\p{Punct}";
	static String levelPattern = "\\p{Punct}Level\\p{Punct}";
	//static String memberCountPattern = "\\p{Punct}Current\\sExp\\p{Punct}";
	//static String namePattern = "\\p{Punct}Current\\sExp\\p{Punct}";
	static String premiumPattern = "\\p{Punct}Premium\\p{Punct}";
	static String prestigePattern = "\\p{Punct}Prestige\\p{Punct}";
	static String hoursPlayedPattern = "\\p{Punct}Hours\\sPlayed\\p{Punct}";
	static String winPercentagePattern = "\\p{Punct}Win\\sPercentage\\p{Punct}";
	
}
