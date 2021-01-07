package defpackage;

import com.spotify.music.features.playlistentity.configuration.c;
import io.reactivex.y;

/* access modifiers changed from: package-private */
/* renamed from: fg6  reason: default package */
public class fg6 {
    private final wlf<bg6> a;
    private final wlf<String> b;
    private final wlf<y> c;

    fg6(wlf<bg6> wlf, wlf<String> wlf2, wlf<y> wlf3) {
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
    public eg6 b(c cVar) {
        bg6 bg6 = this.a.get();
        a(bg6, 1);
        String str = this.b.get();
        a(str, 2);
        y yVar = this.c.get();
        a(yVar, 3);
        a(cVar, 4);
        return new eg6(bg6, str, yVar, cVar);
    }
}
