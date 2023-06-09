package unit01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JoinServlet
 */
@WebServlet("/JoinServlet")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JoinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		
		String name = request.getParameter("name");
		String rrn = request.getParameter("rrn") + "-" + request.getParameter("rrn2");
		String userid = request.getParameter("userid");
		String userpwd = request.getParameter("userpwd");
		String email = request.getParameter("email");
		String zip_code = request.getParameter("zip_code");
		String addr = request.getParameter("addr") + request.getParameter("addr2");
		String phone_num = request.getParameter("phone_num");
		String job = request.getParameter("job");
		String interests[] = request.getParameterValues("interest");
		
		out.println("이름 : <b>");
		out.print(name);
		out.println("</b><br>주민등록번호 : <b>");
		out.print(rrn);
		out.println("</b><br>아이디 : <b>");
		out.print(userid);
		out.println("</b><br>비밀번호 : <b>");
		out.print(userpwd);
	
		// 이메일 입력시 공백 체크
		if(request.getParameter("email_dns").trim() == ""){
			email += "@" + request.getParameter("email_input");
		} else {
			email += "@" + request.getParameter("email_dns");
		}
		out.println("</b><br>이메일 : <b>");
		out.print(email);
		
		out.println("</b><br>우편주소 : <b>");
		out.print(zip_code);
		out.println("</b><br>주소 : <b>");
		out.print(addr);
		out.println("</b><br>핸드폰 번호 : <b>");
		out.print(phone_num);
		out.println("</b><br>직업 : <b>");
		out.print(job);
		
		out.println("</b><br>관심분야 : <b>");
		// 관심분야 체크 유무
		if(interests == null){
			out.print("선택한 항목이 없습니다.");
		} else {
			for(String interest : interests){
				out.print(interest + " ");
			}
		}
		
		out.println("<br><br><br><a href='javascript:history.go(-1)'>뒤로가기</a>");
		out.println("</body></html>");
		out.close();

		
	}

}
