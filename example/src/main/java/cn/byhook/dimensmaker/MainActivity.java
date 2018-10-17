package cn.byhook.dimensmaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupView();
    }

    private void setupView() {
        mTvMain = (TextView) findViewById(R.id.main_tv_info);

        DisplayMetrics metrics = getResources().getDisplayMetrics();

        StringBuilder builder = new StringBuilder();
        builder.append("分辨率: ")
                .append(metrics.widthPixels)
                .append("x")
                .append(metrics.heightPixels)
                .append("\r\n")
                .append("屏幕密度: ")
                .append(metrics.density)
                .append("\r\n")
                .append("屏幕像素密度: ")
                .append(metrics.densityDpi);

        mTvMain.setText(builder.toString());
    }
}
