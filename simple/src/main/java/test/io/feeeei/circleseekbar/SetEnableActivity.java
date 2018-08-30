package test.io.feeeei.circleseekbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import io.feeeei.circleseekbar.CircleSeekBar;

public class SetEnableActivity extends AppCompatActivity {
    private CircleSeekBar mHourSeekbar;

    private CircleSeekBar mMinuteSeekbar;

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_enable);

        mHourSeekbar = (CircleSeekBar) findViewById(R.id.seek_hour);
        mMinuteSeekbar = (CircleSeekBar) findViewById(R.id.seek_minute);
        mTextView = (TextView) findViewById(R.id.textview);

        mHourSeekbar.setOnSeekBarChangeListener(new CircleSeekBar.OnSeekBarChangeListener() {
            @Override
            public void onChanged(CircleSeekBar seekbar, int curValue) {
                changeText(curValue, mMinuteSeekbar.getCurProcess());
            }
        });

        mMinuteSeekbar.setOnSeekBarChangeListener(new CircleSeekBar.OnSeekBarChangeListener() {
            @Override
            public void onChanged(CircleSeekBar seekbar, int curValue) {
                changeText(mHourSeekbar.getCurProcess(), curValue);
            }
        });

        mHourSeekbar.setCurProcess(5);

        mMinuteSeekbar.setCurProcess(30);

        Switch swEnable = (Switch) findViewById(R.id.sw_enable);

        enableSeekbars(swEnable.isChecked());

        swEnable.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                enableSeekbars(b);
            }
        });
    }

    private void enableSeekbars(boolean enable) {
        mHourSeekbar.setEnabled(enable);
        mMinuteSeekbar.setEnabled(enable);
    }

    private void changeText(int hour, int minute) {
        String hourStr = hour > 9 ? hour + "" : "0" + hour;
        String minuteStr = minute > 9 ? minute + "" : "0" + minute;
        mTextView.setText(hourStr + ":" + minuteStr);
    }
}
