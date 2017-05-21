package koregame.kaisorn.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // For Back
        forBack();

        //Show View
        TextView titlTextView = (TextView) findViewById(R.id.txtTitle);
        TextView detaiTextView = (TextView) findViewById(R.id.txtDetail);
        ImageView trafImageView = (ImageView) findViewById(R.id.imvTraffic);

        titlTextView.setText(getIntent().getStringExtra("Title"));
        detaiTextView.setText(getIntent().getStringExtra("Detail"));
        trafImageView.setImageResource(getIntent().getIntExtra("Image", R.drawable.traffic_01));





    }  //Main Method

    private void forBack() {
        ImageView backImageView = (ImageView) findViewById(R.id.imvBack);
        backImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}  //Main Class
