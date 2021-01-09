package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    @RequestMapping(value="/home.do",method= RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("msg", "Hello world");
        return "home";
    }
}
