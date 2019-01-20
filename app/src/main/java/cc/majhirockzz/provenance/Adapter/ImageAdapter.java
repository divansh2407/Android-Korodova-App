package cc.majhirockzz.provenance.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import cc.majhirockzz.provenance.R;

public class ImageAdapter extends BaseAdapter {
    private Context context;
    private final String[] mobileValues;

    public ImageAdapter(Context context, String[] mobileValues) {
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
            gridView = inflater.inflate(R.layout.sponsor, null);

            // set value into textView
            TextView textView = gridView
                    .findViewById(R.id.grid_item_label);
            textView.setText(mobileValues[position]);

            // set image based on selected text
            ImageView imageView = gridView
                    .findViewById(R.id.grid_item_image);

            String mobile = mobileValues[position];

            if (mobile.equals("Flipkart")) {
                imageView.setImageResource(R.drawable.flipkart);
            } else if (mobile.equals("Google")) {
                imageView.setImageResource(R.drawable.google);
            } else if (mobile.equals("Facebook")) {
                imageView.setImageResource(R.drawable.facebook);
            }else if (mobile.equals("Amazon")) {
                imageView.setImageResource(R.drawable.amazon);
            }else if (mobile.equals("Asus")) {
                imageView.setImageResource(R.drawable.asus);
            }else if (mobile.equals("ClashRoyal")) {
                imageView.setImageResource(R.drawable.clashroyal);
            }else if (mobile.equals("Cnet")) {
                imageView.setImageResource(R.drawable.cnet);
            }else if (mobile.equals("Nvidia")) {
                imageView.setImageResource(R.drawable.nvidia);
            }else if (mobile.equals("Rog")) {
                imageView.setImageResource(R.drawable.rog);
            }else if (mobile.equals("Youtube")) {
                imageView.setImageResource(R.drawable.youtube);
            }else if (mobile.equals("Moto")) {
                imageView.setImageResource(R.drawable.moto);
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