package todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import todolist.form.TodoListForm;

@Controller
public class TodoListController {
	
	@GetMapping("/todo")
	public String getTodoList(Model model, TodoListForm todolistForm) {
		return "todo/index";
	}
	
	@GetMapping("/todo/entry")
	public String getTodoEntry() {
		return "todo/entry";
	}
}