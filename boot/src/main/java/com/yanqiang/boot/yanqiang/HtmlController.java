package com.yanqiang.boot.yanqiang;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    @GetMapping("showHtml.do")
    public String showHtml(){
        return "index.html";
    }
}
