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
public class listOfCarData {
    String CarNumber;
    String ClientName;
    String Command;
    Integer quantity;
    Date date;
    
    public listOfCarData(String CarNumber, String ClientName, String Command, Integer quantity,Date date)
    {
        this.CarNumber = CarNumber;
        this.ClientName = ClientName;
        this.Command = Command;
        this.quantity = quantity;
        this.date = date;
    }
    public String getCarNumber()
    {
        return CarNumber;
    }
    public String getClientName()
    {
        return ClientName;
    }
    public String getCommand()
    {
        return Command;
    }
    public Integer getQuantity()
    {
        return quantity;
    }
    public Date getDate()
    {
        return date;
    }
    
}
