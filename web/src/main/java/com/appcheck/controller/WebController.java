package com.appcheck.controller;////package com.AppCheck.Controller;

import com.appcheck.service.FetchOperatingCrew;
import com.appcheck.utils.Mappings;
import com.appcheck.utils.ViewOperatingCrew;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.print.attribute.PrintRequestAttributeSet;
import javax.swing.text.html.HTML;
import javax.xml.datatype.DatatypeConfigurationException;

@Slf4j
@Controller
public class WebController {

    // feilds
    private final FetchOperatingCrew fetchOperatingCrew;


    // constructor
    public WebController (FetchOperatingCrew fetchOperatingCrew){
        this.fetchOperatingCrew = fetchOperatingCrew;
    }

    // request methods
    @GetMapping(Mappings.HOME)
    public String home(Model model) throws DatatypeConfigurationException {
        model.addAttribute(fetchOperatingCrew.listOfOperatingCrew());
        log.info("model ={}", model );
        return ViewOperatingCrew.HOME;
    }

    @PostMapping(Mappings.HOME)
    public String processInput(@RequestParam boolean go) throws DatatypeConfigurationException {
        log.info("go= {}", go);
        fetchOperatingCrew.listOfOperatingCrew();
        return Mappings.REDIRECT_HOME;
    }
}
