package com.example.handsonexam;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

public class SpinnerClass extends Activity implements AdapterView.OnItemSelectedListener {

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        String item = parent.getItemAtPosition(pos).toString();
        Toast.makeText(this, item + " selected", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

}
