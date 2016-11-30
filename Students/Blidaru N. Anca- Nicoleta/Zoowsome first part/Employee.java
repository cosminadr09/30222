package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

public abstract class Employee {
	private String name;
	private long Id; // unique?
	private BigDecimal salary;
	private boolean isDead = false;

	public Employee(String name, boolean isDead, BigDecimal salary) {
		setName(name);
		setSalary(salary);
		setIsDead(isDead);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return Id;
	}

	public void setId(long Id) { // random number generator
									// pseudo-random 13 digit code
		this.Id = (long) (Math.random() * 10000000 * 1000000);
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public boolean getIsDead() {
		return isDead;
	}

	public void setIsDead(boolean isDead) {
		this.isDead = isDead;
	}
}
