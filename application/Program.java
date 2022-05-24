package application;

import entities.Account;
import entities.EntitiesException;

public class Program {

	public static void main(String[] args) {
		try {
			Account acc = new Account(3021, "Matheus", 200.0, 2000.0);
			acc.withdraw(2500);
		}catch(EntitiesException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("Erro inesperado");
		}
		
		try {
			Account acc = new Account(3021, "Matheus", 3500.0, 2500.0);
			acc.withdraw(2400.0);
			System.out.println(acc.getBalance());
			acc.withdraw(200);
		}catch(EntitiesException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("Erro inesperado");
		}
		
	}

}
