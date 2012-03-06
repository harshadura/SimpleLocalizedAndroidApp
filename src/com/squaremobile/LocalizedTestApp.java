package com.squaremobile;

import com.squaremobile.R;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class LocalizedTestApp extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView txt = (TextView) findViewById(R.id.sinhala_font2);  
        Typeface font = Typeface.createFromAsset(getAssets(), "amal.TTF");  
        txt.setTypeface(font);
    }
}