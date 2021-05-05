//package org.testmvn;
//
//import java.io.IOException;
//
//import org.base.BaseClass;
//
//public class Hotel extends BaseClass {
//	
//	public static void main(String[] args) throws IOException, InterruptedException {
//		getDriver();
//		launchUrl("https://adactinhotelapp.com/");
//		 Elements1 login = new Elements1();
//         enterText(login.getUsername(), getDataFromExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 1, 0));
//         enterText(login.getPassword(), getDataFromExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 1, 1));
//         btnClick(login.getClick());
//	
//		Elements2 search = new Elements2();
//		selectByIndex(search.getLocation(), 3);
//		selectByIndex(search.getHotel(), 2);
//		selectByIndex(search.getRoomtype(), 2);
//		selectByIndex(search.getRoomno(), 2);
//		enterText(search.getDatein(), getDataFromExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 1, 2));
//        enterText(search.getDateout(), getDataFromExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 1, 3));
//        selectByIndex(search.getAdultroom(), 2);
//        selectByIndex(search.getChildroom(), 3);
//        btnClick(search.getSubmit());
//        btnClick(search.getradioBtn());
//        btnClick(search.getContin());
//        
//		Elements3 order = new Elements3();
//  	  enterText(order.getFirstname(), getDataFromExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 1, 4));
//        enterText(order.getLastName(), getDataFromExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 1, 5));
//        enterText(order.getAddress(), getDataFromExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 1, 6));
//        enterText(order.getCcnum(),getDataFromExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 1, 7));
//        selectByIndex(order.getCctype(), 2);
//        selectByIndex(order.getExpmonth(), 6);
//        selectByIndex(order.getExpyear(), 3);
//        enterText(order.getCvv(), getDataFromExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subburaj.xlsx", "Sheet1", 1, 8));
//        btnClick(order.getBooknow());
//        Thread.sleep(10000);
//		Elements4 printtext = new Elements4();
//        //getText(printtext.getOrderno());
//        String tata = "order num";
//        putDataToExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subbu.xlsx", "Sheet2", 3, 0, tata);
//        putDataToExcel("C:\\Users\\GOD\\eclipse-workspace\\Maven\\Excel\\subbu.xlsx", "Sheet2", 3, 1, getText(printtext.getOrderno()));
//
//		
//	}
//	
//         
//}
