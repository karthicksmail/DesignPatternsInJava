package com.karthicksmail.designpatterns.mediator;

public class MediatorMain {
	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		ConcreteColleague1 concreteColleague1 = new ConcreteColleague1();
		ConcreteColleague2 concreteColleague2 = new ConcreteColleague2();
		ConcreteColleague3 concreteColleague3 = new ConcreteColleague3();
		ConcreteColleague4 concreteColleague4 = new ConcreteColleague4();
		ConcreteColleague5 concreteColleague5 = new ConcreteColleague5();
		ConcreteColleague6 concreteColleague6 = new ConcreteColleague6();
		ConcreteColleague7 concreteColleague7 = new ConcreteColleague7();
		ConcreteColleague8 concreteColleague8 = new ConcreteColleague8();

		mediator.register(concreteColleague1);
		mediator.register(concreteColleague2);
		mediator.register(concreteColleague3);
		mediator.register(concreteColleague4);
		mediator.register(concreteColleague5);
		mediator.register(concreteColleague6);
		mediator.register(concreteColleague7);
		mediator.register(concreteColleague8);

		for (int flowId = 0; flowId < 6; flowId++) {
			System.out.println("Flow Number " + flowId);
			mediator.invokeFlow(flowId);
		}
		System.out.println("Flow Number 4");
		mediator.setValue(true);
		mediator.invokeFlow(4);
		
	}
}
