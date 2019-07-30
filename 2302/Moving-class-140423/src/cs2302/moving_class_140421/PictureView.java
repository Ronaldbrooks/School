package cs2302.moving_class_140421;

import cs2302.pictures.Picture;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/**
 * This is a view that will hold one Picture and will
 * display it.
 * 
 * @author Ben Setzer
 *
 */
public class PictureView extends View {

	private Picture thePicture;
	
	public PictureView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public Picture getThePicture() {
		return thePicture;
	}

	public void setThePicture(Picture thePicture) {
		this.thePicture = thePicture;
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		if(thePicture != null) {
			thePicture.draw(canvas);
			System.out.printf("%dx%d\n", getWidth(), getHeight());
		}
	}
	
	

}
