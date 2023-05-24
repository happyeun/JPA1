package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        // Model
        /*
            Model 컨트롤러와 View사이의 데이터 담는 것.
            ModelAndView 도 있었지???ㅋ
         */
        model.addAttribute("data","hello!!! LSE");
        return "hello";
        // 스프링부트 타임리프의 viewName 매핑
        /*
            resources/templates 폴더안에서 return한 viewName에 맞는 html을 찾아줌
        */
    }
}
