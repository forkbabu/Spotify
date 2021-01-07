package defpackage;

import android.content.Context;
import com.spotify.music.features.playlistentity.w;
import com.spotify.music.features.playlistentity.z;
import defpackage.d96;

/* access modifiers changed from: package-private */
/* renamed from: h96  reason: default package */
public final class h96 implements d96.a {
    private final wlf<Context> a;
    private final wlf<b96> b;
    private final wlf<gi9> c;
    private final wlf<w> d;
    private final wlf<z> e;

    h96(wlf<Context> wlf, wlf<b96> wlf2, wlf<gi9> wlf3, wlf<w> wlf4, wlf<z> wlf5) {
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

    @Override // defpackage.d96.a
    public d96 create() {
        Context context = this.a.get();
        a(context, 1);
        Context context2 = context;
        b96 b96 = this.b.get();
        a(b96, 2);
        b96 b962 = b96;
        gi9 gi9 = this.c.get();
        a(gi9, 3);
        gi9 gi92 = gi9;
        w wVar = this.d.get();
        a(wVar, 4);
        w wVar2 = wVar;
        z zVar = this.e.get();
        a(zVar, 5);
        return new g96(context2, b962, gi92, wVar2, zVar);
    }
}
