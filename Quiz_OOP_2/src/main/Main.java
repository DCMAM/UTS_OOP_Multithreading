package main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Main extends Thread{
	Scanner input = new Scanner(System.in);
	
	public ArrayList<Chef> chefList = new ArrayList<Chef>();
	public ArrayList<Menu> menuQueue = new ArrayList<Menu>();
	public ArrayList<Customer> custQueue = new ArrayList<Customer>();
	public ArrayList<Customer> custQueueHistory = new ArrayList<Customer>();
	
	public Integer totalMoney = 10000;
	public Integer totalPro = 1, totalNonPro = 0, totalCust = 0;
	public Integer order = 0;
	
	Chef chef1 = new Chef(UUID.randomUUID(), "Park Sae Royi", "Park123", "Male", (int)(Math.random()*23)+17, true);
	
	Menu menu1 = new Menu(UUID.randomUUID(), "Kimchi Jjigae", (int)(Math.random()*500)+500);
	Menu menu2 = new Menu(UUID.randomUUID(), "Jjinmandu", (int)(Math.random()*500)+500);
	Menu menu3 = new Menu(UUID.randomUUID(), "Daeji Bulgogi", (int)(Math.random()*500)+500);
	Menu menu4 = new Menu(UUID.randomUUID(), "Gogigui", (int)(Math.random()*500)+500);
	Menu menu5 = new Menu(UUID.randomUUID(), "Haejangguk", (int)(Math.random()*500)+500);
	Menu menu6 = new Menu(UUID.randomUUID(), "Sundubu JJigae", (int)(Math.random()*500)+500);
	Menu menu7 = new Menu(UUID.randomUUID(), "Saengseon Jjigae", (int)(Math.random()*500)+500);
	Menu menu8 = new Menu(UUID.randomUUID(), "Nakji Bokkeum", (int)(Math.random()*500)+500);
	Menu menu9 = new Menu(UUID.randomUUID(), "Seolleongtang", (int)(Math.random()*500)+500);
	Menu menu10 = new Menu(UUID.randomUUID(), "Dolsot Bibimbab", (int)(Math.random()*500)+500);

	Thread customerActivity1 = new Thread(new Runnable() {	
		@Override
		public void run() {
			String custName = getNameMain((int)(Math.random()*100)+1), custGender = getGenderMain((int)(Math.random()*2)+1);
			UUID custId = UUID.randomUUID();
			Integer custAge = (int)(Math.random()*23)+17;
			Customer newCust = new Customer(custName, custGender, custId, custAge);
			custQueue.add(newCust);
			int lastIndex = custQueue.size()-1;
			
//			System.out.println("test customer thread " + menuQueue.size());

			do {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				int random = (int)(Math.random()*menuQueue.size()-1) + 1;
				totalMoney = totalMoney + menuQueue.get(random-1).getPrice();
				menuQueue.remove(random-1);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				random = (int)(Math.random()*10)+1; // output 1-10
				if(random == 1) {
					custQueue.remove(lastIndex);
					Customer newCust3 = new Customer(custName, custGender, custId, custAge, UUID.randomUUID(), menuQueue.get(random).getPrice());
					custQueueHistory.add(newCust3);
					Customer newCust2 = new Customer(getNameMain((int)(Math.random()*100)+1), getGenderMain((int)(Math.random()*2)+1), UUID.randomUUID(), (int)(Math.random()*23)+17);
					custQueue.add(newCust2);
				}
			}while(true);
		}
	});
	
	Thread customerActivity2 = new Thread(new Runnable() {	
		@Override
		public void run() {
			String custName = getNameMain((int)(Math.random()*100)+1), custGender = getGenderMain((int)(Math.random()*2)+1);
			UUID custId = UUID.randomUUID();
			Integer custAge = (int)(Math.random()*23)+17;
			Customer newCust = new Customer(custName, custGender, custId, custAge);
			custQueue.add(newCust);
			int lastIndex = custQueue.size()-1;
			
//			System.out.println("test customer thread " + menuQueue.size());

			do {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				int random = (int)(Math.random()*menuQueue.size()-1) + 1;
				totalMoney = totalMoney + menuQueue.get(random-1).getPrice();
				menuQueue.remove(random-1);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				random = (int)(Math.random()*10)+1;
				if(random == 1) {
					custQueue.remove(lastIndex);
					Customer newCust3 = new Customer(custName, custGender, custId, custAge, UUID.randomUUID(), menuQueue.get(random).getPrice());
					custQueueHistory.add(newCust3);
					Customer newCust2 = new Customer(getNameMain((int)(Math.random()*100)+1), getGenderMain((int)(Math.random()*2)+1), UUID.randomUUID(), (int)(Math.random()*23)+17);
					custQueue.add(newCust2);
				}
			}while(true);
		}
	});
	
	Thread customerActivity3 = new Thread(new Runnable() {	
		@Override
		public void run() {
			String custName = getNameMain((int)(Math.random()*100)+1), custGender = getGenderMain((int)(Math.random()*2)+1);
			UUID custId = UUID.randomUUID();
			Integer custAge = (int)(Math.random()*23)+17;
			Customer newCust = new Customer(custName, custGender, custId, custAge);
			custQueue.add(newCust);
			int lastIndex = custQueue.size()-1;
			
//			System.out.println("test customer thread " + menuQueue.size());

			do {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				int random = (int)(Math.random()*menuQueue.size()-1) + 1;
				totalMoney = totalMoney + menuQueue.get(random-1).getPrice();
				menuQueue.remove(random-1);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				random = (int)(Math.random()*10)+1;
				if(random == 1) {
					custQueue.remove(lastIndex);
					Customer newCust3 = new Customer(custName, custGender, custId, custAge, UUID.randomUUID(), menuQueue.get(random).getPrice());
					custQueueHistory.add(newCust3);
					Customer newCust2 = new Customer(getNameMain((int)(Math.random()*100)+1), getGenderMain((int)(Math.random()*2)+1), UUID.randomUUID(), (int)(Math.random()*23)+17);
					custQueue.add(newCust2);
				}
			}while(true);
		}
	});
	
	Thread customerActivity4 = new Thread(new Runnable() {	
		@Override
		public void run() {
			String custName = getNameMain((int)(Math.random()*100)+1), custGender = getGenderMain((int)(Math.random()*2)+1);
			UUID custId = UUID.randomUUID();
			Integer custAge = (int)(Math.random()*23)+17;
			Customer newCust = new Customer(custName, custGender, custId, custAge);
			custQueue.add(newCust);
			int lastIndex = custQueue.size()-1;
			
//			System.out.println("test customer thread " + menuQueue.size());

			do {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				int random = (int)(Math.random()*menuQueue.size()-1) + 1;
				totalMoney = totalMoney + menuQueue.get(random-1).getPrice();
				menuQueue.remove(random-1);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				random = (int)(Math.random()*10)+1;
				if(random == 1) {
					custQueue.remove(lastIndex);
					Customer newCust3 = new Customer(custName, custGender, custId, custAge, UUID.randomUUID(), menuQueue.get(random).getPrice());
					custQueueHistory.add(newCust3);
					Customer newCust2 = new Customer(getNameMain((int)(Math.random()*100)+1), getGenderMain((int)(Math.random()*2)+1), UUID.randomUUID(), (int)(Math.random()*23)+17);
					custQueue.add(newCust2);
				}
			}while(true);
		}
	});
	
	Thread customerActivity5 = new Thread(new Runnable() {	
		@Override
		public void run() {
			String custName = getNameMain((int)(Math.random()*100)+1), custGender = getGenderMain((int)(Math.random()*2)+1);
			UUID custId = UUID.randomUUID();
			Integer custAge = (int)(Math.random()*23)+17;
			Customer newCust = new Customer(custName, custGender, custId, custAge);
			
			custQueue.add(newCust);
			int lastIndex = custQueue.size()-1;
			
//			System.out.println("test customer thread " + menuQueue.size());

			do {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				int random = (int)(Math.random()*menuQueue.size()-1) + 1;
				totalMoney = totalMoney + menuQueue.get(random-1).getPrice();
				menuQueue.remove(random-1);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				random = (int)(Math.random()*10)+1;
				if(random == 1) {
					custQueue.remove(lastIndex);
					Customer newCust3 = new Customer(custName, custGender, custId, custAge, UUID.randomUUID(), menuQueue.get(random).getPrice());
					custQueueHistory.add(newCust3);
					Customer newCust2 = new Customer(getNameMain((int)(Math.random()*100)+1), getGenderMain((int)(Math.random()*2)+1), UUID.randomUUID(), (int)(Math.random()*23)+17);
					custQueue.add(newCust2);
				}
			}while(true);
		}
	});
	
	Thread pro = new Thread(new Runnable() {	
		@Override
		public void run() {
			
			do {
//				System.out.println("test pro thread");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				for(int i=0; i<totalPro; i++) {
					menuQueue.add(getMenu((int)(Math.random()*10)+1));					
				}
			}while(true);
		}
	});
	
	Thread notPro = new Thread(new Runnable() {	
		@Override
		public void run() {

			do {
//				System.out.println("test non-pro thread");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				for (int i = 0; i < totalNonPro; i++) {
					menuQueue.add(getMenu((int)(Math.random()*10)+1));					
				}
			}while(true);
		}
	});
	
	
	public Main() {
		
		chefList.add(chef1);
		pro.start();
		notPro.start();
		customerActivity1.start();
		
		String menu;
//		Integer counter = 0;
		do {	
//			counter++;
			
			
			cls();
			
			Integer totalPro2 = 0, totalNonPro2 = 0, totalCust2 = 0;
			for (int i = 0; i < chefList.size(); i++) {
				if(chefList.get(i).isProfessionality()) {
					totalPro2++;
				}else {
					totalNonPro2++;
				}
			}
			for (int i = 0; i < custQueue.size(); i++) {
				totalCust2++;
			}
			totalPro = totalPro2;
			totalNonPro = totalNonPro2;
			totalCust = totalCust2;
			
			viewMenu();
			menu = input.next(); input.nextLine();
			if(menu.equals("1")) {
				String name, username, gender;
				Integer age, professionality_integer = (int)(Math.random()*2+1);
				boolean professionality = false;
				
				if(professionality_integer == 1) {
					professionality = true;
				}
				else if(professionality_integer == 2) {
					professionality = false;
				}
				
				do {
					System.out.print("Chef'name [must contain 3 words] >> ");
					name = input.nextLine();
				}while(name.split(" ", 4).length != 3);
				
				boolean flag = false;
				do {
					flag = false; //reset flag
					System.out.print("Chef's username [must be unique] >> ");
					username = input.next();input.nextLine();
					for(int i=0 ; i < chefList.size(); i++) { // linear search
						if(chefList.get(i).getUsername().equals(username)) {
							flag = true;
						}
					}
				}while(flag == true);
				
				do {
					System.out.print("Chef's gender [Female | Male] (Case Sensitive) >> ");
					gender = input.next();input.nextLine();
				}while( !(gender.equals("Female") || gender.equals("Male")) );
				do {
					System.out.print("Chef's age [17-40]: ");
					age = input.nextInt();input.nextLine();
				}while(age < 17 || age > 40);
				
				Chef newChef = new Chef(UUID.randomUUID(), name, username, gender, age, professionality);
				chefList.add(newChef);
				
				System.out.println("\nChef has been succesfully added!");
				
				if(chefList.size() == 2) customerActivity2.start();
				else if(chefList.size() == 3) customerActivity3.start();
				else if(chefList.size() == 4) customerActivity4.start();
				else if(chefList.size() == 5) customerActivity5.start();
				
				totalMoney = totalMoney - 3000;
			}
			else if(menu.equals("2")) {
				String menu2;
				do {					
					cls();
					viewMenu2();
					menu2 = input.next();input.nextLine();
					if(menu2.equals("1")) {
						System.out.println();
						for(int i=0; i<chefList.size(); i++) {
							System.out.println(chefList.get(i).getId());
							System.out.println("===================================");
							System.out.println("Name     : " + chefList.get(i).getName());
							System.out.println("Username : " + chefList.get(i).getUsername());
							System.out.println("Age      : " + chefList.get(i).getAge());
							System.out.println("Gender   : " + chefList.get(i).getGender());
							System.out.println();
						}
					}
					else if(menu2.equals("2")) {
						if(custQueueHistory.isEmpty()) {
							System.out.println("There are no customers with order yet!");
						}
						else {
							for (int i = 0; i < custQueueHistory.size(); i++) {
								System.out.println("Name   : " + custQueueHistory.get(i).getName());
								System.out.println("Age    : " + custQueueHistory.get(i).getAge());
								System.out.println("Gender : " + custQueueHistory.get(i).getGender());
								System.out.println();
								System.out.println("Menu details");
								System.out.println("===================================");
								System.out.println(custQueueHistory.get(i).getFood());
								System.out.println();
								System.out.println("Total price: " + custQueueHistory.get(i).getFoodPrice());
								System.out.println("-----------------------------------");
								System.out.println();
							}
						}
					}
					else if(menu2.equals("3")) {
						break;
					}
					else {
						System.out.println("You should input 1-3[Integer]!");
					}
					System.out.println("Click enter to continue.."); input.nextLine();
				}while(true);
			}
			else if(menu.equals("3")) {
				System.out.println("Customer in DanBam now");
				System.out.println("======================");
				for(int i=0; i<custQueue.size(); i++) {
					System.out.println("- " + custQueue.get(i).getName());
				}
			}
			else if(menu.equals("4")) {
				System.out.println("Thank You!");
				break;
			}
			else {
				System.out.println("You should input 1-4[Integer]!");
			}
			System.out.println("Click enter to continue.."); input.nextLine();
		}while(true);
	}

	private void cls() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
	}
	
	private void viewMenu() {
		System.out.println("Danbam");
		System.out.println("Total Money: " + totalMoney);
		System.out.println("1. Add danbam's chef");
		System.out.println("2. View danbam's information");
		System.out.println("3. View customers in danbam");
		System.out.println("4. Quit");
		System.out.print(">> ");
	}
	
	private void viewMenu2() {
		System.out.println("1. View all chefs");
		System.out.println("2. View customer with history order");
		System.out.println("3. Quit");
		System.out.print(">> ");
	}

	public Menu getMenu(int number) {
		if(number == 1) return menu1;
		else if(number == 2) return menu2;
		else if(number == 3) return menu3;
		else if(number == 4) return menu4;
		else if(number == 5) return menu5;
		else if(number == 6) return menu6;
		else if(number == 7) return menu7;
		else if(number == 8) return menu8;
		else if(number == 9) return menu9;
		else return menu10;
	}
	
	public String getNameMain(int random) {
		return "Customer " + random; // "Customer 75"
	}
	
	public String getGenderMain(int random) {
		if(random == 1) return "Male";
		else return "Female";
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
