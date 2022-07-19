package com.epam.airplaneservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class AirplaneController {

    private AirplaneService airplaneService;

    @Autowired
    public AirplaneController(AirplaneService airplaneService) {
        this.airplaneService = airplaneService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showMainMenu() {
        return "main-menu";
    }

    @RequestMapping(value = "/airplanes", method = RequestMethod.GET)
    public String findAllAirplanes(Model model) {
        List<String> airplanes = airplaneService.findAllAirplanes();
        model.addAttribute("airplanes", airplanes);

        return "airplanesList";
    }

    @RequestMapping("/airplanes/find")
    public String findAirplaneByName(HttpServletRequest request, Model model) {
        String airplaneName = request.getParameter("airplaneName");
        String airplane = airplaneService.findAirplane(airplaneName);
        model.addAttribute("airplane", airplane);
        return "findAirplaneByName";


    }

    @RequestMapping("/airplanes/count")
    public String countSpecificAirplane(HttpServletRequest request, Model model) {
        String companyName = request.getParameter("companyName");
        int count = airplaneService.countSpecificAirplanes(companyName);
        model.addAttribute("count", count);
        return "countAirplanes";
    }
}
