
import com.mycompany.b2bwebservices.model.Address;
import com.mycompany.b2bwebservices.model.Item;
import java.util.Calendar;
import org.glassfish.jersey.model.internal.RankedComparator.Order;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author colli
 */
    /**
     * Class Purchase Order
     */
public class Po {

public void Purchase Order {
            private int id; 
            private Calendar submitted;
            private Address Billto;
            private Address Shipto;
            private Item order[];

    public class InvoiceItem extends Item {
            private double unitPrice;
        public InvoiceItem() {
}

        
        public InvoiceItem(int id, Calendar submitted, Address Billto, Address Shipto, Item order[];) {
                super(sku,quantity,unitPrice);
                this.unitPrice = unitPrice;
            }
        }
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    }

