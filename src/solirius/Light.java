package solirius;

/**
 *
 * @author Kolontko Vitali
 */
public class Light {
    private boolean isOn;
    private String color;
    
    /**
     * Light constructor
     * @param color Sets the color of the light
     */
    public Light(String color){
        this.isOn = false;
        this.color = color;
    }
    
    /**
     * Changes the isOn state of the instance
     */
    public String flipSwitch(){
        this.isOn = !this.isOn;
        return getState();
    }
    
    /**
     * Returns the color of the current instance
     * @return String 
     */
    public String getColor(){
        return this.color;
    }
    
    /**
     * Returns a String ON or OFF according to the 
     * isOn state of the current instance
     * @return String
     */
    public String getState(){
        return this.isOn ? "ON" : "OFF";
    }
}
