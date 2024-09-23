package com.deloitte.lab4.Ex1;

class Account{
	private Person accHolder;
	private long accNum;
	private double bal;
	
	
	public Account() {
		super();
	}

	public Account(long accNum, double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.bal = balance;
		this.accHolder = accHolder;
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return bal;
	}

	public void setBalance(double balance) {
		this.bal = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	public void deposit(double amt) {
		double val = this.getBalance() + amt;
		this.setBalance(val);
	}
	
	public void withdraw(double amt) {
		double val = this.getBalance() - amt;
		this.setBalance(val);
	}
	
	
}

class Person{
	private String name;
	private float age;
	
	public Person() {
		super();
	}

	public Person(String name, float age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}
	
}

public class Lab4Ex1 {
	
	public static void main(String[] args) {
		Person p1 = new Person("Maze", 24.5f);
		Person p2 = new Person("Zaxo", 36.4f);
		
		Account smith = new Account(956, 2599.0, p1);
		Account kathy = new Account(785, 96245.0, p2);
		
		smith.deposit(2000);
		kathy.withdraw(2000);
		
		System.out.println("New balance of smith: "+smith.getBalance());
		System.out.println("New balance of Kathy: "+kathy.getBalance());
	}
}
