package com.example.demo.controller;

import com.example.demo.service.UserService;
import com.example.demo.dto.BaseResponseDTO;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @auth jp
 * @Date 2019/1/3
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getA")
    public String getA(){
        return "A";
    }

    @GetMapping("/get/{id}")
    public BaseResponseDTO<User> getUserById(@PathVariable("id") Integer id){
        BaseResponseDTO response = new BaseResponseDTO<User>();
        response.setCode("1");
        response.setMsg("操作成功");
        User user = null;
        try {
            user = userService.get(id);
            response.setData(user);
        } catch (Exception e) {
            response.setCode("0");
            response.setMsg("操作失败");
            e.printStackTrace();
        }
        return response;
    }

    @PostMapping("/save")
    public BaseResponseDTO<User> saveUser(@RequestBody User user){
        BaseResponseDTO response = new BaseResponseDTO<User>();
        response.setCode("1");
        response.setMsg("操作成功");
        try {
            userService.insert(user);
        } catch (Exception e) {
            response.setCode("0");
            response.setMsg("操作失败");
            e.printStackTrace();
        }
        return response;
    }
}
