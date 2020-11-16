package com.yanqiang.boot.yanqiang;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @GetMapping("index")
    public @ResponseBody String index(){
        return  "hello world";
    }
}
