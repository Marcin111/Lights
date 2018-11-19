package dashboard.warning.Lights.controller;

import dashboard.warning.Lights.data.LightRepository;
import dashboard.warning.Lights.model.Light;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class LightController {

    @Autowired
    LightRepository lightRepository;

    @GetMapping("/")
    public String listLights(ModelMap modelMap) {
        List<Light> lights = lightRepository.getAllLIGHTS();
        modelMap.put("lights", lights);
        return "home";
    }

    @RequestMapping("/light/{name}")
    public String lightDetails(@PathVariable String name, ModelMap modelMap) {
        Light light = lightRepository.findByName(name);
        modelMap.put("light", light);
        return "gif-details";
    }

    @GetMapping("/profil")
    public String profil() {
        return "profil";
    }

    @GetMapping("/autor")
    public String autor() {
        return "autor";
    }
}

