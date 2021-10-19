package com.group20.response_codes.controllers;

import com.group20.response_codes.entity.ResponseCodes;
import com.group20.response_codes.repository.ResponseCodesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ResponseCodesController {
    @Autowired
    private ResponseCodesRepository responseCodesRepository;

    @RequestMapping("/theory")
    public String getAllCodes(ModelMap modelMap){
        List<ResponseCodes> codes = responseCodesRepository.findAll();
        modelMap.addAttribute("codes", codes);
        return "theory";
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Тренажер");
        return "home";
    }

    @GetMapping("/choice")
    public String choice(Model model) {
        model.addAttribute("title", "Тренажер");
        return "/choice";
    }



}
