package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	private CustomerCheckService _customerCheckService;
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		_customerCheckService=customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		if (_customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Save to DB: " + customer.getFirstName());
		}
		else{
			System.out.println("Not a valid person");
		}
		
	}

	
	
}
