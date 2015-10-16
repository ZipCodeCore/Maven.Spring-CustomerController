package io.zipcoder;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {

    @RequestMapping("/")
    public Customer HomePage(){
        return new Customer();
    }

    @RequestMapping("/new")
    public Customer CreateCustomer(@RequestParam(value="name", defaultValue = "JeanClaude")String name,
                                   @RequestParam(value="age", defaultValue = "21") Integer age){
        return new Customer(name,age);
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public Customer CreateCustomerFromPost(@RequestParam(value="name", defaultValue = "JeanClaude")String name,
                                         @RequestParam(value="age", defaultValue = "21") Integer age){
        return new Customer(name,age);
    }

}
