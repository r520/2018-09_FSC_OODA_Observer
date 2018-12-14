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
 * Forecast display
 */
public class ForecastDisplay extends AbstractObserver implements DisplayElement {

	/**
	 * Default Constructor with weather data
	 */
	public ForecastDisplay(AbstractSubject weatherData) {
		super(weatherData);

	}

	@Override
	public void update(AbstractSubject abstractSubject) {
		WeatherData wd=(WeatherData) abstractSubject;
		lastPressure = currentPressure;
		currentPressure = wd.getPressure();

		display();

	}


	/**
	 * Updates the display with new data
	 *
	 * @param temp
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
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

	private float currentPressure = 29.92f;
	private float lastPressure;

}
