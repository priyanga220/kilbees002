package com.springinaction.springidol;

public class Sonnet29 implements Poem 
{
	private static String[] LINES={
			"When,indisgrace with fortune and men's eyes,",
			"I all alone be weep my out cast state",
			"And trouble deaf heaven with my bootless cries",
			"And look up on mys elf and curse my fate,",
			"Wishing me like to one more rich in hope,",
			"Featuredlikehim,likehimwithfriendspossess'd,",
			"Desiringthisman'sartandthatman'sscope,",
			"WithwhatImostenjoycontentedleast;",
			"Yetinthesethoughtsmyselfalmostdespising,",
			"HaplyIthinkonthee,andthenmystate,",
			"Liketothelarkatbreakofdayarising",
			"Fromsullenearth,singshymnsatheaven'sgate;",
			"Forthysweetloveremember'dsuchwealthbrings",
			"ThatthenIscorntochangemystatewithkings."};

	@Override
	public void recite() {
		for(int i=0;i< LINES.length;i++)
		{
			System.out.println(LINES[i]);
		}
		
	}

}
