package interfaces;
/**
 *  @author Ivan Poza
 *  
 *  Observer pattern. Class observer that is accesed by a Subject to be informed of any
 *  change that the observer may have registered before with the Subject class.
 *  When the observer is warned by the subject the method update() is invoked.
 *
 */
public interface Observer {
	     
	    //method to update the observer, used by subject
	    public void update();
	     
	    //attach with subject to observe
	    public void setSubject(Subject sub);
}
