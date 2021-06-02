package coffeeShopSystem;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		

		BaseCustomerManager	 customerManager =  new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer(1, "SEFA", "OZER",1995, 40495049184);
		
		customerManager.save(customer);
		
	}

}
