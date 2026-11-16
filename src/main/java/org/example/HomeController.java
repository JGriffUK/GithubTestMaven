import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/contact")
    public String index() {

        System.out.println("Hello World");
        return "contact info found";
    }
}