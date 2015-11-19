package test.io.feeeei.circleseekbar;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import io.feeeei.circleseekbar.CircleSeekBar;


public class DownLoadActivity extends AppCompatActivity {

    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            int value = msg.what;
            mProgress.setCurProcess(value);
        }
    };

    private CircleSeekBar mProgress;

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_down_load);

        mProgress = (CircleSeekBar) findViewById(R.id.progress);
        mTextView = (TextView) findViewById(R.id.textview);

        mProgress.setOnSeekBarChangeListener(new CircleSeekBar.OnSeekBarChangeListener() {
            @Override
            public void onChanged(CircleSeekBar seekbar, int maxValue, int curValue) {
                mTextView.setText("value:" + curValue);
            }
        });

        mProgress.setCurProcess(0);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
    }


    private void start() {
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    mHandler.sendEmptyMessage(i);
                    SystemClock.sleep(16);
                }
            }
        }.start();
    }

}
