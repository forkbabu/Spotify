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
import com.squareup.picasso.Picasso;
import defpackage.hi6;

/* renamed from: li6  reason: default package */
final class li6 implements hi6.a {
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

    li6(wlf<Picasso> wlf, wlf<pi6> wlf2, wlf<l0.a<ContextMenuItem>> wlf3, wlf<a> wlf4, wlf<d> wlf5, wlf<b0> wlf6, wlf<ComponentFactory<Component<TrackRow.Model, TrackRow.Events>, TrackRowConfiguration>> wlf7, wlf<c> wlf8, wlf<f0> wlf9, wlf<gxc> wlf10) {
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
        b(wlf9, 9);
        this.i = wlf9;
        b(wlf10, 10);
        this.j = wlf10;
    }

    private static <T> T b(T t, int i2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i2));
    }

    @Override // defpackage.hi6.a
    public hi6 a(d0 d0Var, ajf ajf, c0 c0Var) {
        Picasso picasso = this.a.get();
        b(picasso, 1);
        Picasso picasso2 = picasso;
        pi6 pi6 = this.b.get();
        b(pi6, 2);
        pi6 pi62 = pi6;
        l0.a<ContextMenuItem> aVar = this.c.get();
        b(aVar, 3);
        l0.a<ContextMenuItem> aVar2 = aVar;
        a aVar3 = this.d.get();
        b(aVar3, 4);
        a aVar4 = aVar3;
        d dVar = this.e.get();
        b(dVar, 5);
        d dVar2 = dVar;
        b0 b0Var = this.f.get();
        b(b0Var, 6);
        b0 b0Var2 = b0Var;
        ComponentFactory<Component<TrackRow.Model, TrackRow.Events>, TrackRowConfiguration> componentFactory = this.g.get();
        b(componentFactory, 7);
        ComponentFactory<Component<TrackRow.Model, TrackRow.Events>, TrackRowConfiguration> componentFactory2 = componentFactory;
        c cVar = this.h.get();
        b(cVar, 8);
        c cVar2 = cVar;
        f0 f0Var = this.i.get();
        b(f0Var, 9);
        f0 f0Var2 = f0Var;
        gxc gxc = this.j.get();
        b(gxc, 10);
        b(d0Var, 11);
        b(ajf, 12);
        b(c0Var, 13);
        return new ki6(picasso2, pi62, aVar2, aVar4, dVar2, b0Var2, componentFactory2, cVar2, f0Var2, gxc, d0Var, ajf, c0Var);
    }
}
