package Adapter;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class FakeServiceAdapter implements CustomerCheckService {

		@Override
		public boolean CheckIfRealPerson(Customer customer) {
			
			return true;
		}
	}