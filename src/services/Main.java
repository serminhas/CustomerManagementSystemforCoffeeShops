package services;
import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Adapter.FakeServiceAdapter;
import Adapter.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {		
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new FakeServiceAdapter());
		customerManager.save(new Customer(1, "Sermin", "Has", 1983, "123456789"));
	}

}
