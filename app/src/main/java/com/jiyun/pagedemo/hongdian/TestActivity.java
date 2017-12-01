package com.jiyun.pagedemo.hongdian;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.jiyun.pagedemo.R;

public class TestActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtn1;
    private BadgeView badgeView;
    int s = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        initView();
        initData();
    }

    private void initData() {
        badgeView = new BadgeView(this, mBtn1);

        badgeView.setText(""+1);
        badgeView.setBadgeBackgroundColor(Color.RED);
        badgeView.toggle();
    }

    private void initView() {
        mBtn1 = (Button) findViewById(R.id.mBtn1);
        mBtn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mBtn1:
                int i = Integer.valueOf(badgeView.getText().toString());
                i++;
                badgeView.setText(""+i);
                if (i==99){
                    badgeView.setText(""+99+"+");
                }
                break;
        }
    }
}
