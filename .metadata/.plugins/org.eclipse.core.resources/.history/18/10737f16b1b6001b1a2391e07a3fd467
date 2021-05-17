package core;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class WeatherForecastService {
	
	// variables "sydLat" and "sydLon" are Latitude and longitude of Sydney
	static final String apiKey = "5b87f1cb5e0cd821f5ac1144dc3ce1ee";
	static final double sydLat = -33.8679;
	static final double sydLon = 151.2073;
	
	public static void reportWeather() throws IOException, ParseException{

		URL url = new URL("https://api.openweathermap.org/data/2.5/onecall?lat=" + sydLat + "&lon=" + sydLon
				+ "&exclude=hourly,minutely&units=metric&appid=" + apiKey);

		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.connect();

		// Getting the response code
		int responsecode = conn.getResponseCode();

		// Exception handling for invalid response codes
		if (responsecode != 200) {
			throw new RuntimeException("HttpResponseCode: " + responsecode);
		} else {
			String inline = "";
			Scanner scanner = new Scanner(url.openStream());

			// Write JSON data into a string using the scanner
			while (scanner.hasNext()) {
				inline += scanner.nextLine();
			}

			// Close the scanner
			scanner.close();

			// Using the JSON-simple library to parse the string into a JSON object
			JSONParser parse = new JSONParser();
			JSONObject data_obj = (JSONObject) parse.parse(inline);

			// Get the required object from the above created object
			JSONArray arrDaily = (JSONArray) data_obj.get("daily");

	
			int i;
			int forecastPeriod = 5;
			int daysOver20Degrees = 0;
			int daysSunny = 0;
			
			// Iterate the array and find the number of days that max temperature is over 20 degrees; also find the number of sunny days
			for (i = 0; i < forecastPeriod; i++) {
				JSONObject objDaily = (JSONObject) arrDaily.get(i);
				JSONObject temp = (JSONObject) objDaily.get("temp");
				Double maxTemp = (Double) temp.get("max");
				
				if (maxTemp > 20) {
					daysOver20Degrees += 1;
				}

				JSONArray arrWeather = (JSONArray) objDaily.get("weather");
				JSONObject objWeather = (JSONObject) arrWeather.get(0);
				long weatherID = (Long) objWeather.get("id");
				
				if (weatherID == 800) {
					daysSunny += 1;
				}

			}

			// Display final results
			System.out.println("Weather Forecast for the next five days:");
			System.out.println("Number of days over 20 degrees Celsius: " + daysOver20Degrees);
			System.out.println("Number of sunny days: " + daysSunny);

		}
	}
}
