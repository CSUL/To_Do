

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddTask")
public class AddTask extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		List<ToDo> toDoList=(List<ToDo>) getServletContext().getAttribute("toDoList");
		String task =request.getParameter("task");
	
		toDoList.add(new ToDo(task, new SimpleDateFormat("MM/dd/yy").format(new Date())));
		response.sendRedirect("ViewToDo");
	}

}
