package com.example.a20182.demoapplication;

/**
 * The Adapter for the ListView in MainActivity,
 * Import the monitor_item layout into listview.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class DemoAdapter extends BaseAdapter {
    private List<Demo> apps;
    private LayoutInflater inflater;

    public DemoAdapter(Context context, List<Demo> infos) {
        this.apps = infos;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return apps.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.demo_item, null);
            holder.name = (TextView) convertView.findViewById(R.id.demo_name);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.name.setText(apps.get(position).getName());


        return convertView;
    }


    class ViewHolder {
        TextView name;
    }
}
