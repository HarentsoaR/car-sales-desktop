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
public class SFData {
    String clientnumber;
    String carname;
    String Command;
    Integer quantity;
    Date date;
    
    public SFData(String clientnumber, String carname, Integer quantity, String Command, Date date)
    {
    this.clientnumber = clientnumber;
    this.carname = carname;
    this.quantity = quantity;
    this.Command = Command;
    this.date = date; 
    }
    
    public String getClientnumber()
    {
        return clientnumber;
    }
    public String getCarname()
    {
        return carname;
    }
    public Integer getQuantity()
    {
        return quantity;
    }
    public String getCommand()
    {
        return Command;
    }
    public Date getDate()
    {
        return date;
    }
    
    
}
