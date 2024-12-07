package com.klu;
import com.klu.Customer;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {

    private List<Customer> customerList = new ArrayList<>();

    // 1. Mapping for /demo1 -> Returns an integer
    @GetMapping("/demo1")
    public int demo1() {
        return 42;
    }

    // 2. Mapping for /demo2 -> Returns a double value
    @GetMapping("/demo2")
    public double demo2() {
        return 3.1415;
    }

    // 3. Mapping for /demo3 -> Returns a formatted HTML string
    @GetMapping("/demo3")
    public String demo3() {
        return "<h1>This is Demo 3 - Formatted HTML String</h1>";
    }

    // 4. Mapping for /demo4 -> Returns a concatenated string
    @GetMapping("/demo4")
    public String demo4() {
        String university = "KLEF";
        return "I Study at " + university;
    }
     //http://localhost:8080/EXP7/demo5/1
    // 5. Mapping for /demo5/{id} -> Returns the value of path variable 'id'
    @GetMapping("/demo5/{id}")
    public String demo5(@PathVariable("id") int id) {
        return "Received ID: " + id;
    }
    //http://localhost:8080/EXP7/demo6/5/7
    // 6. Mapping for /demo6/{a}/{b} -> Returns the sum of two path variables
    @GetMapping("/demo6/{a}/{b}")
    public String demo6(@PathVariable("a") int a, @PathVariable("b") int b) {
        return "Sum of " + a + " and " + b + " is: " + (a + b);
    }
    //http://localhost:8080/EXP7/demo7?id=10
    // 7. Mapping for /demo7 -> Accepts a request parameter and returns its value
    @GetMapping("/demo7")
    public String demo7(@RequestParam("id") int id) {
        return "Request Parameter ID: " + id;
    }
     //http://localhost:8080/EXP7/demo8/jash
    // 8. Mapping for /demo8/{name} -> Accepts a path variable and returns it
    @GetMapping("/demo8/{name}")
    public String demo8(@PathVariable("name") String name) {
        return "Received Name: " + name;
    }
    @GetMapping("/addcustomer")
    public String addCustomerForm(Model model) {
        model.addAttribute("customer", new Customer()); // Bind a new Customer object to the form
        return "addcustomer"; // Returns the addcustomer.jsp file
    }

    // Method to handle form submission and add customer
    @PostMapping("/addcustomer")
    public String addCustomer(@ModelAttribute Customer customer, Model model) {
        customerList.add(customer); // Add the customer to the list
        model.addAttribute("message", "Customer Added Successfully");
        model.addAttribute("customerList", customerList); // Add customerList to model to display all customers
        return "addcustomer"; // Return the same form view after submission
    }

    // 10. Mapping for /viewcustomer -> Returns the list of all customers
    @GetMapping("/viewcustomer")
    public List<Customer> viewCustomers() {
        return customerList;
    }
}
