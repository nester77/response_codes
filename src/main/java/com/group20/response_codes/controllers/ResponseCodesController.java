package com.group20.response_codes.controllers;

//import com.group20.response_codes.entity.ResponseCodes;

import com.group20.response_codes.dto.ResponseCodesDto;
import com.group20.response_codes.entity.ResponseCodes;
import com.group20.response_codes.repository.ResponseCodesRepository;
import com.group20.response_codes.service.ResponseCodesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashSet;
import java.util.List;

@Controller
public class ResponseCodesController {

    private ResponseCodesService responseCodesService;
    private List<ResponseCodes> mainResponseCodes;
    private ResponseCodes mainTrueCode;
    private String mainStatus;

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

    @RequestMapping("/training")
    public String getCodes1(@ModelAttribute("status") String status, ModelMap modelMap) {
        if (status.isEmpty()) {
            status = mainStatus;
        } else {
            mainStatus = status;
        }
        List<ResponseCodes> codes = responseCodesService.getRandomResponseCodes(status);
        ResponseCodes trueCode = responseCodesService.getRandomResponseCode(codes);
        modelMap.addAttribute("codes", codes);
        modelMap.addAttribute("trueCod", trueCode);
        mainResponseCodes = codes;
        mainTrueCode = trueCode;

        return "training";
    }

    @RequestMapping("/result")
    public String getResult1(@ModelAttribute("answer") String answer, ModelMap modelMap) {
        modelMap.addAttribute("codes", mainResponseCodes);
        modelMap.addAttribute("trueCod", mainTrueCode);
        boolean mark = responseCodesService.isAnswerTrue(answer, mainTrueCode.getNameRu());
        modelMap.addAttribute("mark", mark);
        return "result";
    }


    @RequestMapping("/theory")
    public String getTheory(ModelMap modelMap) {
        List<ResponseCodes> codes = responseCodesService.findAll();
        modelMap.addAttribute("codes", codes);
        return "theory";
    }
}
