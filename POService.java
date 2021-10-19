/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.b2bwebservices.model.service;

import com.mycompany.b2bwebservices.model.Address;
import com.mycompany.b2bwebservices.model.Item;
import com.mycompany.b2bwebservices.model.PO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author colli
 */

/*Display all purchase orders
*/
public class POService {
    private final ArrayList <PO> list = new ArrayList<>();

    public POService() {
        Address add1 = new Address("ABC", "orlando", "Fl", "33333", null);
        Address add2 = new Address("ABC", "Dallas", "Tx", "75555", null);
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("H-333", 3, "sample"));
        
        list.add(new PO(123, 212, new Date(System.currentTimeMillis()), add1, add1,items));
        list.add(new PO(125, 212, new Date(System.currentTimeMillis()), add1, add1,items));
        list.add(new PO(144, 434, new Date(System.currentTimeMillis()), add2, add2,items));

    }
/*
Find a purchase order by the id
*/
    public List<PO> all(){
        return list;
    }
    public PO findById(int id){

    for(int i = 0; i < list.size(); ++i)
{
    if(list.get(i).getId() == id)
        return list.get(i);
}
    

return null;
}

/*
Find a purchase order by the submitted date
*/
public PO findBySubmittedDare(Date submit){
ArrayList<PO> returnList = new ArrayList();
    for(int x = 0; x < list.size(); ++x)
{
 
//Retreives only the Date part and ignores the time
   SimpleDateFormat formatter = new SimpleDateFormat("yyy-MM-dd");
String objDate = formatter.format(list.get(x).getSubmitted());

    if(objDate.compareTo(formatter.format(submitted)) = 0)
        returnList.add(list.get(i));

 return returnList;
}

return null;
}
/*
Display all invoices

*/

public class POService {
    private final ArrayList <PO> list = new ArrayList<>();

    public InvoiceService() {
        Address add1 = new Address("ABC", "orlando", "Fl", "33333", null);
        Address add2 = new Address("ABC", "Dallas", "Tx", "75555", null);
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("H-333", 3, "sample"));
        
        list.add(new Invoice(123, 212, new Date(System.currentTimeMillis()), add1, add1,items));
        list.add(new Invoice(125, 212, new Date(System.currentTimeMillis()), add1, add1,items));
        list.add(new Invoice(144, 434, new Date(System.currentTimeMillis()), add2, add2,items));

    }


/*
Find a invoice by the id
*/

    public List<Invoice> all(){
        return list;
    }
    public Invoice findById(int id){

    for(int y = 0; y < list.size(); ++y)
{
    if(list.get(y).getId() == id)
        return list.get(y);
}
    

return null;
}

/*
Display all invoices by customerId
*/

    
    

