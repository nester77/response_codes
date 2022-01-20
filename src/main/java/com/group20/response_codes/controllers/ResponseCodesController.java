package com.group20.response_codes.controllers;

//import com.group20.response_codes.entity.ResponseCodes;
import com.group20.response_codes.entity.ResponseCodes;
import com.group20.response_codes.repository.ResponseCodesRepository;
import com.group20.response_codes.service.ResponseCodesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashSet;
import java.util.List;

@Controller
public class ResponseCodesController {

    private ResponseCodesService responseCodesService;

    @Autowired
    public ResponseCodesController(ResponseCodesService responseCodesService) {
        this.responseCodesService = responseCodesService;
    }




//    @RequestMapping("/theory")
//    public String getAllCodes(ModelMap modelMap){
//        List<ResponseCodes> codes = responseCodesService.findAll();
//        modelMap.addAttribute("codes", codes);
//        return "theory";
//    }

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

    @RequestMapping("/training1")
    public String getCodes1(ModelMap modelMap){
        HashSet<ResponseCodes> codes = responseCodesService.getRandomResponseCodes("Informational");
        modelMap.addAttribute("codes", codes);
        return "training";
    }

    @RequestMapping("/training2")
    public String getCodes2(ModelMap modelMap){
        HashSet<ResponseCodes> codes = responseCodesService.getRandomResponseCodes("Success");
        modelMap.addAttribute("codes", codes);
        return "training";
    }

    @RequestMapping("/training3")
    public String getCodes3(ModelMap modelMap){
        HashSet<ResponseCodes> codes = responseCodesService.getRandomResponseCodes("Redirection");
        modelMap.addAttribute("codes", codes);
        return "training";
    }

    @RequestMapping("/training4")
    public String getCodes4(ModelMap modelMap){
        HashSet<ResponseCodes> codes = responseCodesService.getRandomResponseCodes("Client Error");
        modelMap.addAttribute("codes", codes);
        return "training";
    }

    @RequestMapping("/training5")
    public String getCodes5(ModelMap modelMap){
        HashSet<ResponseCodes> codes = responseCodesService.getRandomResponseCodes("Server Error");
        modelMap.addAttribute("codes", codes);
        return "training";
    }

    @RequestMapping("/trainingAll")
    public String getCodesAll(ModelMap modelMap){
        HashSet<ResponseCodes> codes = responseCodesService.getRandomResponseCodes(null);
        modelMap.addAttribute("codes", codes);
        return "training";
    }

    @RequestMapping("/theory")
    public String getTheory(ModelMap modelMap){
        List<ResponseCodes> codes = responseCodesService.findAll();
        modelMap.addAttribute("codes", codes);
        return "theory";
    }
}
