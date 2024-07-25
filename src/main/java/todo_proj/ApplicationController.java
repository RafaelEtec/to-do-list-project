package todo_proj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }

    @GetMapping("/contatos")
    public String viewContatos() {
        return "contatos";
    }
}