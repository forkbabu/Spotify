package defpackage;

import android.content.Context;
import com.spotify.music.features.playlistentity.configuration.g;
import com.squareup.picasso.Picasso;

/* renamed from: dd6  reason: default package */
public final class dd6 {
    private final wlf<Context> a;
    private final wlf<Picasso> b;
    private final wlf<gd6> c;
    private final wlf<ad6> d;

    public dd6(wlf<Context> wlf, wlf<Picasso> wlf2, wlf<gd6> wlf3, wlf<ad6> wlf4) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public fd6 b(g gVar) {
        Context context = this.a.get();
        a(context, 1);
        Context context2 = context;
        Picasso picasso = this.b.get();
        a(picasso, 2);
        Picasso picasso2 = picasso;
        gd6 gd6 = this.c.get();
        a(gd6, 3);
        gd6 gd62 = gd6;
        ad6 ad6 = this.d.get();
        a(ad6, 4);
        a(gVar, 5);
        return new fd6(context2, picasso2, gd62, ad6, gVar);
    }
}
