package com.in28Minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	// say-hello => hello! what are you learning today?
	//http://localhost:8080/say-hello
	
	@RequestMapping("say-hello")// URL
	@ResponseBody
	public String sayHello() {
		return "Hello! What are you learning today?";
	}
	
	
	@RequestMapping("say-hello-html")// URL
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> MY first HTML page </title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My first HTML page with body-Changed");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}
	
	//say-hello-jsp => sayHello.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/welcome.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/todos.jsp
	@RequestMapping("say-hello-jsp") //URL
	public String sayHelloJsp() {
		return "sayHello"; // name of the JSP file
	}
}
