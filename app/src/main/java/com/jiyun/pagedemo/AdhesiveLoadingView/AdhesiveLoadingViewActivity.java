package com.jiyun.pagedemo.AdhesiveLoadingView;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.jiyun.pagedemo.R;

public class AdhesiveLoadingViewActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adhesive_loading_view);
        btn = (Button) findViewById(R.id.btn);

        RelativeLayout layout = new RelativeLayout(AdhesiveLoadingViewActivity.this);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.CENTER_IN_PARENT);
        layout.addView(new AdhesionLoadingView(AdhesiveLoadingViewActivity.this), params);
        final AlertDialog dialog = new AlertDialog.Builder(AdhesiveLoadingViewActivity.this)
                .setView(layout)
                .create();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show();
            }
        });
    }
}

