package solirius;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Kolontko Vitali
 */
public class SwitchTimer {
    private final Timer timer = new Timer();
    private DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    private Light[] lights;
    final int NUMBER_OF_LIGHTS;
    private int curIndex;
    private int prevIndex;
    private final int SEQUENCE_DURATION_IN_MILLISECONDS = 1000;
    
    /**
     * constructor requires array of type Light.
     * @param lights 
     */
    public SwitchTimer(Light[] lights){
        this.lights = lights;
        this.curIndex = 0;
        NUMBER_OF_LIGHTS = lights.length;
    }
    
    /**
     * switches isOn state of the light at a curIndex position
     * increments curIndex and prevIndex counters.
     */
    TimerTask switchLight = new TimerTask(){
        public void run(){ 
            prevIndex = (curIndex - 1) < 0 ? NUMBER_OF_LIGHTS - 1 : (curIndex - 1); // used to keep track of the previous integer of curIndex.
            String time = dateFormat.format(new Date()); //get current time
            
            //switches the light state only if its state is ON
            if(lights[prevIndex].getState() == "ON"){
                System.out.println(time + ": " + prevIndex + " " + lights[prevIndex].getColor() + " Light " + lights[prevIndex].flipSwitch());
            }
            System.out.println(time + ": " + curIndex + " " + lights[curIndex].getColor() + " Light " + lights[curIndex].flipSwitch());
            curIndex = (curIndex + 1) % lights.length;
        };
    };
    
    /**
    * runs the timer task at the given fixed rate.
    * timer starts with one second delay.
    */
    public void start(){
        timer.scheduleAtFixedRate(switchLight, new Date(),SEQUENCE_DURATION_IN_MILLISECONDS);
    }
}