package colleague;

import mediator.MachineMediator;

public class Heater implements Colleague {

	private MachineMediator mediator;
	
	@Override
	public void setMediator(MachineMediator mediator){
		this.mediator = mediator;
	}

	public void on(int temp) {
		System.out.println("colleague.Heater is on...");
		if(mediator.checkTemperature(temp)){
			System.out.println("Temperature is set to "+temp);
			mediator.off();
		}
	}
	
	public void off() {
		System.out.println("colleague.Heater is off...");
		mediator.wash();
	}
}
