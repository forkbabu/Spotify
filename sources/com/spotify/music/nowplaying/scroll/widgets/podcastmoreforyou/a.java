package com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.music.C0707R;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.view.PodcastMoreForYouWidgetView;
import kotlin.jvm.internal.h;

public final class a implements NowPlayingWidget {
    private PodcastMoreForYouWidgetView a;
    private final qlb b;
    private final h c;
    private final i61 d;
    private final m e;

    public a(qlb qlb, h hVar, i61 i61, m mVar) {
        h.e(qlb, "colorTransitionController");
        h.e(hVar, "presenter");
        h.e(i61, "hubsAdapter");
        h.e(mVar, "hubsLayoutManagerFactory");
        this.b = qlb;
        this.c = hVar;
        this.d = i61;
        this.e = mVar;
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.e(layoutInflater, "inflater");
        h.e(viewGroup, "root");
        View inflate = layoutInflater.inflate(C0707R.layout.podcast_more_for_you_widget, viewGroup, false);
        if (inflate != null) {
            PodcastMoreForYouWidgetView podcastMoreForYouWidgetView = (PodcastMoreForYouWidgetView) inflate;
            this.a = podcastMoreForYouWidgetView;
            podcastMoreForYouWidgetView.b(this.d, this.e);
            PodcastMoreForYouWidgetView podcastMoreForYouWidgetView2 = this.a;
            if (podcastMoreForYouWidgetView2 != null) {
                return podcastMoreForYouWidgetView2;
            }
            h.k("widgetView");
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.view.PodcastMoreForYouWidgetView");
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public void b() {
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public void onStart() {
        h hVar = this.c;
        PodcastMoreForYouWidgetView podcastMoreForYouWidgetView = this.a;
        if (podcastMoreForYouWidgetView != null) {
            hVar.c(podcastMoreForYouWidgetView);
            qlb qlb = this.b;
            PodcastMoreForYouWidgetView podcastMoreForYouWidgetView2 = this.a;
            if (podcastMoreForYouWidgetView2 != null) {
                qlb.d(podcastMoreForYouWidgetView2);
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
        this.c.d();
        this.b.c();
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public NowPlayingWidget.Type type() {
        return NowPlayingWidget.Type.PODCAST_MORE_FOR_YOU;
    }
}
