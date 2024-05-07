package ua.khpi.oop.darius.finalTask;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CustomerProcessor {
	
	public static void add(ArrayList <Customer> Customers,String name, String surname, List<String>number, LocalDate date) {
		Customers.add(new Customer(name, surname, number, date));
	}
	public static void deleteCustomer(ArrayList<Customer> Customers, String name, String surname) {
		String deleteName = name;
		String deleteSurname = surname;
		Iterator<Customer> iterator = Customers.iterator();
		while (iterator.hasNext()) {
			Customer customer = iterator.next();
			if (customer.getName().equals(deleteName) && customer.getSurname().equals(deleteSurname)) {
				iterator.remove(); // Remove the customer
				System.out.println("Customer " + deleteName + " " + deleteSurname + " deleted \n");
			}
		}

	}
	public static void showAll(ArrayList<Customer>Customers) {
		for(Customer x : Customers) {
		System.out.println(x.getName());
		System.out.println(x.getSurname());
		System.out.println(x.getPhoneNumbers());
		System.out.println(x.getRegistrationDate()+"\n");
		
		}
	}
	
	public static void sortBySurname(ArrayList<Customer> customers) {
		customers.sort(Comparator.comparing(Customer::getSurname)
								  .thenComparing(Customer::getName));
	}
	
	public static Customer searchByPhoneNumber(ArrayList<Customer> customers, String phoneNumber) {
		for (Customer customer : customers) {
			List<String> phoneNumbers = customer.getPhoneNumbers();
			if (phoneNumbers != null && phoneNumbers.contains(phoneNumber)) {
				return customer; // Return the customer if the phone number matches
			}
		}
		return null; // Return null if no customer with the phone number is found
	}

	public static Customer searchByNameAndSurname(ArrayList<Customer> customers, String name, String surname) {
		for (Customer customer : customers) {
			if (customer.getName().equalsIgnoreCase(name) && customer.getSurname().equalsIgnoreCase(surname)) {
				return customer; // Return the customer if the name and surname match
			}
		}
		return null; // Return null if no customer with the name and surname is found
	}

	public static Customer searchByRegistrationDate(ArrayList<Customer> customers, LocalDate date) {
		for (Customer customer : customers) {
			if (customer.getRegistrationDate().isEqual(date)) {
				return customer; // Return the customer if the registration date matches
			}
		}
		return null; // Return null if no customer with the registration date is found
	}
}


