package com.spotify.music.util.filterheader;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.List;

public class a extends ArrayAdapter<b> {
    public a(Context context, List<b> list) {
        super(context, 17367043, list);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = e90.i;
        t90 t90 = (t90) l70.p(view, t90.class);
        if (t90 == null) {
            t90 = e90.d().f(getContext(), viewGroup);
        }
        b bVar = (b) getItem(i);
        if (bVar.c()) {
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(getContext(), SpotifyIconV2.CHECK, (float) getContext().getResources().getDimensionPixelSize(C0707R.dimen.filter_list_popup_icon_height));
            spotifyIconDrawable.r(androidx.core.content.a.b(getContext(), R.color.gray_50));
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(spotifyIconDrawable);
            t90.z0(imageView);
        } else {
            t90.z0(null);
        }
        t90.setText(getContext().getString(bVar.b()));
        return t90.getView();
    }
}
