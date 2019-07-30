package cs2302.loancalc_in_class_140228;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// register a calculate button listener
		CalculateButtonListener cbl = new CalculateButtonListener();
		Button calcBTN = (Button) findViewById(R.id.calcBTN);
		calcBTN.setOnClickListener(cbl);
		
		
	}

	public static final int MIN_NUM_MONTHS = 12;
	public static final int MAX_NUM_MONTHS = 360;
	
	private class CalculateButtonListener implements OnClickListener {

		@Override
		public void onClick(View v) {
			// Gather information
			// Get the initial balance
			//  challenge: input is text which must be converted to numeric
			EditText balET = (EditText) findViewById(R.id.initBalET);
			Editable balEdbl = balET.getText();
			String balStr = balEdbl.toString();
			double initBal = Double.parseDouble(balStr);
				// can cause errors if the string is not the proper format for a double
			
			// Get the number of months
			//  challenge: must shift the value to actual number of months
			SeekBar numMonthsSB = (SeekBar) findViewById(R.id.numMonthsSB);
			int progress = numMonthsSB.getProgress();
			//    this will be in the range 0 to 348 inclusive
			int numMonths = progress + MIN_NUM_MONTHS;
			
			// Get the interest rate
			//   challenge: deal with figuring out which button is selected
			RadioGroup airRG = (RadioGroup) findViewById(R.id.airRG);
			int checkedID = airRG.getCheckedRadioButtonId();
			double air;
			if(checkedID == R.id.air0RB) {
				air = .05;
			} else if(checkedID == R.id.air1RB) {
				air = .08;
			} else if(checkedID == R.id.air2RB) {
				air = .12;
			} else if(checkedID == R.id.air3RB) {
				air = .18;
			} else {
				// this had better not happen!!!
				air = -123456.78901;
			}
			
			// calculate payment
			double monthlyIR = air / 12;
			double numerator = initBal * monthlyIR;
			double denominator = 1 - Math.pow(1+monthlyIR, -numMonths);
			double payment = numerator/denominator;
			
			// output
			EditText paymentET = (EditText) findViewById(R.id.paymentET);
			paymentET.setText(payment + "");
			EditText numMonthsET = (EditText) findViewById(R.id.numMonthsET);
			numMonthsET.setText(numMonths + "");
		}
		
	}

	private class SeekBarListener implements OnSeekBarChangeListener {

		@Override
		public void onProgressChanged(SeekBar seekBar, int progress,
				boolean fromUser) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onStartTrackingTouch(SeekBar seekBar) {
			// do nothing
		}

		@Override
		public void onStopTrackingTouch(SeekBar seekBar) {
			// do nothing
		}
		
	}
	
	
}
