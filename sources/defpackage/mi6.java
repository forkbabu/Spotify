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
import com.squareup.picasso.Picasso;

/* renamed from: mi6  reason: default package */
public final class mi6 implements fjf<li6> {
    private final wlf<Picasso> a;
    private final wlf<pi6> b;
    private final wlf<l0.a<ContextMenuItem>> c;
    private final wlf<a> d;
    private final wlf<d> e;
    private final wlf<b0> f;
    private final wlf<ComponentFactory<Component<TrackRow.Model, TrackRow.Events>, TrackRowConfiguration>> g;
    private final wlf<c> h;
    private final wlf<f0> i;
    private final wlf<gxc> j;

    public mi6(wlf<Picasso> wlf, wlf<pi6> wlf2, wlf<l0.a<ContextMenuItem>> wlf3, wlf<a> wlf4, wlf<d> wlf5, wlf<b0> wlf6, wlf<ComponentFactory<Component<TrackRow.Model, TrackRow.Events>, TrackRowConfiguration>> wlf7, wlf<c> wlf8, wlf<f0> wlf9, wlf<gxc> wlf10) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new li6(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }
}
