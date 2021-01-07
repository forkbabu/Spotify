package com.spotify.music.featues.stationspromo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;

class d {
    private final View a;
    private final b b;

    d(LayoutInflater layoutInflater, ViewGroup viewGroup, b bVar) {
        this.b = bVar;
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_stations_promo, viewGroup, false);
        this.a = inflate;
        inflate.findViewById(C0707R.id.get_stations_button).setOnClickListener(new a(this));
    }

    public View a() {
        return this.a;
    }

    public void b(View view) {
        this.a.getContext().startActivity(this.b.a());
    }
}
