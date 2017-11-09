package solirius;

/**
 *
 * @author Kolontko Vitali
 */
public class SoliriusLights {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //in a scenario where the colors could be very diverse and in large quantities (e.g. stored as hex numbers)
        //it instead would be best to have a seperate API for fetching all the values.
        String[] colors = {"Red", "Green", "White"};// all the possible colors that the lights can take 
        
        final int DEFAULT_NUMBER_OF_LIGHTS = 20;  // default number of lights
        int numOfColors = colors.length; // number of possible colors
        int numOfLights = DEFAULT_NUMBER_OF_LIGHTS;
        
        //number given through parameter is ensured to be a proper, positive integer.
        try{
            if(Integer.parseInt(args[0]) > 0){
                numOfLights = Integer.parseInt(args[0]);
            }
        }catch (NumberFormatException e){
        }catch (ArrayIndexOutOfBoundsException e){}
        
        // Array of Lights initialization
        Light[] lights = new Light[numOfLights];
        for(int i = 0; i < numOfLights; i++){
            lights[i] = new Light(colors[i%numOfColors]);
        }
        
        SwitchTimer timer = new SwitchTimer(lights);
        timer.start();
    }    
}