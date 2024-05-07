package ua.khpi.oop.darius.finalTask;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<Customer> Customers = new ArrayList<>();
		CustomerProcessor.add(Customers,"Xavier", "Thompson", List.of("+37061225987"), LocalDate.of(2000, 02, 03));
		CustomerProcessor.add(Customers, "John", "Simmons", List.of("+37063588456"), LocalDate.of(2001, 01, 12));
		CustomerProcessor.add(Customers, "Pete", "Whitaker", List.of("+37064455269"), LocalDate.of(1997,12, 13));
		CustomerProcessor.add(Customers, "Shawn", "Green", List.of("+37065889512"), LocalDate.of(1999,11, 05));
		CustomerProcessor.showAll(Customers);
		//Delete customer by name and surname
		CustomerProcessor.deleteCustomer(Customers, "Xavier", "Thompson");
		CustomerProcessor.showAll(Customers);
		System.out.println("Sorted by surname \n");
		CustomerProcessor.sortBySurname(Customers);
		CustomerProcessor.showAll(Customers);
		System.out.print(CustomerProcessor.searchByNameAndSurname(Customers, "Shawn", "Green") + "\n\n");
		System.out.print(CustomerProcessor.searchByRegistrationDate(Customers, LocalDate.of(1997,11, 05)) + "\n\n");
		System.out.print(CustomerProcessor.searchByPhoneNumber(Customers, "+37065889512") + "\n\n");

		customerSerializer(Customers);
		
		ArrayList<Customer>customers2= customerDeserializer(Customers);
		System.out.print(customers2);
	}


	public static void customerSerializer(ArrayList<Customer> Customers) throws IOException {
		FileOutputStream fileOut = new FileOutputStream("CustomerInfo.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(Customers);
		out.close();
		fileOut.close();
		System.out.println("Customer info saved");
	}
	public static ArrayList<Customer> customerDeserializer(ArrayList<Customer>Customers) throws IOException, ClassNotFoundException {
		FileInputStream fileIn = new FileInputStream("C:\\Users\\darius\\eclipse-workspace\\oop\\CustomerInfo.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		Customers =(ArrayList<Customer>)in.readObject();
		in.close();
		fileIn.close();
		return Customers;
		
	}
}