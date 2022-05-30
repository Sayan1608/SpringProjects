package com.greatLearning.SpringDemo;

public class FootballCoach implements SportsCoach {

	private ExpertAdvice expertAdvice;

	public ExpertAdvice getExpertAdvice() {
		return expertAdvice;
	}

	public void setExpertAdvice(ExpertAdvice expertAdvice) {
		this.expertAdvice = expertAdvice;
	}

	@Override
	public String getSchedule() {
		// TODO Auto-generated method stub
		return "Start Practice @ 5 AM.";
	}

	@Override
	public String getAdvice() {
		return expertAdvice.getExpertAdvice();
	}

}
