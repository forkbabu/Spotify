package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.playlistentity.homemix.q;
import defpackage.ao6;
import defpackage.lh6;

/* access modifiers changed from: package-private */
/* renamed from: ce6  reason: default package */
public class ce6 {
    private final wlf<ao6.a> a;
    private final wlf<lh6.a> b;
    private final wlf<HomeMixFormatListAttributesHelper> c;
    private final wlf<te6> d;
    private final wlf<yn1> e;
    private final wlf<me6> f;
    private final wlf<q> g;

    ce6(wlf<ao6.a> wlf, wlf<lh6.a> wlf2, wlf<HomeMixFormatListAttributesHelper> wlf3, wlf<te6> wlf4, wlf<yn1> wlf5, wlf<me6> wlf6, wlf<q> wlf7) {
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

    /* access modifiers changed from: package-private */
    public be6 b(ItemListConfiguration itemListConfiguration) {
        ao6.a aVar = this.a.get();
        a(aVar, 1);
        ao6.a aVar2 = aVar;
        lh6.a aVar3 = this.b.get();
        a(aVar3, 2);
        lh6.a aVar4 = aVar3;
        HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper = this.c.get();
        a(homeMixFormatListAttributesHelper, 3);
        HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper2 = homeMixFormatListAttributesHelper;
        te6 te6 = this.d.get();
        a(te6, 4);
        te6 te62 = te6;
        yn1 yn1 = this.e.get();
        a(yn1, 5);
        yn1 yn12 = yn1;
        me6 me6 = this.f.get();
        a(me6, 6);
        me6 me62 = me6;
        q qVar = this.g.get();
        a(qVar, 7);
        a(itemListConfiguration, 8);
        return new be6(aVar2, aVar4, homeMixFormatListAttributesHelper2, te62, yn12, me62, qVar, itemListConfiguration);
    }
}
