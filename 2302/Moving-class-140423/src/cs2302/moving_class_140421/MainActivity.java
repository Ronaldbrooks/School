package cs2302.moving_class_140421;

import cs2302.pictures.Circle;
import cs2302.pictures.Composite;
import cs2302.pictures.Group;
import cs2302.pictures.PicPoint;
import cs2302.pictures.Picture;
import cs2302.pictures.Rectangle;
import cs2302.pictures.Triangle;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class MainActivity extends Activity {

	// defined for efficiency
	private Picture thePicture;
	private PictureView thePV;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// create picture and put it in the picture view
		// create picture
		PicPoint cbase = new PicPoint(200,150);
		float radius = 75;
		Paint cfill = new Paint();
		cfill.setColor(Color.rgb(200, 200, 255));
		cfill.setStyle(Style.FILL);
		Paint coutline = new Paint();
		coutline.setColor(Color.rgb(0, 128, 0)); // dark green
		coutline.setStyle(Style.STROKE);
		coutline.setStrokeWidth(5);
		Circle c = new Circle(cbase, radius, cfill, coutline);
		
		PicPoint rbase = new PicPoint(100, 100);
		float width = 200;
		float height = 100;
		Paint rfill = new Paint();
		rfill.setColor(Color.rgb(200,255,200));
		rfill.setStyle(Style.FILL);
		Paint routline = new Paint();
		routline.setColor(Color.rgb(0,0,128));
		routline.setStyle(Style.STROKE);
		routline.setStrokeWidth(5);
		Rectangle rect = new Rectangle(rbase, width, height, rfill, routline);
		
	
		PicPoint v0 = new PicPoint(150,250);
		PicPoint v1 = new PicPoint(150,200);
		PicPoint v2 = new PicPoint(200,250);
		Paint tfill = new Paint();
		tfill.setColor(Color.rgb(0, 0, 200));
		tfill.setStyle(Style.FILL);
		Paint toutline = new Paint();
		toutline.setColor(Color.rgb(128,0,0));
		toutline.setStyle(Style.STROKE);
		toutline.setStrokeWidth(5);
		Triangle tri = new Triangle(v2, v1, v0, tfill, toutline);
		
		
	
		PicPoint compbase = new PicPoint(0,0);
		Composite comp = new Composite(compbase);
		comp.addPicture(rect);
		comp.addPicture(c);
		comp.addPicture(tri);
		thePicture = comp;  
		
//		Group grp = new Group();
//		grp.addPicture(rect);
//		grp.addPicture(c);
//		thePicture = grp;
		
		thePV = (PictureView)findViewById(R.id.pictureView1);
		thePV.setThePicture(thePicture);
		
		thePV.setOnTouchListener(picTouch);
		
	}

	/**
	 * Use an anonymous class declaration.
	 */
	private OnTouchListener picTouch = new OnTouchListener() {
		
		/**
		 * This will be null to begin with (default value).
		 * It will be set to the picture being dragged when a drag starts.
		 * It will be set back to null when the drag finishes.
		 * 
		 * That means we can tell if a drag is in progress by checking if this
		 * is null or not.
		 */
		private Picture pictureBeingDragged;
		/**
		 * Where was the last motion event.
		 * This is only meaningful during a drag operation.
		 */
		private PicPoint lastTouch;
		
		@Override
		public boolean onTouch(View v, MotionEvent event) {
//			PicPoint base = thePicture.getBase();
//			thePicture.moveRelative(event.getX()-base.getX(), event.getY()-base.getY());
//			thePV.invalidate();
			
			int action = event.getActionMasked();
			if(action == MotionEvent.ACTION_DOWN) {
				// touch down
				// determine if a picture is being touched
				// if so set up for the drag operation
				Picture pic = thePicture.getTouched(event.getX(), event.getY());
				if(pic != null) {
					// touched a picture, so start the drag
					// to carry out the drag we need to keep track of a couple of things:
					//		where the last motion event took place
					//		which picture are we moving
					// at this point, we will only be able to drag simple geometric
					//    shapes, not composites
					// 
					//  Where do we store the information we need to keep?
					//  The variable 'pic' references the picture that will be moved.
					//		what happens to pic when this method is done?   Goes away
					//		   That doesn't destroy picture, since we have other
					//			references to it
					//			But, this means we can't use pic to keep track of the picture
					//			we are dragging.
					//  We will provide an instance field to store the picture being dragged.
					pictureBeingDragged = pic; 
					lastTouch = new PicPoint(event.getX(), event.getY());
				} else {
					// did not touch a picture, don't do anything
					// pictureBeingDragged will continue to be null
				}
			
			} else if(action == MotionEvent.ACTION_MOVE) {
				// move while touching
				// if a drag operation is in progress, move the picture
				if(pictureBeingDragged != null) {
					// drag operation in progress
					PicPoint currentTouch = new PicPoint(event.getX(), event.getY());
					float dx = currentTouch.getX() - lastTouch.getX();
					float dy = currentTouch.getY() - lastTouch.getY();
					pictureBeingDragged.moveRelative(dx, dy);
					lastTouch = currentTouch;
					thePV.invalidate();
				} else {
					// no drag operation in progress
				}
				
			} else if(action == MotionEvent.ACTION_UP) {
				// lose touch
				// if a drag operation is in progress, clean up
				pictureBeingDragged = null;
			} else {
				
			}
			
			return true;
		}
	};
	

}






