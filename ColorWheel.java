import java.awt.*;
import java.util.*;
//this program creates a continuious ColorWheel and an animation of it


public class ColorWheel{

	//create panel with dimensions of 512 by 512
	public static DrawingPanel panel = new DrawingPanel(512,512);

	//create an instance of the Graphics class; name it variable g 
	//variable g is used to set color and fill arc
	public static Graphics2D g = panel.getGraphics();
	public static void main(String[] args){
		//adjust brightness through for loop
		//this for loop is being called 500 times; However, the number can be changed to adjust the duration of the animation
		//the number of times the loop is being called is proportional to how long the animation runs: more times = longer animation and vice versa
		for(int b=0; b<500; b++){
			//the brightness level will be random each time the for loop runs; Math.random is used because it generates values between 0.0-1.0, which is the range for brightness 
			float brightness = (float)(Math.random());
			//call the createColorWheel method with the randomly generated brightness
			createColorWheel(brightness);
		}
		//call the createColorWheel method one last time and send it a full brightness parameter so that the animation ends off with a circle with full brightness
		createColorWheel((float)1.0);
	}
	//this method creates the color wheel; it takes in the parameter for brightness(the value should be in between 0.0-1.0)
	public static void createColorWheel(float brightness){
		//this for loop runs once for every degree in a circle, so 360 times
		//each degree has an arc with a different color
		for(int i=0; i<360; i++){
			//the hue depends on what degree of the circle is being represented; each degree has its own corresponding hue
			float hue = (float)(i/360.0);
			//the saturation is a constant variable
			//HSB accepts the values for hue, saturation, and brightness; hue of 0.0 is red, the rest of the colors in the spectrum being displayed at other values
			g.setColor(Color.getHSBColor(hue,1.0f,brightness));
			//the circle will start at (140,140) and have a width and height of 200
			g.fillArc(140,140, 200,200,i,1);

		}
	}
	

}