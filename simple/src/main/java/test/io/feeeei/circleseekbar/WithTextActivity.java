package test.io.feeeei.circleseekbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import io.feeeei.circleseekbar.CircleSeekBar;


public class WithTextActivity extends AppCompatActivity {

    private CircleSeekBar mSeekbar;

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_text);

        mSeekbar = (CircleSeekBar) findViewById(R.id.seekbar);
        mTextView = (TextView) findViewById(R.id.textview);

        mSeekbar.setOnSeekBarChangeListener(new CircleSeekBar.OnSeekBarChangeListener() {
            @Override
            public void onChanged(CircleSeekBar seekbar, int curValue) {
                mTextView.setText("value:" + curValue);
            }
        });

        mSeekbar.setCurProcess(0);
    }

}
