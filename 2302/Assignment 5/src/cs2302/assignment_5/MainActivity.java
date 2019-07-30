package cs2302.assignment_5;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		SeekBar red = (SeekBar) findViewById(R.id.colorRSB); // 1
		colorRListener colorR = new colorRListener();
		red.setOnSeekBarChangeListener(colorR);

		SeekBar green = (SeekBar) findViewById(R.id.colorGSB); // 2
		colorGListener colorG = new colorGListener();
		green.setOnSeekBarChangeListener(colorG);

		SeekBar blue = (SeekBar) findViewById(R.id.colorBSB); // 3
		colorBListener colorB = new colorBListener();
		blue.setOnSeekBarChangeListener(colorB);

		SeekBar hue = (SeekBar) findViewById(R.id.colorHueSB); // 4
		hueListener colorH = new hueListener();
		hue.setOnSeekBarChangeListener(colorH);

		SeekBar sat = (SeekBar) findViewById(R.id.colorSatSB); // 5
		satListener colorS = new satListener();
		sat.setOnSeekBarChangeListener(colorS);

		SeekBar value = (SeekBar) findViewById(R.id.colorVSB); // 6
		valueListener colorV = new valueListener();
		value.setOnSeekBarChangeListener(colorV);

	}

	// hue
	private class hueListener implements OnSeekBarChangeListener {

		@Override
		public void onProgressChanged(SeekBar seekBar, int progress,
				boolean fromUser) {
			ColorView cv = (ColorView) findViewById(R.id.viewBox);
			cv.setColorH(progress / 100f);
			cv.invalidate();
		}

		@Override
		public void onStartTrackingTouch(SeekBar seekBar) {
			// not used
		}

		@Override
		public void onStopTrackingTouch(SeekBar seekBar) {
			// not used

		}
	}
	// saturation
	private class satListener implements OnSeekBarChangeListener {

		@Override
		public void onProgressChanged(SeekBar seekBar, int progress,
				boolean fromUser) {
			ColorView cv = (ColorView) findViewById(R.id.viewBox);
			cv.setColorS(progress / 100f);
			cv.invalidate();
		}

		@Override
		public void onStartTrackingTouch(SeekBar seekBar) {
			// not used
		}

		@Override
		public void onStopTrackingTouch(SeekBar seekBar) {
			// not used

		}
	}
	// value
	private class valueListener implements OnSeekBarChangeListener {

		@Override
		public void onProgressChanged(SeekBar seekBar, int progress,
				boolean fromUser) {
			ColorView cv = (ColorView) findViewById(R.id.viewBox);
			cv.setColorV(progress / 100f);
			cv.invalidate();
		}

		@Override
		public void onStartTrackingTouch(SeekBar seekBar) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onStopTrackingTouch(SeekBar seekBar) {
			// TODO Auto-generated method stub
			
		}
	}

	// red
	private class colorRListener implements OnSeekBarChangeListener {

		@Override
		public void onProgressChanged(SeekBar seekBar,
				int progress, boolean fromUser) {
			ColorView cv = (ColorView) findViewById(R.id.viewBox);
			cv.setColorR(progress / 100f);
			cv.invalidate();
			}

		@Override
		public void onStartTrackingTouch(SeekBar seekBar) {
			// not used
		}
		@Override
		public void onStopTrackingTouch(SeekBar seekBar) {
			// not used

		}
	}
	// green
	private class colorGListener implements	OnSeekBarChangeListener {

		@Override
		public void onProgressChanged(SeekBar seekBar,
				int progress, boolean fromUser) {
			ColorView cv = (ColorView) findViewById(R.id.viewBox);
			cv.setColorG(progress / 100f);
			cv.invalidate();
		}

		@Override
		public void onStartTrackingTouch(SeekBar seekBar) {
			// not used
		}

		@Override
		public void onStopTrackingTouch(SeekBar seekBar) {
			// not used

		}
	}

	// blue
	private class colorBListener implements OnSeekBarChangeListener {

		@Override
		public void onProgressChanged(SeekBar seekBar,
				int progress, boolean fromUser) {
			ColorView cv = (ColorView) findViewById(R.id.viewBox);
			cv.setColorB(progress / 100f);
			cv.invalidate();
		}

		@Override
		public void onStartTrackingTouch(SeekBar seekBar) {
			// not used
		}

		@Override
		public void onStopTrackingTouch(SeekBar seekBar) {
			// not used

		}
	}
}


