package cs2302.diamonds;

import cs2302.simplepolygonalpath.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// PolygonalPathView ppv = new PolygonalPathView(this,null);
		// DiamondView dv = new DiamondView(this, null);
		// setContentView(dv);
		setContentView(R.layout.activity_main);
		SeekBar numSB = (SeekBar) findViewById(R.id.numDiamSB);
		NumberOfDiamondsListener nodl = new NumberOfDiamondsListener();
		numSB.setOnSeekBarChangeListener(nodl);
		int initNumDiamonds = 1;
		numSB.setProgress(initNumDiamonds);
		DiamondView dv = (DiamondView) findViewById(R.id.diamondView1);
		dv.setNumDiamonds(initNumDiamonds);

		SeekBar colorSB = (SeekBar) findViewById(R.id.colorVSB);
		colorVListener colorV = new colorVListener();
		colorSB.setOnSeekBarChangeListener(colorV);
		int initColorV = 1;
		colorSB.setProgress(initColorV);
		

	}

	private class NumberOfDiamondsListener implements OnSeekBarChangeListener {

		@Override
		public void onProgressChanged(SeekBar seekBar, int progress,
				boolean fromUser) {
			DiamondView dv = (DiamondView) findViewById(R.id.diamondView1);
			dv.setNumDiamonds(progress);
			dv.invalidate();
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

	private class colorVListener implements OnSeekBarChangeListener {

		@Override
		public void onProgressChanged(SeekBar seekBar, int progress,
				boolean fromUser) {
			DiamondView dv = (DiamondView) findViewById(R.id.diamondView1);
			dv.setColorV(progress/100f);
			dv.invalidate();
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
