package com.crhsi.ylkjcjq.activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.crhsi.ylkjcjq.R;
import com.zhy.autolayout.AutoLayoutActivity;

public class TravelLineActivity extends AutoLayoutActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_line);
        initView();
    }

    private void initView() {
        TextView tv_title = (TextView)findViewById(R.id.tv_title);
        tv_title.setText("线路优选");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_close:
                finish();
                break;
            case R.id.dibioazhilv:
                startActivity(new Intent(this,DiBiaoZhiLvActivity.class));
                break;
        }
    }
}
