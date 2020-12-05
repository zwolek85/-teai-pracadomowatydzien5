package pl.zwolek.weathermanandcurrencygame.weatherForecast;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.zwolek.weathermanandcurrencygame.weatherForecast.dto.City;
import pl.zwolek.weathermanandcurrencygame.weatherForecast.dto.WeatherForecas;

//http://localhost:8080/api/weather
@Controller
@RequestMapping("/api/weather")
public class WeatherwomanController {

    WeatherService weatherService;

    public WeatherwomanController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping
    public String getWeatherLocationView(Model model) {
        model.addAttribute("city", new City());
        return "weatherLocation";
    }

    @PostMapping("/showWather")
    public String getWeatherForLocation(@ModelAttribute City city, Model model) {
        Integer location = weatherService.getLocation(city);
        model.addAttribute("city", city);
        if (location != null) {
            WeatherForecas weatherForecast = weatherService.getWeatherForecast(location);
            model.addAttribute("consolidatedWeathers", weatherForecast.getConsolidatedWeather());
            return "weatherForecast";
        }
        return "locationDidntExist";
    }
}
