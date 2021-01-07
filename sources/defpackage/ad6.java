package defpackage;

import com.spotify.music.features.playlistentity.configuration.g;
import com.spotify.music.features.playlistentity.header.o0;
import com.spotify.music.features.playlistentity.homemix.HomeMixFormatListAttributesHelper;
import io.reactivex.y;

/* renamed from: ad6  reason: default package */
public class ad6 {
    private final wlf<o0> a;
    private final wlf<String> b;
    private final wlf<HomeMixFormatListAttributesHelper> c;
    private final wlf<me6> d;
    private final wlf<y> e;

    public ad6(wlf<o0> wlf, wlf<String> wlf2, wlf<HomeMixFormatListAttributesHelper> wlf3, wlf<me6> wlf4, wlf<y> wlf5) {
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

    public zc6 b(g gVar) {
        o0 o0Var = this.a.get();
        a(o0Var, 1);
        o0 o0Var2 = o0Var;
        String str = this.b.get();
        a(str, 2);
        String str2 = str;
        HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper = this.c.get();
        a(homeMixFormatListAttributesHelper, 3);
        HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper2 = homeMixFormatListAttributesHelper;
        me6 me6 = this.d.get();
        a(me6, 4);
        me6 me62 = me6;
        y yVar = this.e.get();
        a(yVar, 5);
        a(gVar, 6);
        return new zc6(o0Var2, str2, homeMixFormatListAttributesHelper2, me62, yVar, gVar);
    }
}
