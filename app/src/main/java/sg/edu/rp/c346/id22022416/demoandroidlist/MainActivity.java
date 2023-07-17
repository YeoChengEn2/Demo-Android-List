package sg.edu.rp.c346.id22022416.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<AndroidVersion> versions;
    //ArrayAdapter<AndroidVersion> adapter1;
    CustomAdapter adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);
        versions = new ArrayList<>();

        AndroidVersion item1 = new AndroidVersion("Pie", "9.0");
        AndroidVersion item2 = new AndroidVersion("Oreo", "8.0 - 8.1");
        AndroidVersion item3 = new AndroidVersion("Nougat", "7.0 - 7.1.2");

        versions.add(item1);
        versions.add(item2);
        versions.add(item3);

        //adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, versions);
        adapter2 = new CustomAdapter(this, R.layout.row, versions);
        //lv.setAdapter(adapter1);
        lv.setAdapter(adapter2);
    }
}