package interfaces;

import components.Component;

/**
 *  @author Ivan Poza
 *  
 *  Observer pattern. Class Subject that is in charge of inform of a change to all the
 *  observer that have registered using its method register before.
 *  If the observer is no long interested of receiving any update by the Subject then it may
 *  use the supplied remove method.
 *  When the Subject have a change to be notified to the registered Observers then it will
 *  make use of the notifyObservers method.
 *
 */
public interface Subject {
 
    //methods to register and unregister observers
    public void register(Component obj);
    public void unregister(Component obj);
     
    //method to notify observers of change
    public void notifyObservers();
     
}
