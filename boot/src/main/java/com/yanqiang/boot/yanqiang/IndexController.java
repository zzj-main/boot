package com.yanqiang.boot.yanqiang;

import com.yanqiang.boot.annotation.DoneTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

        @GetMapping("/index1")
    @DoneTime(param = "IndexController")
    public String index(){
        System.out.println("方法执行");
        return "hello dalaoyang";
    }

    @GetMapping("/index2")
    public String index2(){
        System.out.println("方法2执行");
        return "hello dalaoyang";
    }
}
