package com.application.controller.web;

import com.application.model.NumberSequence;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Exposes a possible fibonacci series frontend
 */
@Controller
@CrossOrigin("any")
public class LandingController {

    @RequestMapping("/fibonacci")
    public String root(Model model) {
        model.addAttribute("greeting", "Welcome to Fibonacci Web");
        return "inprogress";
    }
}
