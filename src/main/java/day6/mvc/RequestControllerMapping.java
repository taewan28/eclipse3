package day6.mvc;

import java.util.HashMap;
import java.util.Map;

import day6.mvc.controller.CartController;
import day6.mvc.controller.CommunityListController;
import day6.mvc.controller.CommunityWriteController;
import day6.mvc.controller.Controller;
import day6.mvc.controller.LoginController;
import day6.mvc.controller.MemberJoinController;
import day6.mvc.controller.MemberModifyController;
import day6.mvc.controller.MemberSaveController;
import day6.mvc.controller.MypageController;
import day6.mvc.controller.ProductListController;
import day6.mvc.controller.RequestMap;

public class RequestControllerMapping {
	
	private static final Map<RequestMap,Controller> mapping = new HashMap<>();
	
	public static void init() {
		mapping.put(new RequestMap("/member/join","GET"), new MemberJoinController());
		mapping.put(new RequestMap("/member/modify","GET"), new MemberModifyController());
		mapping.put(new RequestMap("/member/save","POST"), new MemberSaveController());
		mapping.put(new RequestMap("/community/list","GET"), new CommunityListController());
		mapping.put(new RequestMap("/community/write","GET"), new CommunityWriteController());
		mapping.put(new RequestMap("/mypage","GET"), new MypageController());
		mapping.put(new RequestMap("/Login","GET"), new LoginController());
		mapping.put(new RequestMap("/cart","GET"), new CartController());
		mapping.put(new RequestMap("/product/list","GET"), new ProductListController());
	}
	
	public static Controller getController(RequestMap key) {
		return mapping.get(key);		//value 에 해당하는 Controller 객체 리턴
	}
}
