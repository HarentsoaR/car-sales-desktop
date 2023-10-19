/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplicationmety;

/**
 *
 * @author randr
 */
public class invoiceData {
    String clientnumber;
    String carname;
    String commande;
    Integer pu;
    Integer quantity;
    Integer montant;
    
    public invoiceData(String clientnumber, String carname, String commande, Integer pu,  Integer quantity, Integer montant)
    {
        this.clientnumber = clientnumber;
        this.carname = carname;
        this.commande = commande;
        this.pu = pu;
        this.quantity = quantity;
        this.montant = montant;
    }
    public String getClient()
    {
        return clientnumber;
    }
    public String getCar()
    {
        return carname;
    }
    public String getCommand()
    {
        return commande;
    }
    public Integer getUp()
    {
        return pu;
    }
    public Integer getQuantity()
    {
        return quantity;
    }
    public Integer getAmount()
    {
        return montant;
    }
}
