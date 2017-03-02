package com.newgame.sdk;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by admin on 16/10/13.
 */
public class SecondActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SecondActivity.this.finish();
            }
        });

    }
}