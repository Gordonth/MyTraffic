package koregame.kaisorn.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 21/5/2560.
 */

public class MyAdapter extends BaseAdapter{

    private Context context;
    private String[] titleStrings, detailStrings;
    private int[] ints;
    private TextView titleTextView, detailTextView;
    private ImageView imageView;

    public MyAdapter(Context context,
                     String[] titleStrings,
                     String[] detailStrings,
                     int[] ints) {
        this.context = context;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
        this.ints = ints;
    }

    @Override
    public int getCount() {
        return titleStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.listview_layout, parent, false);

        //Initial View
        titleTextView = (TextView) view.findViewById(R.id.txtTitle);
        detailTextView = (TextView) view.findViewById(R.id.txtDetail);
        imageView = (ImageView) view.findViewById(R.id.imvIcon);

        //Show View
        titleTextView.setText(titleStrings[position]);

        String strShortDetail = detailStrings[position].substring(0, 35) + "...";
        detailTextView.setText(strShortDetail);

        imageView.setImageResource(ints[position]);

        return view;
    }
} // Main Class
