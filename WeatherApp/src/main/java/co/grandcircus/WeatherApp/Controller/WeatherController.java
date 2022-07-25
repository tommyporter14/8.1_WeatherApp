package co.grandcircus.WeatherApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.grandcircus.WeatherApp.Model.WeatherResponse;
import co.grandcircus.WeatherApp.Service.WeatherApiService;

@Controller
public class WeatherController {

		@Autowired
		private WeatherApiService weatherService;
		
		@RequestMapping("/")
		public String homePage() {
			return "home";
		}

		@PostMapping("/location")
		public String location(Model model, @RequestParam String latitude, @RequestParam String longitude) {
			
			WeatherResponse currentWeather = weatherService.getCurWeather(latitude, longitude);
			model.addAttribute("areaDescription", currentWeather.getLocationInfo().getAreaDescription());
			model.addAttribute("elevation", currentWeather.getObservation().getElev());
			model.addAttribute("latitude", currentWeather.getObservation().getLatitude());
			model.addAttribute("longitude", currentWeather.getObservation().getLongitude());
			model.addAttribute("label", currentWeather.getTimeInfo().getStartPeriodName());
			model.addAttribute("temp", currentWeather.getObservation().getTemp());
			model.addAttribute("winds", currentWeather.getObservation().getWinds());
			model.addAttribute("visibility", currentWeather.getObservation().getVisibility());
			model.addAttribute("future", currentWeather.getDataInfo().getText());
			
			return "location";
		}
}
