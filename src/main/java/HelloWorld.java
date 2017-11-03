import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@EnableAutoConfiguration
public class HelloWorld {

    @RequestMapping("/")
    String index(String name) {
        String total;
        total = name + " says hello world";
        return total;
    }

    @RequestMapping("/order")
    String order(HttpServletRequest request){
        String order_id = request.getParameter("order_id");
        System.out.println(order_id);
        String total = order_id + "order_id";
        return total;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloWorld.class, args);
    }

}