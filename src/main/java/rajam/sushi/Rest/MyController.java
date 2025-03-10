package rajam.sushi.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String sayHello(){
        return "hello world";
    }

    @GetMapping("/nina")
    public String yappp(){
        return "yappppp";
    }
}
