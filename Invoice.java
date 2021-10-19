
import com.mycompany.b2bwebservices.model.Address;
import com.mycompany.b2bwebservices.model.InvoiceItem;
import java.util.ArrayList;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author colli
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class Invoice extends Po {
        
        private int id;
        private Date submitted; 
        private int customerId;
        private Address Shipto;
        private Address Billto;
        private ArrayList<InvoiceItem> order;

        private double tax = 0.00;
        private double ShippingAndHandling = 0.00;
        private double totalCost = 0.00;

    public Invoice(int id, Date submitted,int customerId, Address shipTo, Address billTo, ArrayList<InvoiceItem> order,
                        double tax, double ShippingAndHandling, double totalCost) {
    }

        this.id = id;
        this.submitted = submitted;
        this.customerId = customerId;
        this.billTo = billTo;
        this.shipTo = shipTo;
        
        this.tax = tax;
        this.shippingandhandling = ShippingAndHandling;
        this.totalCost = totalCost;
        
        
        
}

