package com.jiyun.pagedemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class MainActivity extends Activity {
    private SlidingMenu mMenu;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        initView();


    }

    public void toggleMenu(View view) {
        mMenu.toggle();
    }

    private void initView() {
        img = (ImageView) findViewById(R.id.img);
        mMenu = (SlidingMenu) findViewById(R.id.id_menu);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleMenu(view);
            }
        });
    }
}