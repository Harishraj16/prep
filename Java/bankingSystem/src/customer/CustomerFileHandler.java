package customer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CustomerFileHandler {
	private static final String filename = "bank_db.txt";
	
	Customer[] customers = new Customers[10];
	
	public void initialize() throws IOException {
		File file = new File(filename);
		BufferedReader reader = new BufferedReader(
				new FileReader(file)
		);
		String customerInfo = reader.readLine();
		int position = 0;
		do {
			customers[]
			customerInfo = reader.readLine();
		}while(customerInfo!=null);
		private Customer castStringToCustomer(String customerInfo) {
			String[] trimedInfo = customerInfo.split("   ");
			Customer customer = new Customer(
					Integer.parseInt(trimedInfo[0]),
					
			);
		}
	}
}
