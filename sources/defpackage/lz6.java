package defpackage;

import android.content.Context;
import com.spotify.music.features.playlistallsongs.c;
import com.spotify.music.features.playlistallsongs.f;
import defpackage.kz6;

/* renamed from: lz6  reason: default package */
public final class lz6 implements kz6.c {
    private final wlf<Context> a;
    private final wlf<String> b;
    private final wlf<w17> c;
    private final wlf<f> d;
    private final wlf<wec> e;

    public lz6(wlf<Context> wlf, wlf<String> wlf2, wlf<w17> wlf3, wlf<f> wlf4, wlf<wec> wlf5) {
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

    @Override // defpackage.kz6.c
    public kz6 a(c cVar) {
        Context context = this.a.get();
        b(context, 1);
        Context context2 = context;
        String str = this.b.get();
        b(str, 2);
        String str2 = str;
        w17 w17 = this.c.get();
        b(w17, 3);
        w17 w172 = w17;
        f fVar = this.d.get();
        b(fVar, 4);
        f fVar2 = fVar;
        wec wec = this.e.get();
        b(wec, 5);
        b(cVar, 6);
        return new kz6(context2, str2, w172, fVar2, wec, cVar);
    }
}
