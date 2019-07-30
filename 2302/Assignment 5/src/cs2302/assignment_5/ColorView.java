package cs2302.assignment_5;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;

public class ColorView extends View {
	
	private float colorR = 1;
	private float colorG = 1;
	private float colorB = 1;
	private float colorH = 1;
	private float colorS = 1;
	private float colorV = 1;
	
	public ColorView(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		float hsv[] = new float[3];
		hsv[2] = colorV; // value, brightness
		hsv[1] = colorS; // between 0 and 1 is fine for saturation
		hsv[0] = colorH; // between 0 and 360, for the hue
		int color = Color.HSVToColor(hsv);
	}
	
	public void setColorG(float f) {
	}

	public void setColorB(float f) {		
	}

	public void setColorR(float f) {
	}

	public void setColorH(float f) {
	}

	public void setColorS(float f) {
	}

	public void setColorV(float f) {	
	}
}
