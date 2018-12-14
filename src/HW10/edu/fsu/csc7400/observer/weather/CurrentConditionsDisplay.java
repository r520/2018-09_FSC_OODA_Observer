/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 10
 * Student: Radhika Kasu
 * Date: 2018-11-11
 * Code taken from HeadFirst Object-Oriented Design Patterns sample
 */
package HW10.edu.fsu.csc7400.observer.weather;

/**
 * Display for current conditions
 */
public class CurrentConditionsDisplay extends AbstractObserver implements DisplayElement {

	/**
	 * Default Constructor with weather data
	 */

	public CurrentConditionsDisplay(AbstractSubject weatherData) {
		super(weatherData);

	}

	@Override
	public void update(AbstractSubject abstractSubject) {
		WeatherData wd=(WeatherData) abstractSubject;
		this.temperature = wd.getTemperature();
		this.humidity = wd.getHumidity();
		display();

	}

	/**
	 * Updates the display with new data
	 *
	 * @param temperature
	 *            current temperature
	 * @param humidity
	 *            current humidity level
	 * @param pressure
	 *            current barometric pressure
	 */



	/**
	 * Displays the data
	 */
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}

	private float temperature;
	private float humidity;
}
