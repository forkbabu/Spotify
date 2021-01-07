package defpackage;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.api.trackrow.TrackRow;
import com.spotify.encore.consumer.components.api.trackrow.TrackRowConfiguration;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.music.features.playlistentity.itemlist.adapter.a;
import com.spotify.music.features.playlistentity.itemlist.adapter.d;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.playlist.ui.f0;
import com.spotify.music.playlist.ui.l0;
import com.spotify.music.podcastentityrow.b0;

/* renamed from: bj6  reason: default package */
public final class bj6 implements fjf<aj6> {
    private final wlf<d> a;
    private final wlf<l0.a<ContextMenuItem>> b;
    private final wlf<a> c;
    private final wlf<b0> d;
    private final wlf<ComponentFactory<Component<TrackRow.Model, TrackRow.Events>, TrackRowConfiguration>> e;
    private final wlf<c> f;
    private final wlf<f0> g;
    private final wlf<gxc> h;

    public bj6(wlf<d> wlf, wlf<l0.a<ContextMenuItem>> wlf2, wlf<a> wlf3, wlf<b0> wlf4, wlf<ComponentFactory<Component<TrackRow.Model, TrackRow.Events>, TrackRowConfiguration>> wlf5, wlf<c> wlf6, wlf<f0> wlf7, wlf<gxc> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new aj6(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
