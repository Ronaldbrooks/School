package cs2302.bubbles_140418;


import java.util.Random;

import cs2302.bubbles_140414.R;
import cs2302.pictures.Picture;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.SlidingDrawer;

public class MainActivity extends Activity {

	private Bubbles bubs;
	private final int INITIAL_NUMBER_OF_BUBBLES = 5;
	private PictureView pv;
	private long delay = 500; // milliseconds delay between bubbles being created
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// the bounds are not good ones, but 
		bubs = new Bubbles(760, 1080, 20);
		for(int i = 0; i < INITIAL_NUMBER_OF_BUBBLES; i++ ) {
			bubs.addBubbleAtRandom();
			
		}
		
		pv = (PictureView)findViewById(R.id.pictureView);
		pv.setThePicture(bubs);
		BubblePopListener bpl = new BubblePopListener();
		pv.setOnTouchListener(bpl);
		
		Thread makeBubs = new Thread(new MakeBubbles());
		makeBubs.start();
	}

	private class BubblePopListener implements OnTouchListener {

		@Override
		public boolean onTouch(View v, MotionEvent event) {
			int action = event.getActionMasked();
			if(action == MotionEvent.ACTION_DOWN) {
				Picture pic = bubs.getTouched(event.getX(), event.getY());
				if(pic != null) {
					bubs.removeBubble(pic);
				} 
				
				pv.invalidate();
			}
			return false;
		}
		
	}
	
	private boolean makeBubblesIsRunning = true;
	
	private class MakeBubbles implements Runnable {

		@Override
		public void run() {
			while(makeBubblesIsRunning) {
				bubs.addBubbleAtRandom();
				pv.postInvalidate();
				try {
					Thread.sleep(delay);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
