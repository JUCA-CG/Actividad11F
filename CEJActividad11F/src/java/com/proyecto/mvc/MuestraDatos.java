/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.mvc;

import com.proyecto.mvc.DTO.SumaDatos;
import java.util.Locale;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author jc_ca
 */
@Controller
public class MuestraDatos {

    @RequestMapping(value = "muestraDatos.htm", method = RequestMethod.POST)
    public String muestraDatos(Locale locale, Model model, SumaDatos sumaDatos) {

        //System.out.println("nombre:" + sumaDatos.getSuma());
    
        System.out.println("Hola mundo");
        model.addAttribute("SumaN",sumaDatos);
        return "MuestraDatos";
    }

}
