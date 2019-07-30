package cs2302.diamonds;

import java.util.Random;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class DiamondView extends View {

	private int numDiamonds = 100;
	private float colorV = 1;

	public DiamondView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	private static Random gen = new Random();

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		Paint pnt = new Paint();

		int width = this.getWidth();
		int height = this.getHeight();
		for (int i = 0; i < numDiamonds; i++) {
			float left = gen.nextFloat() * width;
			float right = gen.nextFloat() * (width - left) + left;
			// We have (width-left) space available to the right of 'left'
			// So, multiply by nextFloat (between 0 and 1) to get the proportion
			// we will use (this is the width of the diamond)
			// Add 'left' so move that over
			float top = gen.nextFloat() * height;
			float bottom = gen.nextFloat() * (height - top) + top;
			float hsv[] = new float[3];
			hsv[2] = colorV; // value, brightness
			hsv[1] = gen.nextFloat(); // between 0 and 1 is fine for saturation
			hsv[0] = 360 * gen.nextFloat(); // between 0 and 360, for the hue
			int color = Color.HSVToColor(hsv);
			pnt.setColor(color);
			drawDiamond(canvas, left, top, right, bottom, pnt);
		}
		// pnt.setColor(Color.CYAN);
		// drawDiamond(canvas, 100, 100, 300, 500, pnt);

	}

	/**
	 * Draws a diamond. The diamond is based on the rectangle with the given
	 * left, top, right, bottom sides. The diamond connects the middles of those
	 * sides.
	 * 
	 * left < right top < bottom
	 */
	public static void drawDiamond(Canvas canvas, float left, float top,
			float right, float bottom, Paint paint) {
		Path pth = new Path();
		pth.moveTo(left, (top + bottom) / 2); // middle of left side
		pth.lineTo((left + right) / 2, top); // middle of the top side
		pth.lineTo(right, (top + bottom) / 2); // middle of the right side
		pth.lineTo((left + right) / 2, bottom); // middle of the bottom side
		pth.close();
		canvas.drawPath(pth, paint);
	}

	public int getNumDiamonds() {
		return numDiamonds;
	}

	public void setNumDiamonds(int numDiamonds) {
		this.numDiamonds = numDiamonds;
	}

	public float getColorV() {
		return colorV;
	}

	public void setColorV(float colorV) {
		this.colorV = colorV;
	}

}
