package fatecfranca.loja.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // responde requisições REST
@RequestMapping("/hello") // define o endpoint
public class HelloController {
    @GetMapping //verdo GET
    public String saudacao(){
        return "Hello World!";
    }
}
