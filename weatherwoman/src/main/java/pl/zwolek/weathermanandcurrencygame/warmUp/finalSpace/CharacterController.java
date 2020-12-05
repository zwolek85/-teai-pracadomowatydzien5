package pl.zwolek.weathermanandcurrencygame.warmUp.finalSpace;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/api/characters")
public class CharacterController {

    @GetMapping
    public String getCharacters(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        Character[] characters = restTemplate.getForObject("https://finalspaceapi.com/api/v0/character", Character[].class);
        model.addAttribute("characters", characters);
        return "characters";
    }
}
