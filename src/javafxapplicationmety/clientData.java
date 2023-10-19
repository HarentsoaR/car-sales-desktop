/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplicationmety;

/**
 *
 * @author randr
 */
public class clientData {
    private Integer id;
    private String number;
    private String name;
    
    public clientData(Integer id, String number, String name){
        this.id = id;
        this.number = number;
        this.name = name;
    }
    
    public Integer getId()
    {
        return id;
    }
    public String getNumber(){
        return number;
    }
    public String getName()
    {
        return name;
    }
}
