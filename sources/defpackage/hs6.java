package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.mobile.android.spotlets.common.recyclerview.c;
import com.spotify.music.features.playlistentity.w;
import com.squareup.picasso.Picasso;
import defpackage.fs6;

/* access modifiers changed from: package-private */
/* renamed from: hs6  reason: default package */
public final class hs6 implements fs6.a {
    private final wlf<js6> a;
    private final wlf<Context> b;
    private final wlf<Picasso> c;
    private final wlf<w> d;
    private final wlf<c> e;
    private final wlf<m> f;

    hs6(wlf<js6> wlf, wlf<Context> wlf2, wlf<Picasso> wlf3, wlf<w> wlf4, wlf<c> wlf5, wlf<m> wlf6) {
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
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.fs6.a
    public fs6 create() {
        js6 js6 = this.a.get();
        a(js6, 1);
        js6 js62 = js6;
        Context context = this.b.get();
        a(context, 2);
        Context context2 = context;
        Picasso picasso = this.c.get();
        a(picasso, 3);
        Picasso picasso2 = picasso;
        w wVar = this.d.get();
        a(wVar, 4);
        w wVar2 = wVar;
        wlf<c> wlf = this.e;
        m mVar = this.f.get();
        a(mVar, 6);
        return new gs6(js62, context2, picasso2, wVar2, wlf, mVar);
    }
}
