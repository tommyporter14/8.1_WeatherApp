package co.grandcircus.WeatherApp.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.WeatherApp.Model.WeatherResponse;

@Service
public class WeatherApiService {
		private RestTemplate request = new RestTemplate();
		
		public WeatherResponse getCurWeather(String lat, String lon) {
			String url = "https://forecast.weather.gov/MapClick.php?lat={0}&lon={1}&FcstType=json";
			
			WeatherResponse response = request.getForObject(url, WeatherResponse.class, lat, lon);
			
			return response;
		}
}
