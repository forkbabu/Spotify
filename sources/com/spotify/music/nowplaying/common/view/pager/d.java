package com.spotify.music.nowplaying.common.view.pager;

import com.spotify.player.model.ContextTrack;
import java.util.List;

public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ TrackCarouselView a;
    public final /* synthetic */ List b;
    public final /* synthetic */ ContextTrack c;
    public final /* synthetic */ List f;

    public /* synthetic */ d(TrackCarouselView trackCarouselView, List list, ContextTrack contextTrack, List list2) {
        this.a = trackCarouselView;
        this.b = list;
        this.c = contextTrack;
        this.f = list2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.Y0(this.b, this.c, this.f);
    }
}
