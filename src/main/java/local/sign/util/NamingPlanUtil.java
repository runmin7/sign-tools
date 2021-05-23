package local.sign.util;

import org.springframework.util.StringUtils;

public class NamingPlanUtil {
	
	//경로구분자
	static String urlSep = "/";
	static String javaSep = ".";
	
	
	public static String upperCaseFirst(String val) {

		if(!StringUtils.hasText(val)) return "";
		char[] arr = val.toCharArray();
		arr[0] = Character.toUpperCase(arr[0]);
		return new String(arr);
	}
	
	public static String sepAddText(String text, String sep) {
		if(!StringUtils.hasText(text)) return "";
		return sep + text;
	}

	public static void main(String[] args) {
		
		//일반 사용자 화면인지 관리자 화면인지를 구분(소문자만)
		String front = "front";
		String admin = "admin";
		
		//분류(소문자만)
		String largeCategory = "purchase";
		String mediumCategory = "";
		
		//메뉴명
		String name1 = "counsling";
		String name2 = "room";
		String name3 = "";
		
		String fileName = name1 + upperCaseFirst(name2) + upperCaseFirst(name3);

		//일반 신청자 경로
		String frontPath = sepAddText(front, urlSep) + sepAddText(largeCategory, urlSep) + sepAddText(mediumCategory, urlSep);
		
		//관리자 경로
		String adminPaht = sepAddText(admin, urlSep) + sepAddText(largeCategory, urlSep) + sepAddText(mediumCategory, urlSep);
		
		//예약어
		String request = "_I01";
		String view = "_V01";
		String list = "_L01";
		String popup = "_P01";
		
		//관리자에 붙는 추가 예약어
		String manager = "Mgr";
		
		//만들어야 할 JSP
		String extension = ".jsp";	//확장자

		String requestPage = frontPath +urlSep+ upperCaseFirst(fileName) + request + extension;	
		String viewPage = frontPath +urlSep+ upperCaseFirst(fileName) + view + extension; 
		String listPage = frontPath +urlSep+ upperCaseFirst(fileName) + list + extension; 
		String popupPage = frontPath +urlSep+ upperCaseFirst(fileName) + popup + extension; 
		
		String requestManagerPage = adminPaht +urlSep+ upperCaseFirst(fileName) + manager + request + extension;	
		String viewManagerPage = adminPaht +urlSep+ upperCaseFirst(fileName) + manager + view + extension; 
		String listManagerPage = adminPaht +urlSep+ upperCaseFirst(fileName) + manager + list + extension; 
		String popupManagerPage = adminPaht +urlSep+ upperCaseFirst(fileName) + manager + popup + extension; 
		
		
		System.out.println("FRONT=====================================================");
		System.out.println("==========================================================");
		System.out.println("==========================================================");
		System.out.println(requestPage);
		System.out.println(viewPage);
		System.out.println(listPage);
		System.out.println(popupPage);

		
		System.out.println("ADMIN=====================================================");
		System.out.println("==========================================================");
		System.out.println("==========================================================");
		System.out.println(requestManagerPage);
		System.out.println(viewManagerPage);
		System.out.println(listManagerPage);
		System.out.println(popupManagerPage);
		
		
		
		//만들어야 할 JAVA
		String javaExtension = ".java";
		String xmlExtension = ".xml";
		String defaultPath = "sign.weboffice";
		String frontPackageath = defaultPath + javaSep + front;
		String adminPackagePath = defaultPath + javaSep + admin; 
		
		
		//일반 신청자 경로
		String frontJavaPath = frontPackageath + sepAddText(largeCategory, javaSep) + sepAddText(mediumCategory, javaSep);
		String adminJavaPath = adminPackagePath + sepAddText(largeCategory, javaSep) + sepAddText(mediumCategory, javaSep);
		
		//자바예약어
		String controller = "Controller";
		String service = "Service";
		String impl = "Impl";
		String dao = "dao";
		String sqlmap = "sqlmap";
		String sql = "sql";
		String req = "req";
		
		//front
		String javaName1 = frontJavaPath +javaSep+ controller.toLowerCase() +javaSep+ upperCaseFirst(front) + upperCaseFirst(fileName) + upperCaseFirst(req)+ upperCaseFirst(controller) + javaExtension;
		String javaName2 = frontJavaPath +javaSep+ service.toLowerCase() +javaSep+upperCaseFirst(front) + upperCaseFirst(fileName) + upperCaseFirst(req)+ upperCaseFirst(service) + javaExtension;
		String javaName3 = frontJavaPath +javaSep+ service.toLowerCase() +javaSep+ impl.toLowerCase() +javaSep+upperCaseFirst(front) + upperCaseFirst(req)+ upperCaseFirst(fileName) + upperCaseFirst(service) + upperCaseFirst(impl) + javaExtension;
		String javaName4 = frontJavaPath +javaSep+ dao.toLowerCase() +javaSep+upperCaseFirst(front) + upperCaseFirst(fileName) + upperCaseFirst(req)+ upperCaseFirst(dao) + javaExtension;
		String javaName5 = frontJavaPath +javaSep+ sqlmap.toLowerCase() +javaSep+upperCaseFirst(front) + upperCaseFirst(fileName) + upperCaseFirst(req)+ upperCaseFirst(sql) + xmlExtension;
		
		
		System.out.println("FRONT=====================================================");
		System.out.println("==========================================================");
		System.out.println("==========================================================");
		System.out.println(javaName1);
		System.out.println(javaName2);
		System.out.println(javaName3);
		System.out.println(javaName4);
		System.out.println(javaName5);
		
		//admin
		String javaName6 = adminJavaPath +javaSep+ controller.toLowerCase() +javaSep+ upperCaseFirst(admin) + upperCaseFirst(fileName) + upperCaseFirst(controller) + javaExtension;
		String javaName7 = adminJavaPath +javaSep+ service.toLowerCase() +javaSep+upperCaseFirst(admin) + upperCaseFirst(fileName) + upperCaseFirst(service) + javaExtension;
		String javaName8 = adminJavaPath +javaSep+ service.toLowerCase() +javaSep+ impl.toLowerCase() +javaSep+upperCaseFirst(admin) + upperCaseFirst(fileName) + upperCaseFirst(service) + upperCaseFirst(impl) + javaExtension;
		String javaName9 = adminJavaPath +javaSep+ dao.toLowerCase() +javaSep+upperCaseFirst(admin) + upperCaseFirst(fileName) + upperCaseFirst(dao) + javaExtension;
		String javaName10 = adminJavaPath +javaSep+ sqlmap.toLowerCase() +javaSep+upperCaseFirst(admin) + upperCaseFirst(fileName) + upperCaseFirst(sql) + xmlExtension;

		System.out.println("ADMIN=====================================================");
		System.out.println("==========================================================");
		System.out.println("==========================================================");
		System.out.println(javaName6);
		System.out.println(javaName7);
		System.out.println(javaName8);
		System.out.println(javaName9);
		System.out.println(javaName10);
		
		
		
	}
	
	
}
