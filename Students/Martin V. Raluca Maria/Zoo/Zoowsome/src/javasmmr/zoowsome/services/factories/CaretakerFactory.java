package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.services.factories.Constants;

public class CaretakerFactory {
	public Employee getEmployee(String type) throws Exception {
		if ( Constants.Employees.CARETAKER.equals(type) ) {
			return new Caretaker(type, null, null);
		} else {
			throw new Exception("Invalid employee exception");
		}

}
}