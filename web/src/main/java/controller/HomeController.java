package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gleb on 19.08.15.
 */
@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home() {
        return "orders";
    }
}
