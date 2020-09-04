package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "/index";
    }

    @PostMapping("/upload/mp3")
    @ResponseBody
    public void upload(MultipartFile upfile) throws IOException {
        File file = new File("D://test.mp3");
        upfile.transferTo(file);
        System.out.println("文件保存成功！");
    }

}
