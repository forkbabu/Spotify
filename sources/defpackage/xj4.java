package defpackage;

import android.content.Context;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.api.trackrowcharts.TrackRowCharts;
import com.spotify.encore.consumer.components.api.trackrowcharts.TrackRowChartsConfiguration;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.music.features.playlistentity.itemlist.adapter.a;
import com.spotify.music.features.playlistentity.itemlist.adapter.d;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.playlist.ui.d0;
import com.spotify.music.playlist.ui.l0;
import com.spotify.remoteconfig.o9;
import defpackage.wj4;

/* renamed from: xj4  reason: default package */
public final class xj4 implements wj4.a {
    private final wlf<Context> a;
    private final wlf<d> b;
    private final wlf<l0.a<ContextMenuItem>> c;
    private final wlf<a> d;
    private final wlf<ComponentFactory<Component<TrackRowCharts.Model, TrackRowCharts.Events>, TrackRowChartsConfiguration>> e;
    private final wlf<c> f;
    private final wlf<o9> g;

    public xj4(wlf<Context> wlf, wlf<d> wlf2, wlf<l0.a<ContextMenuItem>> wlf3, wlf<a> wlf4, wlf<ComponentFactory<Component<TrackRowCharts.Model, TrackRowCharts.Events>, TrackRowChartsConfiguration>> wlf5, wlf<c> wlf6, wlf<o9> wlf7) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
        b(wlf3, 3);
        this.c = wlf3;
        b(wlf4, 4);
        this.d = wlf4;
        b(wlf5, 5);
        this.e = wlf5;
        b(wlf6, 6);
        this.f = wlf6;
        b(wlf7, 7);
        this.g = wlf7;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.wj4.a
    public wj4 a(d0 d0Var, ajf<b4<ContextMenuItem>> ajf) {
        Context context = this.a.get();
        b(context, 1);
        Context context2 = context;
        d dVar = this.b.get();
        b(dVar, 2);
        d dVar2 = dVar;
        l0.a<ContextMenuItem> aVar = this.c.get();
        b(aVar, 3);
        l0.a<ContextMenuItem> aVar2 = aVar;
        a aVar3 = this.d.get();
        b(aVar3, 4);
        a aVar4 = aVar3;
        ComponentFactory<Component<TrackRowCharts.Model, TrackRowCharts.Events>, TrackRowChartsConfiguration> componentFactory = this.e.get();
        b(componentFactory, 5);
        ComponentFactory<Component<TrackRowCharts.Model, TrackRowCharts.Events>, TrackRowChartsConfiguration> componentFactory2 = componentFactory;
        c cVar = this.f.get();
        b(cVar, 6);
        c cVar2 = cVar;
        o9 o9Var = this.g.get();
        b(o9Var, 7);
        b(d0Var, 8);
        b(ajf, 9);
        return new wj4(context2, dVar2, aVar2, aVar4, componentFactory2, cVar2, o9Var, d0Var, ajf);
    }
}
