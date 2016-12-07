package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.employees.*;
import java.util.*;

public class CaretakerFactory extends EmployeeFactory {

	public Employee getEmployee(String type) throws Exception {

		Random random = new Random();
		// int name =
		// random.nextInt(Constants.Employees.Caretakers.NAME.length);
		// int salary = random.nextInt(100);
		int workingHours = random.nextInt(50);
		if (Constants.Employees.Caretakers.CARETAKER.equals(type)) {
			return new Caretaker(workingHours);

		} else {
			throw new Exception("Invalid caretaker exception!");
		}
	}

	public CaretakerFactory() {
		// TODO Auto-generated constructor stub
		super();
	}

}
