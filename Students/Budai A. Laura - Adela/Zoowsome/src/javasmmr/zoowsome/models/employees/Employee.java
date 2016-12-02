package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

public abstract class Employee {
	String name;
	Long id;
	BigDecimal salary;
	boolean isDead;
	
	public String getName(){
		return this.name;	
	}
	
	public void setName(String name) {
		this.name = name;
	}

	
	public Long getId(){
		return this.id;	
	}
	
	public void setId() {
		long number = (long) Math.floor(Math.random() * 9000000000000L) + 1000000000000L;
		this.id = number;
	}
	
	public BigDecimal getSalary(){
		return this.salary;	
	}
	
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public boolean getIsDead(){
		return this.isDead;	
	}
	
	public void setIsDead(boolean isDead) {
		this.isDead = isDead;
	}
}
