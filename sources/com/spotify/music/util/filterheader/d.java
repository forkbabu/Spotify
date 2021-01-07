package com.spotify.music.util.filterheader;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.List;

public class d extends ArrayAdapter<SortOption> {
    private final List<SortOption> a;
    private int b;

    public d(Context context, List<SortOption> list, int i) {
        super(context, 17367043, list);
        this.b = i;
        this.a = list;
    }

    private View a(SpotifyIcon spotifyIcon) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(getContext(), spotifyIcon, getContext().getResources().getDimension(C0707R.dimen.filter_list_popup_icon_height));
        spotifyIconDrawable.r(a.b(getContext(), R.color.gray_50));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(spotifyIconDrawable);
        return imageView;
    }

    public int b() {
        return this.b;
    }

    public void c(int i) {
        if (this.b != i) {
            this.b = i;
            notifyDataSetChanged();
        }
    }

    public void d(SortOption sortOption) {
        int indexOf = this.a.indexOf(sortOption);
        if (this.b != indexOf) {
            this.b = indexOf;
            notifyDataSetChanged();
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = e90.i;
        t90 t90 = (t90) l70.p(view, t90.class);
        if (t90 == null) {
            t90 = e90.d().f(getContext(), viewGroup);
        }
        SortOption sortOption = (SortOption) getItem(i);
        if (this.b != i) {
            t90.z0(null);
        } else if (!sortOption.g()) {
            t90.z0(a(SpotifyIcon.CHECK_16));
        } else if (sortOption.f()) {
            t90.z0(a(SpotifyIcon.ARROW_UP_32));
        } else {
            t90.z0(a(SpotifyIcon.ARROW_DOWN_32));
        }
        t90.setText(getContext().getString(sortOption.c()));
        return t90.getView();
    }
}
