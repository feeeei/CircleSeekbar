package test.io.feeeei.circleseekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import io.feeeei.circleseekbar.CircleSeekBar;

public class SetProcessActivity extends AppCompatActivity {

    private CircleSeekBar mProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_process);

        mProgress = (CircleSeekBar) findViewById(R.id.progress);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int process = mProgress.getCurProcess();
                mProgress.setCurProcess(process += 10);
            }
        });
    }
}
