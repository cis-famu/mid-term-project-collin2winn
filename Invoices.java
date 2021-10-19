/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.b2bwebservices.endpoint;

/**
 *
 * @author colli
 */
@WebService
public class Invoices {

private final InvoiceService service = new InvoiceService();

@WebResult(name="Invoice")
public List<Invoice> getAll(){
        return service.findAll();
}

@WebResult(name="Invoice")
public Invoice getbyId(@WebParam(name="id") int id){
return service.getById(id);
}


@WebResult(name="Invoice")
public Invoice getbyCustomer(@WebParam(name="customer") int id){
    return service.getbyCustomerIs(customer);
}
