package com.greatLearning.SpringDemo;

public class CricketCoach implements SportsCoach {

	private ExpertAdvice expertAdvice;

	public CricketCoach(ExpertAdvice expertAdvice) {
		super();
		this.expertAdvice = expertAdvice;
	}

	@Override
	public String getSchedule() {

		return "Do Practice @ 6 AM.";
	}

	@Override
	public String getAdvice() {
		return expertAdvice.getExpertAdvice();
	}

}
