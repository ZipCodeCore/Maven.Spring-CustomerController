package io.zipcoder;

/**
 * Created by thook on 10/15/15.
 */
public class Customer {
    private String name;
    private Integer age;
    private Address address;

    public Customer(){
        this.name = "Tariq";
        this.age = 37;
    }

    public Customer(String name, Integer age){
        this.name = name;
        this.age = age;
        this.address = new Address();
    }

    public String getName(){
        return this.name;
    }

    public Integer getAge(){
        return this.age;
    }

    public Address getAddress(){ return this.address;}


}
