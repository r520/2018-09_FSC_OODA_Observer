/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 10
 * Student: Radhika Kasu
 * Date: 2018-11-11
 * Code taken from HeadFirst Object-Oriented Design Patterns sample
 */
package HW10.edu.fsu.csc7400.observer.weather;

import java.util.*;

/**
 * WeatherData collects readings from sensors and then broadcasts the values to observers
 */
public abstract class AbstractSubject {

    /**
     * Default constructor
     */
    public AbstractSubject() {
        observers = new ArrayList<>();
    }

    /**
     * Registers an observer
     *
     * @param abstractObserver the new observer
     *
     * @precondition o != null
     */
    public void registerObserver(AbstractObserver abstractObserver) {
        observers.add(abstractObserver);
    }

    /**
     * Removes a registered observer
     *
     * @param o observer to remove
     *
     * @precondition o != null
     */
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    /**
     * Notifies all registered observers of weather changes
     */

    public void notifyObservers() {
        /*for (int i = 0; i < observers.size(); i++) {
            AbstractObserver observer = (AbstractObserver)observers.get(i);
            observer.update(this);
        }*/
        for(AbstractObserver o:observers){
            o.update(this);
        }
    }



    private ArrayList<AbstractObserver> observers;

    //public abstract void setMeasurements(int temperature, int humidity, float pressure);
}
