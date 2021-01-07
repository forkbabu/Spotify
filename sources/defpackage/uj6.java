package defpackage;

import com.spotify.glue.dialogs.g;
import com.spotify.music.features.playlistentity.c0;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.itemlist.adapter.h;
import com.spotify.music.features.playlistentity.w;
import defpackage.rj6;
import defpackage.wh6;

/* renamed from: uj6  reason: default package */
final class uj6 implements rj6.a {
    private final wlf<pj6> a;
    private final wlf<w> b;
    private final wlf<wh6.a> c;
    private final wlf<c0> d;
    private final wlf<g> e;

    uj6(wlf<pj6> wlf, wlf<w> wlf2, wlf<wh6.a> wlf3, wlf<c0> wlf4, wlf<g> wlf5) {
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
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.rj6.a
    public rj6 a(h hVar, ItemListConfiguration itemListConfiguration) {
        pj6 pj6 = this.a.get();
        b(pj6, 1);
        pj6 pj62 = pj6;
        w wVar = this.b.get();
        b(wVar, 2);
        w wVar2 = wVar;
        wh6.a aVar = this.c.get();
        b(aVar, 3);
        wh6.a aVar2 = aVar;
        c0 c0Var = this.d.get();
        b(c0Var, 4);
        c0 c0Var2 = c0Var;
        g gVar = this.e.get();
        b(gVar, 5);
        b(hVar, 6);
        b(itemListConfiguration, 7);
        return new tj6(pj62, wVar2, aVar2, c0Var2, gVar, hVar, itemListConfiguration);
    }
}
