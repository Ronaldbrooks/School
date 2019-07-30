package cs2302.rbrooks_rectanglecomputationlab;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	private class areaButtonListener implements OnClickListener {

		@Override
		public void onClick(View v) {

			EditText widthET = (EditText) findViewById(R.id.widthET);
			Editable widEdbl = widthET.getText();
			String widStr = widEdbl.toString();
			double intwid = Double.parseDouble(widStr);

			EditText heightET = (EditText) findViewById(R.id.heightET);
			Editable heightEdbl = heightET.getText();
			String heightStr = heightEdbl.toString();
			double intheight = Double.parseDouble(heightStr);

			// calculate area
			double area = intwid * intheight;

			EditText resultET = (EditText) findViewById(R.id.resultET);
			resultET.setText(area + " ");

		}

		private class parameterButtonListener implements OnClickListener {

			@Override
			public void onClick(View v) {

				EditText widthET = (EditText) findViewById(R.id.widthET);
				Editable widEdbl = widthET.getText();
				String widStr = widEdbl.toString();
				double intwid = Double.parseDouble(widStr);

				EditText heightET = (EditText) findViewById(R.id.heightET);
				Editable heightEdbl = heightET.getText();
				String heightStr = heightEdbl.toString();
				double intheight = Double.parseDouble(heightStr);

				//calculate parameter
				double parameter = (intheight*2) + (intwid * 2); 

				EditText resultET = (EditText) findViewById(R.id.resultET);
				resultET.setText(parameter + " ");

			}

			private class inradiusButtonListener implements OnClickListener {

				@Override
				public void onClick(View v) {

					EditText widthET = (EditText) findViewById(R.id.widthET);
					Editable widEdbl = widthET.getText();
					String widStr = widEdbl.toString();
					double intwid = Double.parseDouble(widStr);

					EditText heightET = (EditText) findViewById(R.id.heightET);
					Editable heightEdbl = heightET.getText();
					String heightStr = heightEdbl.toString();
					double intheight = Double.parseDouble(heightStr);


			//calculate radius
				double radius;
				if (intwid > intheight) {
					radius = intwid/2;
				} else {
					radius = intheight/2;;
				}
					EditText resultET = (EditText) findViewById(R.id.resultET);
					resultET.setText(radius + " ");

				}
			}
		}
	}
}
