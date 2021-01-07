package defpackage;

import android.content.Context;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.api.trackrowcharts.TrackRowCharts;
import com.spotify.encore.consumer.components.api.trackrowcharts.TrackRowChartsConfiguration;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.music.features.playlistentity.itemlist.adapter.a;
import com.spotify.music.features.playlistentity.itemlist.adapter.d;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.playlist.ui.l0;
import com.spotify.remoteconfig.o9;

/* renamed from: yj4  reason: default package */
public final class yj4 implements fjf<xj4> {
    private final wlf<Context> a;
    private final wlf<d> b;
    private final wlf<l0.a<ContextMenuItem>> c;
    private final wlf<a> d;
    private final wlf<ComponentFactory<Component<TrackRowCharts.Model, TrackRowCharts.Events>, TrackRowChartsConfiguration>> e;
    private final wlf<c> f;
    private final wlf<o9> g;

    public yj4(wlf<Context> wlf, wlf<d> wlf2, wlf<l0.a<ContextMenuItem>> wlf3, wlf<a> wlf4, wlf<ComponentFactory<Component<TrackRowCharts.Model, TrackRowCharts.Events>, TrackRowChartsConfiguration>> wlf5, wlf<c> wlf6, wlf<o9> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xj4(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
