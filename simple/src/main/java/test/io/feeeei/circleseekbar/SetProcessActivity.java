package test.io.feeeei.circleseekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import io.feeeei.circleseekbar.CircleSeekBar;

public class SetProcessActivity extends AppCompatActivity {

    private CircleSeekBar mSeekbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_process);

        mSeekbar = (CircleSeekBar) findViewById(R.id.seekbar);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int process = mSeekbar.getCurProcess();
                mSeekbar.setCurProcess(process += 10);
            }
        });
    }
}
