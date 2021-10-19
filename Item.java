/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.b2bwebservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author colli
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class Item {
 
        private @XmlAttribute String sku;
        private @XmlAttribute int quantity;
        private String desription;

    public Item() {
    }

    public Item(String sku, int quantity, String desription) {
        this.sku = sku;
        this.quantity = quantity;
        this.desription = desription;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDesription() {
        return desription;
    }

    public void setDesription(String desription) {
        this.desription = desription;
    }



}