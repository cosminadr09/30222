package javasmmr.zoowsome.services.factories;

import java.util.Random;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;

public class CaretakerFactory extends EmployeeFactory {

	@Override
	public Employee getEmployeeFactory(String type) throws Exception {

		int randomName;
		Random random = new Random();
		randomName = random.nextInt(Constants.Employees.Caretakers.NAME.length);

		if (Constants.Employees.Caretakers.CARETAKER.equals(type)) {
			return new Caretaker(Constants.Employees.Caretakers.NAME[randomName], false, null);
		} 
		else {
			throw new Exception("Invalid employee exception");
		}
	}

}
