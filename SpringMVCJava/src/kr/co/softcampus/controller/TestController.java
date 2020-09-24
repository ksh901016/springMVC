package kr.co.softcampus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public String test1_get(HttpServletRequest request){
        String data1 = request.getParameter("data1");
        String data2 = request.getParameter("data2");
        System.out.println("data1 : " + data1);
        System.out.println("data2 : " + data2);
        String[] data3 = request.getParameterValues("data3");

        for(String str1 : data3){
            System.out.println("data3 : " + str1);
        }
        return "test1";
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
}