/**
 * 
 */
package com.karthicksmail.designpatterns.mediator;

/**
 * @author karthicksmail
 *
 */
public class ConcreteColleague8 implements IColleague {
	/* (non-Javadoc)
	 * @see com.karthicksmail.designpatterns.mediator.IColleague#execute()
	 */
	public void execute() {
		System.out.println("Executing " + this.getClass().getSimpleName());
	}
}
