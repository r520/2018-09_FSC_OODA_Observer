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
 * Display of weather statistics
 */
public class StatisticsDisplay extends AbstractObserver implements DisplayElement {

	/**
	 * Constructor with weather data
	 *
	 * @param weatherData
	 *            the weather data for initialization
	 *
	 * @precondition weatherData != null
	 * @postcondition this will be registered as an observer to weatherData
	 */
	public StatisticsDisplay(AbstractSubject weatherData) {
		super(weatherData);

	}

	/**
	 * Updates the display with new data
	 */
	public void update(AbstractSubject abstractSubject) {
		WeatherData wd=(WeatherData) abstractSubject;
		this.temp = wd.getTemperature();
		tempSum += temp;
		numReadings++;

		if (temp > maxTemp) {
			maxTemp = temp;
		}

		if (temp < minTemp) {
			minTemp = temp;
		}

		display();
	}

	/**
	 * Displays the data
	 */
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
	}

	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	private float temp;
	private int numReadings;
}
