package com.karthicksmail.designpatterns.mediator;

import java.util.ArrayList;

/**
 * @author karthicksmail
 *
 */
public class Mediator {
	private ArrayList<IColleague> colleagueList = new ArrayList<IColleague>();
	private boolean value = false;

	public boolean register(IColleague colleague) {
		System.out.println("Registering " + colleague.getClass().getSimpleName());
		return colleagueList.add(colleague);
	}

	public void setValue(boolean  value) {
		this.value = value;
	}

	public void invokeFlow(int flow) {
		switch (flow) {
		case 1: 
			colleagueList.get(0).execute();
			colleagueList.get(1).execute();
			colleagueList.get(2).execute();
			break;
		case 2:
			colleagueList.get(1).execute();
			colleagueList.get(3).execute();
			colleagueList.get(2).execute();
			colleagueList.get(5).execute();
			break;
		case 3:
			colleagueList.get(0).execute();
			colleagueList.get(4).execute();
			colleagueList.get(1).execute();
			break;
		case 4:
			colleagueList.get(0).execute();
			if (value) {
				colleagueList.get(7).execute();
				colleagueList.get(1).execute();
			} else {
				colleagueList.get(5).execute();
				colleagueList.get(2).execute();
				colleagueList.get(6).execute();
			}
			colleagueList.get(3).execute();
			break;
		default:
			System.out.println("ALERT!!! Wrong flow ID");
		}
	}
}
