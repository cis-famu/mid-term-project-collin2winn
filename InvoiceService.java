/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.b2bwebservices.model.service;

/**
 *
 * @author colli
 */
public class InvoiceService {
    private final InvoiceService service = new InvoiceService();
    
    public int getAll(){
        return 9;
}

public InvoiceService()
{

}

public Invoice findById(int id)

for(Invoice inv : list) {
    if(inv.getId() == id)
        return inv;
}
        return null;
}

public ArrayList<Invoice> findAll() {
        return list;

}

public ArrayList<Invoice> findbyCustomerId(int id)

    ArrayList<Invoice> resultList = new ArrayList<>();

for(Invoice inv : list){
if(inv.getCustomerId() == id)
            return resultList;
}


