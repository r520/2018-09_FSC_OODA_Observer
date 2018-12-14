/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 10
 *
 * Date: 2018-11-11
 *
 * Code taken from HeadFirst Object-Oriented Design Patterns sample
 */
package HW10.edu.fsu.csc7400.observer.weather;

/**
 * Display for current conditions
 */
public abstract class AbstractObserver {

    /**
     * Constructor with weather data
     *
     * @param weatherData the weather data for initialization
     * @precondition weatherData != null
     * @postcondition this will be registered as an observer to weatherData
     */
    public AbstractObserver(AbstractSubject weatherData) {
        assert (weatherData != null);
        weatherData.registerObserver(this);
    }
    public abstract void update(AbstractSubject abstractSubject );
}
