import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class WeatherInFiveDays {

	public static void main(String[] args) throws IOException {
		URL url = new URL(
				"https://api.openweathermap.org/data/2.5/onecall?lat=33.44&lon=-94.04&exclude=hourly,minutely&units=metric&appid=5b87f1cb5e0cd821f5ac1144dc3ce1ee");

		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.connect();

		// Getting the response code
		int responsecode = conn.getResponseCode();

		System.out.println(responsecode);

		if (responsecode != 200) {
			throw new RuntimeException("HttpResponseCode: " + responsecode);
		} else {

			String inline = "";
			Scanner scanner = new Scanner(url.openStream());

			// Write all the JSON data into a string using a scanner
			while (scanner.hasNext()) {
				inline += scanner.nextLine();
			}

			// Close the scanner
			scanner.close();

			System.out.println(inline);
		}
	}
}
