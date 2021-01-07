package defpackage;

import com.spotify.music.features.playlistentity.premiumminidownloaded.toolbar.e;
import defpackage.zo6;
import defpackage.zt6;

/* renamed from: zp6  reason: default package */
public class zp6 implements zo6.c {
    private final wlf<up6> a;
    private final wlf<sq6> b;
    private final wlf<zt6.b.a> c;
    private final wlf<ui6> d;
    private final wlf<gq6> e;
    private final wlf<cq6> f;
    private final wlf<e> g;

    public zp6(wlf<up6> wlf, wlf<sq6> wlf2, wlf<zt6.b.a> wlf3, wlf<ui6> wlf4, wlf<gq6> wlf5, wlf<cq6> wlf6, wlf<e> wlf7) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
        a(wlf5, 5);
        this.e = wlf5;
        a(wlf6, 6);
        this.f = wlf6;
        a(wlf7, 7);
        this.g = wlf7;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.zo6.c
    public zo6 create() {
        up6 up6 = this.a.get();
        a(up6, 1);
        up6 up62 = up6;
        sq6 sq6 = this.b.get();
        a(sq6, 2);
        sq6 sq62 = sq6;
        zt6.b.a aVar = this.c.get();
        a(aVar, 3);
        zt6.b.a aVar2 = aVar;
        ui6 ui6 = this.d.get();
        a(ui6, 4);
        ui6 ui62 = ui6;
        gq6 gq6 = this.e.get();
        a(gq6, 5);
        gq6 gq62 = gq6;
        cq6 cq6 = this.f.get();
        a(cq6, 6);
        cq6 cq62 = cq6;
        e eVar = this.g.get();
        a(eVar, 7);
        return new wp6(up62, sq62, aVar2, ui62, gq62, cq62, eVar);
    }
}
