package com.rohitchoudhary.a12thagriculturenotes;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private String[] items;
    private String[] urls;

    public CustomAdapter(Context context, String[] items, String[] urls) {
        this.context = context;
        this.items = items;
        this.urls = urls;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }

        // Serial number
        TextView tvSerial = convertView.findViewById(R.id.tvSerial);
        tvSerial.setText(String.valueOf(position + 1));

        // Item name
        TextView tvName = convertView.findViewById(R.id.tvName);
        tvName.setText(items[position]);

        // Handle item clicks
        convertView.setOnClickListener(v -> {
            String url = urls[position];
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            context.startActivity(intent);
        });

        return convertView;
    }
}
