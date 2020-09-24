package kr.co.softcampus.controller;

import kr.co.softcampus.beans.DataBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@Controller
public class TestController {

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public String test1_get(@RequestParam Map<String, String> map){
        String data1 = map.get("data1");
        String data2 = map.get("data2");
        System.out.printf("data1 : %s\n", data1);
        System.out.printf("data2 : %s\n", data2);

        return "result";
    }

    @RequestMapping(value = "/test2", method = RequestMethod.POST)
    public String test2_post(WebRequest request){
        String data1 = request.getParameter("data1");
        String data2 = request.getParameter("data2");
        System.out.println("data1 : " + data1);
        System.out.println("data2 : " + data2);
        String[] data3 = request.getParameterValues("data3");

        for(String str1 : data3){
            System.out.println("data3 : " + str1);
        }
        return "test2";
    }

    @GetMapping(value = "/test3")
    public String test3(@ModelAttribute DataBean bean1){
        System.out.printf("data1 : %d\n", bean1.getData1());
        System.out.printf("data2 : %d\n", bean1.getData2());
        for(int number1 : bean1.getData3()){
            System.out.printf("data3 : %d\n", number1);
        }
        return "result";
    }
}