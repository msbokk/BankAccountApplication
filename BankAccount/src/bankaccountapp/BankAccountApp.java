package bankaccountapp;


import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) throws IOException {
	
		List<Account> accObjList= new LinkedList<Account>();
		
		List<String[]> newAccounts= new LinkedList<String[]>();
		
		String path="C:\\Users\\Pc\\Downloads\\NewBankAccounts.csv";
		
		newAccounts=utilities.CSV.read(path);
		
		for(String[] accountHolders: newAccounts) {
			String name=accountHolders[0];
			String adhaar=accountHolders[1];
			String accountType=accountHolders[2];
			double initialDeposit=Double.parseDouble(accountHolders[3]);
			Account obj;
			if(accountType.equalsIgnoreCase("current")) {
				obj=new Current(name,adhaar,initialDeposit);
				accObjList.add(obj);
			}
			else if(accountType.equalsIgnoreCase("savings")) {
				obj=new Savings(name,adhaar,initialDeposit);
				accObjList.add(obj);
			}
			else {
				System.out.println("Error in reading AccountType.");
			}
		}
		
		for(Account acc:accObjList) {
			acc.showInfo();
			System.out.println("*********************");
		}
		
		
		BufferedWriter fp= new BufferedWriter(new FileWriter("C:\\Users\\Pc\\Downloads\\OutputNewBankAccounts.txt"));
		for(Account acc:accObjList) {
			fp.write(acc.returnInfo());
			fp.newLine();
			fp.write("-------------------------------------------");
			fp.newLine();
			}
		
		
		
		
		fp.close();

	}
	
}
