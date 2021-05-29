package local.sign.util;

public class FunctionPlanUtil {
	
	public static void main(String[] args) {
		
		//void 타입의 return은 매핑되는 URL과 동일한 이름의 JSP 파일을 실행한다.
		//String 타입은 return 값이 view 파일의 이름
		//return 타입이 모델이면 모델안에 정의한 뷰페이지
		
		//모델객체 사용법
		//파라미터로 전달받고, 거기에 set만 해도 데이터가 저장됨
		//addAttribute(객체)  : 이름을 별도로 정의하지 않는다면, 자동으로 클래스의 앞글자를 소문자로 변경해 이름으로 저장
		
		//리턴페이지를 문자열로 바꿔서 보여줘도 호출한 이름이 주소창에 그대로 표기된다. 
		//주소창도 변경하려면 redirect 써야함

		
		StringBuffer viewSb = new StringBuffer();
		viewSb
			.append("@RequestMapping(\"ReqPurchaseMobileDuty_I01\")").append("\r\n")
			.append("public String reqPurchaseMobileDuty_I01(Map<String, Object> paramMap, HttpServletRequest request, Model model)").append("\r\n")
			.append("{").append("\r\n")
			.append("\t").append("model.addAllAttributes(paramMap);").append("\r\n")
			.append("\t").append("return \"front/purchase/ReqPurchaseMobileDuty_I01\";").append("\r\n")
			.append("}")
			;
		
		System.out.println("페이지 리턴==================================================");
		System.out.println("==========================================================");
		System.out.println("==========================================================");
		System.out.println(viewSb);
		
		
		//model 객체에 바로 xmlData를 넣는것도 가능한지 확인필요
		StringBuffer searchDataSb = new StringBuffer();
		searchDataSb
			.append("@RequestMapping(\"ReqPurchaseMobileDuty_L01\")").append("\r\n")
			.append("public ModelAndView ReqPurchaseMobileDuty_L01(Map<String, Object> paramMap, HttpServletRequest request, Model model)").append("\r\n")
			.append("{").append("\r\n")
			.append("\t").append("frontPurchaseMobileDutyService.selectParking_01(paramMap);").append("\r\n")
			.append("\t").append("model.addAllObjects(paramMap);").append("\r\n")
			.append("\t").append("return \"front/purchase/ReqPurchaseMobileDuty_L01\";").append("\r\n")
			.append("}").append("\r\n")
			;
		
		
		System.out.println("jqgrid 리스트 조회==========================================");
		System.out.println("==========================================================");
		System.out.println("==========================================================");
		System.out.println(searchDataSb);
		
		
//		StringBuffer searchDataSb = new StringBuffer();
//		searchDataSb
//			.append("@RequestMapping(\"ReqPurchaseMobileDuty_L01\")").append("\r\n")
//			.append("public ModelAndView mobileDuty_L01(Map<String, Object> paramMap, HttpServletRequest request, Model model)").append("\r\n")
//			.append("{").append("\r\n")
//			.append("\t").append("paramMap.put(\"xmlData\", frontPurchaseMobileDutyService.MobileDuty_L01(paramMap));").append("\r\n")
//			.append("\t").append("model.addAllObjects(paramMap);").append("\r\n")
//			.append("\t").append("return \"front/purchase/ReqPurchaseMobileDuty_L01\";").append("\r\n")
//			.append("}").append("\r\n")
//			;
		
		System.out.println("jqgrid 리스트 조회==========================================");
		System.out.println("==========================================================");
		System.out.println("==========================================================");
		System.out.println(searchDataSb);
		
	}

}

