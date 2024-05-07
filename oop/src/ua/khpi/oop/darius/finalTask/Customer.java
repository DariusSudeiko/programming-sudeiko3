package ua.khpi.oop.darius.finalTask;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Customer implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
    private String surname;
    private List<String> phoneNumbers;
    private LocalDate registrationDate;

    public Customer(String name, String surname, List<String> phoneNumbers, LocalDate registrationDate) {
        this.name = normalize(name);
        this.surname = normalize(surname);
        this.phoneNumbers = new ArrayList<>(phoneNumbers);
        this.registrationDate = validateDate(registrationDate);
    }
    
    public static String normalize(String name) {
        if (name == null || name.isEmpty()) {
            return name; // Return unchanged if the name is null or empty
        }
        
        // Regular expression pattern to match the first letter (uppercase) and the rest (lowercase)
        Pattern pattern = Pattern.compile("^(\\p{Lu})(\\p{Ll}*)$");
        Matcher matcher = pattern.matcher(name);
        
        // Check if the name matches the pattern
        if (matcher.matches()) {
            // Concatenate the first letter (uppercase) with the rest (lowercase)
            return matcher.group(1) + matcher.group(2).toLowerCase();
        } else {
        	throw new IllegalArgumentException("invalid format for name or surname");
        }
    }
    private LocalDate validateDate(LocalDate date) {
        LocalDate minDate = LocalDate.of(1900, 1, 1);
        LocalDate currentDate = LocalDate.now();

        if (date.isBefore(minDate) || date.isAfter(currentDate)) {
            throw new IllegalArgumentException("Registration date must be between 1900 and the current year.");
        }

        return date;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                ", registrationDate=" + registrationDate +
                '}';
    }
}
    
    