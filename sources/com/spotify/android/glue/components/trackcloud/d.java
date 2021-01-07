package com.spotify.android.glue.components.trackcloud;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.C0707R;

class d implements c {
    private final TrackCloudTextView a;
    private final TextView b;
    private final ViewGroup c;
    private final b f = new b();

    public d(Context context, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(C0707R.layout.solar_track_cloud, viewGroup, false);
        this.c = viewGroup2;
        TextView textView = (TextView) viewGroup2.findViewById(C0707R.id.title);
        this.b = textView;
        TrackCloudTextView trackCloudTextView = (TrackCloudTextView) viewGroup2.findViewById(C0707R.id.track_cloud);
        this.a = trackCloudTextView;
        bvd c2 = dvd.c(viewGroup2);
        c2.g(textView, trackCloudTextView);
        c2.a();
    }

    @Override // com.spotify.android.glue.components.trackcloud.c
    public void c2(a aVar) {
        this.f.f(this.a, aVar);
        this.a.j(this.f);
        this.b.setText(aVar.p());
        this.b.setVisibility(aVar.d() ? 0 : 8);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.c;
    }
}
