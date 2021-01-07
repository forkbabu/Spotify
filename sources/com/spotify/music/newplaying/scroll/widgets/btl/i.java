package com.spotify.music.newplaying.scroll.widgets.btl;

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.spotify.music.C0707R;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;

public class i implements NowPlayingWidget {
    private final l a;
    private final qlb b;
    private final nk2 c;
    private BtlWidgetView d;
    private final Rect e = new Rect();

    public i(l lVar, qlb qlb, nk2 nk2) {
        this.a = lVar;
        this.b = qlb;
        this.c = nk2;
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        BtlWidgetView btlWidgetView = (BtlWidgetView) layoutInflater.inflate(C0707R.layout.btl_widget, viewGroup, false);
        this.d = btlWidgetView;
        btlWidgetView.setLogger(this.c);
        return this.d;
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public void b() {
    }

    public /* synthetic */ void c() {
        this.d.getGlobalVisibleRect(this.e);
        if (((float) this.e.height()) / ((float) this.d.getMeasuredHeight()) >= 0.5f) {
            this.d.setContentVisibility(true);
        } else {
            this.d.setContentVisibility(false);
        }
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public void onStart() {
        this.a.c(this.d);
        this.b.d(this.d);
        ViewTreeObserver viewTreeObserver = this.d.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnScrollChangedListener(new c(this));
        }
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public void onStop() {
        this.a.d();
        this.b.c();
        ViewTreeObserver viewTreeObserver = this.d.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnScrollChangedListener(new c(this));
        }
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public NowPlayingWidget.Type type() {
        return NowPlayingWidget.Type.BEHIND_THE_LYRICS;
    }
}
