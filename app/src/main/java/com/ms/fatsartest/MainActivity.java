package com.ms.fatsartest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String ADJUST_URL = "https://app.adjust.com/jgcx7a";
    private static final String GOOD_AD_URL = "http://click.goodadtracking.com/link/b8JfcK";

    Button mButtonAdjust;
    Button mButtonGoodAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonAdjust = findViewById(R.id.bt_adjust);
        mButtonGoodAd = findViewById(R.id.bt_good);
        mButtonAdjust.setOnClickListener(this);
        mButtonGoodAd.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt_adjust:
                Intent adjustIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(ADJUST_URL));
                startActivity(adjustIntent);
                break;
            case R.id.bt_good:
                Intent goodAdIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(GOOD_AD_URL));
                startActivity(goodAdIntent);
                break;
        }
    }
}
