package com.spotify.music.newplaying.scroll.widgets.storylines;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.storylines.ui.j;
import com.spotify.music.C0707R;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import com.squareup.picasso.Picasso;

public class v implements NowPlayingWidget {
    private final StorylinesWidgetPresenter a;
    private final Picasso b;
    private final j c;
    private StorylinesWidgetView d;

    public v(StorylinesWidgetPresenter storylinesWidgetPresenter, Picasso picasso, j jVar) {
        this.a = storylinesWidgetPresenter;
        this.b = picasso;
        this.c = jVar;
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        StorylinesWidgetView storylinesWidgetView = (StorylinesWidgetView) layoutInflater.inflate(C0707R.layout.storylines_widget, viewGroup, false);
        this.d = storylinesWidgetView;
        return storylinesWidgetView;
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public void b() {
        this.a.i();
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public void onStart() {
        this.a.q(this.d);
        this.d.setPicasso(this.b);
        this.d.setStorylinesCarouselAdapter(this.c);
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public void onStop() {
        this.a.r();
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public NowPlayingWidget.Type type() {
        return NowPlayingWidget.Type.STORYLINES;
    }
}
