package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import defpackage.ao6;
import defpackage.lh6;
import io.reactivex.y;

/* access modifiers changed from: package-private */
/* renamed from: pj6  reason: default package */
public class pj6 {
    private final wlf<y> a;
    private final wlf<ao6.a> b;
    private final wlf<lh6.a> c;
    private final wlf<wj6> d;
    private final wlf<ph6> e;

    pj6(wlf<y> wlf, wlf<ao6.a> wlf2, wlf<lh6.a> wlf3, wlf<wj6> wlf4, wlf<ph6> wlf5) {
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
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    /* access modifiers changed from: package-private */
    public oj6 b(ItemListConfiguration itemListConfiguration) {
        y yVar = this.a.get();
        a(yVar, 1);
        y yVar2 = yVar;
        ao6.a aVar = this.b.get();
        a(aVar, 2);
        ao6.a aVar2 = aVar;
        lh6.a aVar3 = this.c.get();
        a(aVar3, 3);
        lh6.a aVar4 = aVar3;
        wj6 wj6 = this.d.get();
        a(wj6, 4);
        wj6 wj62 = wj6;
        ph6 ph6 = this.e.get();
        a(ph6, 5);
        a(itemListConfiguration, 6);
        return new oj6(yVar2, aVar2, aVar4, wj62, ph6, itemListConfiguration);
    }
}
