package com.spotify.music.homething.settings.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.spotify.music.C0707R;
import java.util.List;

class d extends ArrayAdapter<et9> {
    d(HomethingSettingsAdapter homethingSettingsAdapter, Context context, int i, List list) {
        super(context, i, list);
    }

    @Override // android.widget.ArrayAdapter, android.widget.SpinnerAdapter, android.widget.BaseAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) je.G(viewGroup, C0707R.layout.dropdown_setting_dropdown, viewGroup, false);
        Object item = getItem(i);
        item.getClass();
        textView.setText(((et9) item).name());
        return textView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) je.G(viewGroup, C0707R.layout.dropdown_setting, viewGroup, false);
        Object item = getItem(i);
        item.getClass();
        textView.setText(((et9) item).name());
        return textView;
    }
}
