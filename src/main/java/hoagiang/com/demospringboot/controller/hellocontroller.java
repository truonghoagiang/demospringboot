package hoagiang.com.demospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @controller: định nghĩa đường dẫn trả ra nội dung html
 *
 * @RespnseBody: giúp cho @controller có thể trả ra kiểu String dùng để viết API
 *
 * @RestController: kết hợp của @controller và @ResponseBody
 * */

@RestController
@RequestMapping("/hello")
public class hellocontroller {

    @GetMapping("")
    public String hello(){
        return "Hello Spring boot";
    }

    @GetMapping("/cybersoft")
    public String helloCybersoft(){
        return "Hello Cybersoft Spring boot";
    }
}
