package home;

import java.util.HashMap;
import java.util.Map;

import home.controller.Controller;
import home.controller.CustomerListController;
import home.controller.CustomerRegController;
import home.controller.ProductListController;
import home.controller.ProductRegController;

public class RequestControllerMapping {
	
	private static final Map<RequestMap, Controller> mapping = new HashMap<>();
	
	public static void init() {
		mapping.put(new RequestMap("/product/list","GET"), new ProductListController());
		mapping.put(new RequestMap("/product/add", "GET"), new ProductRegController());
		mapping.put(new RequestMap("/product/add","POST"), new ProductRegController());
		mapping.put(new RequestMap("/customer/list","GET"), new CustomerListController());
		mapping.put(new RequestMap("/customer/join","GET"), new CustomerRegController());
		mapping.put(new RequestMap("/customer/join","POST"), new CustomerRegController());
	}
	
	public static Controller getController(RequestMap key) {
		return mapping.get(key);	
	}
}
