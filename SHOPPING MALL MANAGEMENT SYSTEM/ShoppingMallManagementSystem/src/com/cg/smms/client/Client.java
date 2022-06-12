package com.cg.smms.client;

import com.cg.smms.entities.*;
import com.cg.smms.exception.*;
import com.cg.smms.repository.*;
import com.cg.smms.service.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {
	
	
	public static void main(String[] args) throws Exception {
		
//		Customer CRUD operation
//		
//	CustomerRepositoryImpl cri = new CustomerRepositoryImpl();
//		CustomerServiceImpl csi = new CustomerServiceImpl();
//		Customer c = new Customer();
//		c.setId(1);
//		c.setName("Vipul");
//		c.setPhone("9876331045");
//		c.setEmail("Vipulsmohod7@gmail.com");
//		cri.beginTransaction();
//	//	c = cri.searchCustomer(4);
//		System.out.println(c.getId() + c.getName());
//	//	cri.deleteCustomer(1);
//	cri.commitTransaction();
//		
	//Employee CRUD operation
		
EmployeeServiceImpl esi = new EmployeeServiceImpl();
	Employee e = new Employee();
		e.setName("Prathamesh");
		LocalDate date = LocalDate.now();
		e.setDate(date);
	e.setSalary(5000);
		e.setAddress("pune");
		e.setDesignation("Manager");
		esi.addEmployee(e);
		//esi.deleteEmployee(1);
		
//		Item CRUD operation
		
	OrderServiceImpl osi = new OrderServiceImpl();
		ItemRepositoryImpl iri = new ItemRepositoryImpl();
		Item i = new Item();
		i.setId(1);
		i.setName("pen");
		LocalDate datem = LocalDate.of(2021, 10, 12);
		LocalDate datee = LocalDate.of(2021, 1, 20);
		i.setManufacturing(datem);
		i.setExpiry(datee);
		i.setCategory("education");
		i.setPrice(50);
		iri.beginTransaction();
		iri.deleteItem(2);
		iri.commitTransaction();
		
//		Mall CRUD operations //Anurag Umare
		
		MallRepositoryImpl mri = new MallRepositoryImpl();
		Mall m =new Mall();
	
		m.setMallName("shine");
		m.setLocation("Amravati");
		m.setCategories("All");
		mri.beginTransaction();
		mri.addMall(m);
		mri.commitTransaction();
		
	//llAdmin CRUD operation
		
		MallAdminRepositoryImpl mar = new MallAdminRepositoryImpl();
	MallAdmin ma = new MallAdmin();
		ma.setId(1);
		ma.setName("Pratik Thakare");
		ma.setPassword("pass@123");
		ma.setPhone("915846978");
	mar.beginTransaction();
		mar.updateMallAdmin(ma);
	mar.commitTransaction();
		
//		OrderDetails CRUD operation
		
		OrderRepositoryImpl ori = new OrderRepositoryImpl();
		OrderDetails od = new OrderDetails();
	//ocalDate date = LocalDate.now();
		od.setDateOfPurchase(date);
		od.setTotal(500);
		od.setPaymentMode("Online");
		ori.beginTransaction();
		ori.addOrderDetails(od);
		ori.commitTransaction();
		
	//hop CRUD operations
		
//		ShopRepositoryImpl sri = new ShopRepositoryImpl();
//		Shop s = new Shop(); 
//		s.setShopName("jeans");
//		s.setShopCategory("cloth");
//		s.setCustomers("Wrong");
//		s.setShopStatus("open");
//		s.setLeaseStatus("pending");
//		sri.beginTransaction();
//		sri.addShop(s);
//		sri.commitTransaction();
		
//		ShopOwner CRUD operation
		
//		ShopOwnerRepositoryImpl sori = new ShopOwnerRepositoryImpl();
//		ShopOwner so = new ShopOwner();
//		so.setName("Mohini");
//		LocalDate date = LocalDate.of(2001, 01, 25);
//		so.setDob(date);
//		so.setAddress("pune");
//		sori.beginTransaction();
//		sori.addShopOwner(so);
//		sori.commitTransaction();
		
//		User CRUD operation
		
		UserRepositoryImpl uri = new UserRepositoryImpl();
		User u = new User();
		u.setName("Prathamesh");
		u.setPassword("1234");
		u.setType("prime");
	uri.beginTransaction();
		User r = uri.searchUser(u);
		System.out.println(r.getName());
		uri.commitTransaction();
		
		
//   	**********  CRUD Operations Done  **********
		

//   	**********  Association Starts Here  **********
		
//		AdminServiceImpl asi = new AdminServiceImpl();
//		CustomerServiceImpl csi = new CustomerServiceImpl();
//		EmployeeServiceImpl esi = new EmployeeServiceImpl();
//		OrderServiceImpl osi = new OrderServiceImpl();
//		ShopServiceImpl ssi = new ShopServiceImpl();
//		UserServiceImpl usi = new UserServiceImpl();
		

//		MallRepositoryImpl mallrepo = new MallRepositoryImpl();
//		
//		mallrepo.beginTransaction();
//		
//		User user = new User();
//		MallAdmin ma = new MallAdmin();
//		Mall mall = new Mall();
//		
////        Adding user details
//		user.setName("Vipul");
//		user.setPassword("Pass@123");
//		user.setType("Mall Admin");
//	
////    Adding MallAdmin details
//		ma.setName(user.getName());
//		ma.setPassword(user.getPassword());
//		ma.setPhone("9856565675");
//		ma.setUser(user);
//		
////    Adding Mall details
//		mall.setMallName("pizza");
//		mall.setCategories("Food");
//		mall.setLocation("nagpur");
//		mall.setMallAdmin(ma);
//		
//		mallrepo.addMall(mall);                                   //  Adding Mall with MallAdmin details
//		System.out.println("New Mall is Added !!");		
//		mallrepo.commitTransaction();
		
//		-------------------------------------------  Let's Create Shops now for Mall  ------------------------------------------------>
		
////		Along with Shop we are Storing shop owner too
		
//		User user = new User();
//		ShopOwner so = new ShopOwner();
//		Shop shop = new Shop();
//		ShopServiceImpl ssi = new ShopServiceImpl();
//		ShopOwnerRepositoryImpl soi = new ShopOwnerRepositoryImpl();
//		MallRepositoryImpl mri = new MallRepositoryImpl();
//		LocalDate date = LocalDate.of(2060, 16, 8);
////		
////		soi.beginTransaction();
////		
////		Adding user details
//		user.setName("Netrangi Joshi");
//		user.setPassword("Netra@123");
//		user.setType("Shop Owner");
//		
////		Adding mall details
//		Mall mall = mri.searchMall(2);                          //  getting the mall information with (id)
//		shop.setShopName("dominoce");
//		shop.setShopCategory("Food");
//		shop.setShopStatus("Open");
//		shop.setLeaseStatus("Paiding");
//		shop.setMall(mall);
//		
////		Adding Shop Owner details
//		so.setName("Shagufta ");
//		so.setDob(date);
//		so.setAddress("Mumbai");
//		so.setUser(user);
//		so.setShop(shop);
	
//		soi.addShopOwner(so);                                   //  Adding Shop with Shop Owner details
//		System.out.println("New shop is Added !!");		
//		soi.commitTransaction();
		
//		***  Search Shop ***
		
//		ssi.searchShopById(5);                                   //  Shop Not Found Exception Handled....
//		System.out.println("done !!");
				
		
//		----------------------------------------------  Add Shop Employee  ----------------------------------------------------------->
		
//		ShopServiceImpl ssi = new ShopServiceImpl();
//		LocalDate date = LocalDate.now();
//		
////		employee details (1)
//		Employee emp = new Employee();
//		emp.setName("Anurag");
//		emp.setDate(date);
//		emp.setAddress("chandur railway");
//		emp.setDesignation("Manager");
//		emp.setSalary(1000);
//		
////		employee details (2)
//		Employee emp1 = new Employee();
//		emp1.setName("Vinay");
//		emp1.setDate(date);
//		emp1.setAddress("Thane");
//		emp1.setDesignation("Salesman");
//		emp1.setSalary(400);
//		
//		Shop shop = ssi.searchShopById(1);                   //  Getting shop for adding employees
//		shop.addEmployee(emp);
//		shop.addEmployee(emp1);
//		
//		ssi.updateShop(shop);								 //  Updating shop (added employees)
//		System.out.println("Employees added Successfully");
		
//		----------------------------------------------  Add Shop Items  ----------------------------------------------------------->
		
//		ShopServiceImpl ssi = new ShopServiceImpl();
//		ItemRepositoryImpl iri = new ItemRepositoryImpl();
		
//		Item details (1)
//		Item item = new Item();
//		item.setCategory("New");
//		item.setManufacturing(LocalDate.of(2022, 01, 01));
//		item.setExpiry(LocalDate.of(2032, 01, 01));
//		item.setName("LG Master");
//		item.setPrice(20000);
		
//		Item details (2)
//		Item item1 = new Item();
//		item1.setCategory("New");
//		item1.setManufacturing(LocalDate.of(2022, 01, 01));
//		item1.setExpiry(LocalDate.of(2032, 01, 01));
//		item1.setName("LG double door");
//		item1.setPrice(30000);
		
//		Shop shop = ssi.searchShopById(2);                            //  Getting shop for adding items
//		shop.addItems(item);
//		shop.addItems(item1);
		
//		ssi.addShop(shop);
		
//		Item item = iri.searchItem(4);	                              //  Update individual item
//		item.setCategory("New");
//		item.setShop(shop);
//		iri.beginTransaction();
//		iri.updateItem(item);
//		iri.commitTransaction();
		
//		ssi.updateShop(shop);                                          //  Updating shop (added items)
//		System.out.println("Items added Successfully");
		
		
//		-----------------------------------------------  Add Customer Details  --------------------------------------------------------->
	
//		CustomerRepositoryImpl cri = new CustomerRepositoryImpl();
//		ShopServiceImpl ssi = new ShopServiceImpl();
//		Shop shop = ssi.searchShopById(1);                            //  Getting Shop details whose customer is creating
//		
////		Adding user details
//		User user = new User();
//		user.setName("abhishek");
//		user.setPassword("abhisheka20");
//		user.setType("User");
//		
////		Adding customer details
//		Customer cust = new Customer();
//		cust.setName("abhishek");
//		cust.setEmail("abhishek@gmail.com");
//		cust.setPhone("8869547123");
//		cust.setUser(user);
//		cust.setShop(shop);
//		
//		cri.beginTransaction();
//		cri.addCustomer(cust);                                        //  Creating customer
//		cri.commitTransaction();
//		System.out.println("Customer added Successfully");	
		

//		------------------------------------------  User Login/LogOut Section  ----------------------------------------------------->
		
////		****  LogIn  ****
		
//		UserServiceImpl usi = new UserServiceImpl();
//		
//		User user = new User();
//		user.setId(6);
//		user.setPassword("abhishek20");
//		usi.login(user);
//		System.out.println("done");
	
////		****  LogOut  ****
//		csi.logout();
		
//		----------------------------------------------  Customer Services   ----------------------------------------------------->
		
//		CustomerServiceImpl csi = new CustomerServiceImpl();
//		CustomerRepositoryImpl cri = new CustomerRepositoryImpl();	
//		ItemRepositoryImpl iri = new ItemRepositoryImpl();
//		LocalDate date = LocalDate.now();
//		OrderServiceImpl osi = new OrderServiceImpl();
		
//		iri.searchItemslist("o");                               //  ***  Search list products using name ... ***(JPQL Query)

////		Customer Login
		
//		User user = new User();
//		user.setId(6);
//		user.setPassword("abhishek20");
//		user=csi.login(user);
//		Customer customer = user.getCustomer();
//		
//		if(customer==null)
//		{
//			System.out.println("Try Again !!!");
//		}else 
//		{
//			Item item = iri.searchItem(10);	                     //  Invalid Item Exception occurs.....
//			System.out.println("done !!");
			
//			item.getName();
//			float t =item.getPrice();
//			Shop shop = item.getShop();
//			
//			OrderDetails od = new OrderDetails();
//			od.setDateOfPurchase(date);
//			od.setTotal(t);
//			od.setPaymentMode("Cash on Delivery");
//			od.setShop(shop);
//			od.setCustomer(customer);
//			osi.addOrder(od);                                       // adding Order
//			System.out.println("\nOrder Placed.....");
//		}
		
//		Cancel Order ----------------------------------------
		
//      osi.cancelOrder(5);                                         //  Order Cancel Exception Handled.......
		
//		Update Order ----------------------------------------
		
//		OrderDetails od = osi.searchOrder(2);
//		od.setPaymentMode("UPI Transaction");
//		osi.updateOrder(od);
		

//		---------------------------------------------- ** Personal Module : Employee ** ----------------------------------------------------->
	
//	    -------------  Add Employee----------------------------------------------------------------------------------------------->
		
//		EmployeeServiceImpl esi = new EmployeeServiceImpl();
//		ShopServiceImpl ssi = new ShopServiceImpl();
//		LocalDate date = LocalDate.now();
//		
//		Shop shop = ssi.searchShopById(2);
//		
//		Employee emp = new Employee();
//		emp.setAddress("Akshay");
//		emp.setDate(date);
//		emp.setName("Ramesh");
//		emp.setDesignation("SalesMan");
//		emp.setSalary(4000);
//		emp.setShop(shop);
//		
//		Employee emp1 = new Employee();
//		emp1.setAddress("mumbai");
//		emp1.setDate(date);
//		emp1.setName("rajesh");
//		emp1.setDesignation("Manager");
//		emp1.setSalary(6040);
//		emp1.setShop(shop);
//		
//		esi.addEmployee(emp);
//		esi.addEmployee(emp1);
//		
//		System.out.println("Employees added");
		
//		-------------  Update Employee------------------------------------------------------------------------------------------>
		
//		EmployeeServiceImpl esi = new EmployeeServiceImpl();
//		ShopServiceImpl ssi = new ShopServiceImpl();
//		LocalDate date = LocalDate.now();
//		
//		Employee emp = esi.searchEmployee(4);
//		
//		emp.setName("Omkar");
//		emp.setSalary(12200);
//		
//		esi.updateEmployee(emp);
//		
//		System.out.println("Employees updated\n");
//		
//		esi.searchEmployee(4);

//		--------------  Search Employee------------------------------------------------------------------------------------------>
		
//		EmployeeServiceImpl esi = new EmployeeServiceImpl();
		
//		esi.searchEmployee(10);                                                 //  Object Not Found Exception handled here.....
//		esi.searchEmployee(1);
		
//		--------------  Delete Employee------------------------------------------------------------------------------------------>
		
//		EmployeeServiceImpl esi = new EmployeeServiceImpl();
//		
//		esi.deleteEmployee(6);
		
	}
	
}
