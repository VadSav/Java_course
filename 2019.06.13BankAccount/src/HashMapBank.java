
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class HashMapBank {

	public static void main(String[] args) {
		Customer c1 = new Customer ("Petrov","Sidor");
		Customer c2 = new Customer ("Zagorsky","Grigory");
		Customer c3 = new Customer ("Schirvint","Alexandr");
		
		
		BankAccount b1 = new BankAccount("af12dsvfd345",c1);
		BankAccount b2 = new BankAccount("as4jb1725dh",c2);
		BankAccount b3 = new BankAccount("df54zhdg3hv",c2);
		BankAccount b4 = new BankAccount("dgt73z46rfsh",c3);
		BankAccount b5 = new BankAccount("mdgzrui34loj1",c3);
		BankAccount b6 = new BankAccount("3te67ru38jmkv",c3);
        BankAccount[] ba = {b1, b2, b3, b4, b5,b6};
		
		List<BankAccount> bankAccounts = new ArrayList<>(Arrays.asList(ba));
		
		Map<String, List<BankAccount>> map = new HashMap<>();
		for(BankAccount account:bankAccounts) {
			String key = account.getCustomer().getFirstName()+" "+account.getCustomer().getLastName();
			if(map.containsKey(key)) {
				List<BankAccount> baccounts = map.get(key);
				baccounts.add(account);
			} else {
				List<BankAccount> baccounts = new ArrayList<>();
				baccounts.add(account);
				map.put(key, baccounts);
			}
		}
	
		map.forEach((k, v) -> System.out.println(k+" "+v));
	}
}
