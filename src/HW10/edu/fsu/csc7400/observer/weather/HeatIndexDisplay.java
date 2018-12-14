/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 10
 * Student: Radhika Kasu
 * Date: 2018-11-11
 * Code taken from HeadFirst Object-Oriented Design Patterns sample
 */
package HW10.edu.fsu.csc7400.observer.weather;

public class HeatIndexDisplay extends AbstractObserver implements DisplayElement {
    /**
     * Constructor with weather data
          */
    public HeatIndexDisplay(AbstractSubject weatherData) {
        super(weatherData);

    }

    /**
     * Updates the display with new data
     *
     */

    @Override
    public void update(AbstractSubject abstractSubject) {
        WeatherData wd=(WeatherData) abstractSubject;
        this.temperature = wd.getTemperature();

        // Now print your info!
        display();
    }

    @Override
    public void display() {
        System.out.println("Heat Index display: " + heatIndex(this.temperature, this.humidity));
    }

    float t = this.temperature;
    float rh = this.humidity;

    private float heatIndex(float t, float rh) {

        heatIndex = (float) (
                (16.923 + (0.185212 * t)) +
                        (5.37941 * rh) -
                        (0.100254 * t * rh) +
                        (0.00941695 * (t * t)) +
                        (0.00728898 * (rh * rh)) +
                        (0.000345372 * (t * t * rh)) -
                        (0.000814971 * (t * rh * rh)) +
                        (0.0000102102 * (t * t * rh * rh)) -
                        (0.000038646 * (t * t * t)) +
                        (0.0000291583 * (rh * rh * rh)) +
                        (0.00000142721 * (t * t * t * rh)) +
                        (0.000000197483 * (t * rh * rh * rh)) -
                        (0.0000000218429 * (t * t * t * rh * rh)) +
                        (0.000000000843296 * (t * t * rh * rh * rh)) -
                        (0.0000000000481975 * (t * t * t * rh * rh * rh)));


 return heatIndex;
}

    private float temperature;
    private float humidity;
    private float heatIndex;
}