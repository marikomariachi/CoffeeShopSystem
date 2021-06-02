package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;

public class StarbucksCustomerManager  extends BaseCustomerManager  {

	ICustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		
		_customerCheckService= customerCheckService;
	}
	
	public void save(Customer customer) {
		
		if (_customerCheckService.CheckIfRealPerson(customer)) {
			
			System.out.println(customer);
		}else
		{
			System.out.println("gecerli bir kisi degil");
		}
		
	}


		
		
	

	
	

}
