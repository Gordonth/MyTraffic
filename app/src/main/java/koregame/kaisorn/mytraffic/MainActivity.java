package koregame.kaisorn.mytraffic;

import android.content.Intent;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private MyData myData;
    private String[] titleStrings,detailString;
    private int[] ints;
    private ListView listView;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get Value for Mydata
        getValueMydata();

        //Creat List view
        createListView();


    } // Method Main

    private void createListView() {

        // Initial View
        listView = (ListView) findViewById(R.id.LivTraffic);
        MyAdapter myAdapter = new MyAdapter(this, titleStrings, detailString, ints);
        listView.setAdapter(myAdapter);

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               Intent intent = new Intent(MainActivity.this,DetailActivity.class);
               intent.putExtra("Title", titleStrings[position]);
               intent.putExtra("Detail", detailString[position]);
               intent.putExtra("Image", ints[position]);
               startActivity(intent);



           }
       });

    }

    private void getValueMydata() {
        myData = new MyData();
        titleStrings = myData.getTitleStrings();
        detailString = myData.getDetaiStrings();
        ints = myData.getInts();

        //Check Value
        String tag = "21Mayv1";
        String tag2 = "21Mayv2";

        for (int i = 0; i < titleStrings.length; i++) {
            Log.d(tag, "titleString(" + i + ")==>" + titleStrings[i]);
            Log.d(tag2, "detailString(" + i + ")==>" + detailString[i]);
        }

    }

}  // MAin Class
