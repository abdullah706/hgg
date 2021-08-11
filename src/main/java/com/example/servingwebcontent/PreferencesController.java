package com.example.servingwebcontent;

import com.example.servingwebcontent.Jours;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;




@Controller


public class PreferencesController {

    @GetMapping("/Preferences")
    public String main(Model model) {
        model.addAttribute("jour", new Jours());

        return "Preferences";
    }

    @PostMapping("/save-time")
    public String saveProjectSubmission(@ModelAttribute Jours jour) {

        // TODO: save project in DB here

        return "reesult";
    }


}
