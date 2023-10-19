/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplicationmety;

import java.util.Date;

/**
 *
 * @author randr
 */
public class Car2Date {
    String car, client, numbercommand;
    Integer quantity;
    Date date;
    Integer totalCar;
    public Car2Date(String car, String client, String numbercommand, Integer quantity, Date date, Integer totalCar)
    {
        this.car = car;
        this.client = client;
        this.numbercommand = numbercommand;
        this.quantity = quantity;
        this.date = date;
        this.totalCar = totalCar;
    }
    public String getCar()
    {
        return car;
    }
    public String getClient()
    {
        return client;
    }
    public String getNumber()
    {
        return numbercommand;
    }
    public Integer getQuantity()
    {
        return quantity;
    }
    public Date getDate()
    {
        return date;
    }
    public Integer getTotalCar()
    {
        return totalCar;
    }
}
