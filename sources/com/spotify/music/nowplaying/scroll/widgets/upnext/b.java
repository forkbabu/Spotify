package com.spotify.music.nowplaying.scroll.widgets.upnext;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import kotlin.jvm.internal.h;

public final class b implements NowPlayingWidget {
    private UpNextWidgetView a;
    private final i b;
    private final qlb c;
    private final f4c d;

    public b(i iVar, qlb qlb, f4c f4c) {
        h.e(iVar, "presenter");
        h.e(qlb, "colorTransitionController");
        h.e(f4c, "trackToRowViewTransformer");
        this.b = iVar;
        this.c = qlb;
        this.d = f4c;
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.e(layoutInflater, "inflater");
        h.e(viewGroup, "root");
        View inflate = layoutInflater.inflate(C0707R.layout.upnext_widget, viewGroup, false);
        if (inflate != null) {
            UpNextWidgetView upNextWidgetView = (UpNextWidgetView) inflate;
            this.a = upNextWidgetView;
            upNextWidgetView.c(this.d);
            UpNextWidgetView upNextWidgetView2 = this.a;
            if (upNextWidgetView2 != null) {
                return upNextWidgetView2;
            }
            h.k("widgetView");
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.spotify.music.nowplaying.scroll.widgets.upnext.UpNextWidgetView");
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public void b() {
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public void onStart() {
        i iVar = this.b;
        UpNextWidgetView upNextWidgetView = this.a;
        if (upNextWidgetView != null) {
            iVar.g(upNextWidgetView);
            qlb qlb = this.c;
            UpNextWidgetView upNextWidgetView2 = this.a;
            if (upNextWidgetView2 != null) {
                qlb.d(upNextWidgetView2);
            } else {
                h.k("widgetView");
                throw null;
            }
        } else {
            h.k("widgetView");
            throw null;
        }
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public void onStop() {
        this.b.h();
        this.c.c();
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public NowPlayingWidget.Type type() {
        return NowPlayingWidget.Type.UP_NEXT;
    }
}
