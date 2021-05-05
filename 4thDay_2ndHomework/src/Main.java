  
import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisCheckManager;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {
	public static void main(String[] args) throws Exception {
		BaseCustomerManager baseCustomerManager=new StarbucksCustomerManager(new MernisCheckManager()); 
		Customer sadik=new Customer();
		sadik.setId(1);
		sadik.setFirstName("Deniz");
		sadik.setLastName("Othan");
		sadik.setDateOfBirth(LocalDate.of(2000,04,19));
		sadik.setNationalityId("11256321450");	
		baseCustomerManager.Save(sadik);
	}
}