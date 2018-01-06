/**
 * Created by yangyongyi on 12/28/17.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void deleteObserver(Observer o);
    public void notifyObservers();
}
