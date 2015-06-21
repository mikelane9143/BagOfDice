package com.mikelane9143.gmstools.bagofdice.UI;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.mikelane9143.gmstools.bagofdice.DiceMan.DiceCup;
import com.mikelane9143.gmstools.bagofdice.R;


public class RollSelect extends Activity {

    private Button mRollButton;
    private EditText mD4;
    private EditText mD6;
    private EditText mD8;
    private EditText mD10;
    private EditText mD12;
    private EditText mD20;
    private DiceCup mDiceCup = new DiceCup();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roll_select);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
        mRollButton = (Button) findViewById(R.id.roll_Button);
        mD4 = (EditText) findViewById(R.id.d4_Number);
        mD6 = (EditText) findViewById(R.id.d6_Number);
        mD8 = (EditText) findViewById(R.id.d8_Number);
        mD10 = (EditText) findViewById(R.id.d10_Number);
        mD12 = (EditText) findViewById(R.id.d12_Number);
        mD20 = (EditText) findViewById(R.id.d20_Number);

        mRollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int d4 = Integer.parseInt(mD4.getText().toString());
                int d6 = Integer.parseInt(mD6.getText().toString());
                int d8 = Integer.parseInt(mD8.getText().toString());
                int d10 = Integer.parseInt(mD10.getText().toString());
                int d12 = Integer.parseInt(mD12.getText().toString());
                int d20 = Integer.parseInt(mD20.getText().toString());

                mDiceCup.fillCup(d4, d6, d8, d10, d12, d20);
                mDiceCup.shakeNRoll();


            }
        });
    }


    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_roll_select, container, false);
            return rootView;
        }

        public void onClickRoll(){
            // action the ROll button
        }

        public boolean validValues(){
            // check that at least one value of 1 or more has been given for the amount of dice and
            // check that there are no negative values.
            return true;

        }
    }
}
