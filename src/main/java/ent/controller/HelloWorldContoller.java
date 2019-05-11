package ent.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 作者:jamy
 * 时间:2019/5/10 20:48
 * 描述:
 */

@RestController//可以返回json
public class HelloWorldContoller {

    @RequestMapping("/hello")
    public String hello(){
        return "helloworld";
    }
}
