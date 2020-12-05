package pl.zwolek.weathermanandcurrencygame.weatherForecast;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.zwolek.weathermanandcurrencygame.weatherForecast.dto.City;
import pl.zwolek.weathermanandcurrencygame.weatherForecast.dto.ConsolidatedWeather;
import pl.zwolek.weathermanandcurrencygame.weatherForecast.dto.Location;
import pl.zwolek.weathermanandcurrencygame.weatherForecast.dto.WeatherForecas;

@Service
class WeatherService {

    RestTemplate restTemplate;

    WeatherService() {
        this.restTemplate = new RestTemplate();
    }

    WeatherForecas getWeatherForecast(Integer woeid) {
        WeatherForecas weatherForecas = restTemplate
                .getForObject("https://www.metaweather.com/api/location/" + woeid, WeatherForecas.class);
        return weatherForecas;
    }

    Integer getLocation(City city) {
        Location[] locations = restTemplate
                .getForObject("https://www.metaweather.com/api/location/search/?query=" + city.getName(), Location[].class);
        if (locations.length > 0) {
            return locations[0].getWoeid();
        }

        return null;
    }
}
