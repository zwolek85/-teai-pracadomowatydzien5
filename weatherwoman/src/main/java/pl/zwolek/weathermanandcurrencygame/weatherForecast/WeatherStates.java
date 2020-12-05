package pl.zwolek.weathermanandcurrencygame.weatherForecast;

public enum WeatherStates {
    SNOW("Snow", "sn", "https://www.metaweather.com//static/img/weather/png/64/sn.png"),
    SLEET("Sleet", "sl", "https://www.metaweather.com//static/img/weather/png/64/sl.png"),
    Hail("Hail", "h", "https://www.metaweather.com//static/img/weather/png/64/h.png"),
    THUNDERSTORM("Thunderstorm", "t", "https://www.metaweather.com//static/img/weather/png/64/t.png"),
    HEAVY_RAIN("Heavy Rain", "hr", "https://www.metaweather.com//static/img/weather/png/64/hr.png"),
    LIGHT_RAIN("Light Rain", "lr", "https://www.metaweather.com//static/img/weather/png/64/lr.png"),
    SHOWERS("Showers", "s", "https://www.metaweather.com//static/img/weather/png/64/s.png"),
    HEAVY_CLOUD("Heavy Cloud", "hc", "https://www.metaweather.com//static/img/weather/png/64/hc.png"),
    LIGHT_CLOUD("Light Cloud", "lc", "https://www.metaweather.com//static/img/weather/png/64/lc.png"),
    CLEAR("Clear", "c", "https://www.metaweather.com/static/img/weather/png/64/c.png");

    private String name;
    private String abbreviation;
    private String urlIcon;

    WeatherStates(String name, String abbreviation, String urlIcon) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.urlIcon = urlIcon;
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public static String getUrlIconByAbbreviation(String abbreviation) {
        for (WeatherStates weatherStates : WeatherStates.values()) {
            if (weatherStates.getAbbreviation().equals(abbreviation)) {
                return weatherStates.getUrlIcon();
            }
        }
        throw new IllegalStateException("WeatherStates didn't exist for abbreviation " + abbreviation);
    }

    public String getUrlIcon() {
        return urlIcon;
    }

}
