package defpackage;

import com.spotify.music.connection.l;
import com.spotify.music.playlist.extender.f0;
import io.reactivex.y;

/* access modifiers changed from: package-private */
/* renamed from: t07  reason: default package */
public class t07 {
    private final wlf<y> a;
    private final wlf<f0.b> b;
    private final wlf<l> c;

    t07(wlf<y> wlf, wlf<f0.b> wlf2, wlf<l> wlf3) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    /* access modifiers changed from: package-private */
    public s07 b(boolean z) {
        y yVar = this.a.get();
        a(yVar, 1);
        f0.b bVar = this.b.get();
        a(bVar, 2);
        l lVar = this.c.get();
        a(lVar, 3);
        return new s07(yVar, bVar, lVar, z);
    }
}
