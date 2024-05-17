package ua.khpi.oop.darius.task10;

import java.util.HashMap;
import java.util.Map;

public class Employees {
    public static void main(String[] args) {
        Map<String, String> employees = new HashMap<>();
        employees.put("a1234", "Steve Jobs");
        employees.put("a1235", "Scott McNealy");
        employees.put("a1236", "Jeff Bezos");
        employees.put("a1237", "Larry Ellison");
        employees.put("a1238", "Bill Gates");

        String key = "A1234";
        key = key.toLowerCase(); // Ensure the key is lowercase for lookup
        String value = employees.get(key);
        if (value != null) {
            System.out.println(value);
        } else {
            System.out.println("key not found");
        }
    }
}