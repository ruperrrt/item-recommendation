package rpc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Servlet implementation class SearchItem
 */
@WebServlet("/search")	// to map with the url
public class SearchItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchItem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// response.setContentType("text/html");
		response.setContentType("text/json");
		PrintWriter out = response.getWriter();
		
		/*
		if(request.getParameter("username") != null) {
			String username = request.getParameter("username");
			out.println("Hello, " + username);
		}
		
		if(request.getParameter("password") != null) {
			String pwd = request.getParameter("password");
			out.print("Your password is: " + pwd);
		}
		*/
		
		/*
		out.println("<html><body>");					// output an html page
		out.println("<h1>This is a HTML page</h1>");
		out.println("</body></html>");
		*/
		
		// String username = "";
		// if (request.getParameter("username") != null) {
		// 	username = request.getParameter("username");
		// }
		
		
		JSONArray array = new JSONArray();
		try {
			array.put(new JSONObject().put("username", "abcd"));
			array.put(new JSONObject().put("password", "1234"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		out.print(array);


		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
