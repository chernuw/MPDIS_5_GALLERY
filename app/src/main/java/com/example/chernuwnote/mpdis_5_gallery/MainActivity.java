package com.example.chernuwnote.mpdis_5_gallery;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends Activity {

    ListView listView;
    private ImageView selectedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selectedImage = (ImageView)findViewById(R.id.imageView1);

        listView = (ListView) findViewById(R.id.list);

        String[] values = new String[] {
                "Flowers",
                "gruwa",
                "les",
                "pole",
                "tlen",
                "yabloki"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {

                int itemPosition = arg2;
                String itemValue = (String) listView.getItemAtPosition(arg2);

                switch(itemPosition)
                {
                    case 0:
                        selectedImage.setImageResource(R.drawable.flowers);
                        break;

                    case 1:
                        selectedImage.setImageResource(R.drawable.gruwa);
                        break;

                    case 2:
                        selectedImage.setImageResource(R.drawable.les);
                        break;

                    case 3:
                        selectedImage.setImageResource(R.drawable.pole);
                        break;

                    case 4:
                        selectedImage.setImageResource(R.drawable.tlen);
                        break;

                    case 5:
                        selectedImage.setImageResource(R.drawable.yabloki);
                        break;
                }
            }
        });
    }

}
