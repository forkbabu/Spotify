package defpackage;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.api.trackrow.TrackRow;
import com.spotify.encore.consumer.components.api.trackrow.TrackRowConfiguration;
import com.spotify.music.features.playlistentity.c0;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.music.features.playlistentity.itemlist.adapter.a;
import com.spotify.music.features.playlistentity.itemlist.adapter.d;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.playlist.ui.d0;
import com.spotify.music.playlist.ui.f0;
import com.spotify.music.playlist.ui.l0;
import com.spotify.music.podcastentityrow.b0;
import defpackage.xi6;

/* renamed from: aj6  reason: default package */
final class aj6 implements xi6.a {
    private final wlf<d> a;
    private final wlf<l0.a<ContextMenuItem>> b;
    private final wlf<a> c;
    private final wlf<b0> d;
    private final wlf<ComponentFactory<Component<TrackRow.Model, TrackRow.Events>, TrackRowConfiguration>> e;
    private final wlf<c> f;
    private final wlf<f0> g;
    private final wlf<gxc> h;

    aj6(wlf<d> wlf, wlf<l0.a<ContextMenuItem>> wlf2, wlf<a> wlf3, wlf<b0> wlf4, wlf<ComponentFactory<Component<TrackRow.Model, TrackRow.Events>, TrackRowConfiguration>> wlf5, wlf<c> wlf6, wlf<f0> wlf7, wlf<gxc> wlf8) {
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
        b(wlf8, 8);
        this.h = wlf8;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.xi6.a
    public xi6 a(d0 d0Var, ajf ajf, c0 c0Var) {
        d dVar = this.a.get();
        b(dVar, 1);
        d dVar2 = dVar;
        l0.a<ContextMenuItem> aVar = this.b.get();
        b(aVar, 2);
        l0.a<ContextMenuItem> aVar2 = aVar;
        a aVar3 = this.c.get();
        b(aVar3, 3);
        a aVar4 = aVar3;
        b0 b0Var = this.d.get();
        b(b0Var, 4);
        b0 b0Var2 = b0Var;
        ComponentFactory<Component<TrackRow.Model, TrackRow.Events>, TrackRowConfiguration> componentFactory = this.e.get();
        b(componentFactory, 5);
        ComponentFactory<Component<TrackRow.Model, TrackRow.Events>, TrackRowConfiguration> componentFactory2 = componentFactory;
        c cVar = this.f.get();
        b(cVar, 6);
        c cVar2 = cVar;
        f0 f0Var = this.g.get();
        b(f0Var, 7);
        f0 f0Var2 = f0Var;
        gxc gxc = this.h.get();
        b(gxc, 8);
        b(d0Var, 9);
        b(ajf, 10);
        b(c0Var, 11);
        return new zi6(dVar2, aVar2, aVar4, b0Var2, componentFactory2, cVar2, f0Var2, gxc, d0Var, ajf, c0Var);
    }
}
