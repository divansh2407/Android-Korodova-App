package cc.majhirockzz.provenance.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import cc.majhirockzz.provenance.R;

public class TeamAdapter extends BaseAdapter {
    private Context context;
    private final String[] mobileValues;

    public TeamAdapter(Context context, String[] mobileValues) {
        this.context = context;
        this.mobileValues = mobileValues;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {

            gridView = new View(context);

            // get layout from mobile.xml
            gridView = inflater.inflate(R.layout.team, null);

            // set value into textView
            TextView textView = gridView
                    .findViewById(R.id.grid_item_label);
            textView.setText(mobileValues[position]);

            // set image based on selected text
            ImageView imageView = gridView
                    .findViewById(R.id.grid_item_image);

            String mobile = mobileValues[position];

            if (mobile.equals("Mukesh")) {
                imageView.setImageResource(R.drawable.mukesh);
            } else if (mobile.equals("Nafees")) {
                imageView.setImageResource(R.drawable.nafees);
            }else if (mobile.equals("Anup")) {
                imageView.setImageResource(R.drawable.anup);
            }else if (mobile.equals("Rohit")) {
                imageView.setImageResource(R.drawable.rohit);
            }else if (mobile.equals("Sumit")) {
                imageView.setImageResource(R.drawable.sumit);
            }else if (mobile.equals("Sumesh")) {
                imageView.setImageResource(R.drawable.sumesh);
            }

        } else {
            gridView = (View) convertView;
        }

        return gridView;
    }

    @Override
    public int getCount() {
        return mobileValues.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

}
