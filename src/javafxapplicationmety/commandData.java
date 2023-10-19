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
public class commandData {
    private Integer id;
    private final String number;
    private final String idclient;
    private final String idcar;
    private Integer quantity;
    private Date date;
    
    
    public commandData(Integer id, String number, String idclient, String idcar, Integer quantity, Date date){
        this.id = id;
        this.number = number;
        this.idclient = idclient;
        this.idcar = idcar;
        this.quantity = quantity;
        this.date = date;
    }
    
    public Integer getId()
    {
        return id;
    }
    public String getNumber(){
        return number;
    }
    public String getClientId()
    {
        return idclient;
    }
    
    public String getCarId(){
    return idcar;
}
    public Integer getQuantity()
    {
        return quantity;
    }
    public  Date getDate()
    {
        return date;
    }  
}
