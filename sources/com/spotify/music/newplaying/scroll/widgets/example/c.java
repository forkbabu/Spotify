package com.spotify.music.newplaying.scroll.widgets.example;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import com.squareup.picasso.Picasso;

public class c implements NowPlayingWidget {
    private final f a;
    private final Picasso b;
    private final qlb c;
    private ExampleWidgetView d;

    public c(f fVar, Picasso picasso, qlb qlb) {
        this.a = fVar;
        this.b = picasso;
        this.c = qlb;
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ExampleWidgetView exampleWidgetView = (ExampleWidgetView) layoutInflater.inflate(C0707R.layout.example_widget, viewGroup, false);
        this.d = exampleWidgetView;
        exampleWidgetView.setPicasso(this.b);
        return this.d;
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public void b() {
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public void onStart() {
        this.a.c(this.d);
        this.c.d(this.d);
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public void onStop() {
        this.a.d();
        this.c.c();
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public NowPlayingWidget.Type type() {
        return NowPlayingWidget.Type.EXAMPLE;
    }
}
