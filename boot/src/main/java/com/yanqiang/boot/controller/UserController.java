package com.yanqiang.boot.controller;

import com.yanqiang.boot.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("user")
@Api(tags ="用户服务相关接口")
public class UserController {
    @GetMapping("findAll")
    @ApiOperation(value = "查询所有用户接口",
            notes="描述:查询所有用户信息的接口")
    public Map<String,Object> findAll(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("sucess","查询接口成功");
    map.put("status",200);
        return map;
    }

    @PostMapping("save")
    @ApiOperation(value = "保存用户信息接口",
    notes = "描述：用来保存用户信息的接口")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name="name",value = "用户姓名",dataType = "String",defaultValue = "zzj" ,paramType = "body"),
//            @ApiImplicitParam(name="age",value = "用户年龄",dataType = "String",defaultValue = "21",paramType = "body")
//    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "成功访问"),
            @ApiResponse(code = 201,message = "禁止访问"),
            @ApiResponse(code = 401,message = "访问失败"),
            @ApiResponse(code = 403,message = "网络断开"),
            @ApiResponse(code = 404,message = "页面丢失"),
    })
    public Map<String,Object> save(@RequestBody User user){
        System.out.println("name"+user.getName());
        System.out.println("age"+user.getAge());
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("success","插入已经完成");
        map.put("status",200);
        return map;

    }
}
