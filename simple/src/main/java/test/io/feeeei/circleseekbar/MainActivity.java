package test.io.feeeei.circleseekbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;

    private Class[] mClasses = new Class[] {InflateActivity.class, Style1Activity.class, Style2Activity.class,
            WithShadowActivity.class, SetProcessActivity.class, WithTextActivity.class, DownLoadActivity.class,
            UnionActivity.class, SetEnableActivity.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.listview);

        mListView.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, mClasses) {
            @Override
            public String getItem(int position) {
                return mClasses[position].getSimpleName();
            }
        });

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, mClasses[position]);

                startActivity(intent);
            }
        });
    }
}
