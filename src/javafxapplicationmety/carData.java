/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplicationmety;

/**
 *
 * @author randr
 */
public class carData {
    private Integer id;
    private String number;
    private String design;
    private Integer pu;
    private Integer stock;
    
    
    public carData(Integer id, String number, String design, Integer pu, Integer stock){
        this.id = id;
        this.number = number;
        this.design = design;
        this.pu = pu;
        this.stock = stock;
    }
    
    public Integer getId()
    {
        return id;
    }
    public String getNumber(){
        return number;
    }
    public String getDesign()
    {
        return design;
    }
    
    public Integer getPu(){
    return pu;
}
    public Integer getStock()
    {
        return stock;
    }
}
