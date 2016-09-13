

import java.io.IOException;import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TaskDone")
public class TaskDone extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		List<ToDo> toDoList =(List<ToDo>)getServletContext().getAttribute("toDoList");

		int index=Integer.parseInt(request.getParameter("id"));
		ToDo task = toDoList.get(index);
		task.setComplete(true);
		task.setCompletedDate(new SimpleDateFormat("MM/dd/yy").format(new Date()));
		toDoList.remove(index);
		toDoList.add(task);
		request.getRequestDispatcher("/WEB-INF/ViewToDo.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//
	}

}
