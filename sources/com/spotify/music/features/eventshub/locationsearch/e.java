package com.spotify.music.features.eventshub.locationsearch;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.spotify.music.features.eventshub.locationsearch.model.Location;

public class e extends ArrayAdapter<Location> {
    public e(Context context) {
        super(context, 0);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        Location location = (Location) getItem(i);
        int i2 = e90.i;
        t90 t90 = (t90) l70.p(view, t90.class);
        if (t90 == null) {
            t90 = e90.d().c(getContext(), viewGroup);
        }
        t90.setText(location.mLocationName);
        t90.getView().setTag(location);
        return t90.getView();
    }
}
