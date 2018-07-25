package sg.edu.rp.dmsd.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvBox;
    ArrayList<boxlistItem> alBoxList;
    CustomAdapter caBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvBox = findViewById(R.id.lvBox);

        boxlistItem item1 = new boxlistItem(R.drawable.blue_box);
        boxlistItem item2 = new boxlistItem(R.drawable.orange_box);
        boxlistItem item3 = new boxlistItem(R.drawable.brown_box);
        alBoxList.add(item1);
        alBoxList.add(item2);
        alBoxList.add(item3);

        caBox = new CustomAdapter(this, R.layout.boxlist_item, alBoxList);

        lvBox.setAdapter(caBox);
    }
}
