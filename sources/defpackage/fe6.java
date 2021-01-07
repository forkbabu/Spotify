package defpackage;

import android.content.Context;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.playlistentity.homemix.l;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixTuning;
import com.spotify.music.features.playlistentity.homemix.q;
import com.spotify.music.features.playlistentity.w;
import java.util.EnumMap;

/* renamed from: fe6  reason: default package */
public final class fe6 {
    private final wlf<ce6> a;
    private final wlf<w> b;
    private final wlf<Context> c;
    private final wlf<EnumMap<HomeMixTuning.Style, String>> d;
    private final wlf<me6> e;
    private final wlf<l> f;
    private final wlf<ie6> g;
    private final wlf<af6> h;
    private final wlf<q> i;
    private final wlf<HomeMixFormatListAttributesHelper> j;

    public fe6(wlf<ce6> wlf, wlf<w> wlf2, wlf<Context> wlf3, wlf<EnumMap<HomeMixTuning.Style, String>> wlf4, wlf<me6> wlf5, wlf<l> wlf6, wlf<ie6> wlf7, wlf<af6> wlf8, wlf<q> wlf9, wlf<HomeMixFormatListAttributesHelper> wlf10) {
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
        a(wlf8, 8);
        this.h = wlf8;
        a(wlf9, 9);
        this.i = wlf9;
        a(wlf10, 10);
        this.j = wlf10;
    }

    private static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i2));
    }

    public ee6 b(ItemListConfiguration itemListConfiguration) {
        ce6 ce6 = this.a.get();
        a(ce6, 1);
        ce6 ce62 = ce6;
        w wVar = this.b.get();
        a(wVar, 2);
        w wVar2 = wVar;
        Context context = this.c.get();
        a(context, 3);
        Context context2 = context;
        EnumMap<HomeMixTuning.Style, String> enumMap = this.d.get();
        a(enumMap, 4);
        EnumMap<HomeMixTuning.Style, String> enumMap2 = enumMap;
        me6 me6 = this.e.get();
        a(me6, 5);
        me6 me62 = me6;
        l lVar = this.f.get();
        a(lVar, 6);
        l lVar2 = lVar;
        ie6 ie6 = this.g.get();
        a(ie6, 7);
        ie6 ie62 = ie6;
        af6 af6 = this.h.get();
        a(af6, 8);
        af6 af62 = af6;
        q qVar = this.i.get();
        a(qVar, 9);
        q qVar2 = qVar;
        HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper = this.j.get();
        a(homeMixFormatListAttributesHelper, 10);
        a(itemListConfiguration, 11);
        return new ee6(ce62, wVar2, context2, enumMap2, me62, lVar2, ie62, af62, qVar2, homeMixFormatListAttributesHelper, itemListConfiguration);
    }
}
