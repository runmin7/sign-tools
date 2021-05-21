package local.sign.util;

public class NamingPlanUtil {
	
	public static String upperCaseFirst(String val) {
	      char[] arr = val.toCharArray();
	      arr[0] = Character.toUpperCase(arr[0]);
	      return new String(arr);
	   }

	public static void main(String[] args) {
		
		String front = "front";
		String admin = "admin";
		
		String name1 = "counsling";
		String name2 = "room";
		
		String pullName = name1 + upperCaseFirst(name2);

		//만들어야 할 JSP
		
		String viewExtension = ".jsp";	//확장자
		String request = upperCaseFirst(pullName) + "_I01"+viewExtension;	//신청페이지
		String view = upperCaseFirst(pullName) + "_V01"+viewExtension; //상세보기
		String list = upperCaseFirst(pullName) + "_L01"+viewExtension; //상세보기
		String pop = upperCaseFirst(pullName) + "_P01"+viewExtension; //상세보기
		String managerList = upperCaseFirst(pullName) + "Mgr_L01"+viewExtension; //상세보기

		
		System.out.println(request);
		System.out.println(view);
		System.out.println(list);
		System.out.println(pop);
		System.out.println(managerList);
		
		
		
		//만들어야 할 JAVA
		
		//만들어야 할 XML
		
	}
	
	
}
