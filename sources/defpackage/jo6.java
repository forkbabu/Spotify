package defpackage;

import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* access modifiers changed from: package-private */
/* renamed from: jo6  reason: default package */
public class jo6 {
    private final wlf<String> a;
    private final wlf<d> b;
    private final wlf<g<PlayerState>> c;
    private final wlf<cqe> d;

    jo6(wlf<String> wlf, wlf<d> wlf2, wlf<g<PlayerState>> wlf3, wlf<cqe> wlf4) {
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

    /* access modifiers changed from: package-private */
    public io6 b(bre bre) {
        String str = this.a.get();
        a(str, 1);
        String str2 = str;
        d dVar = this.b.get();
        a(dVar, 2);
        d dVar2 = dVar;
        g<PlayerState> gVar = this.c.get();
        a(gVar, 3);
        g<PlayerState> gVar2 = gVar;
        cqe cqe = this.d.get();
        a(cqe, 4);
        a(bre, 5);
        return new io6(str2, dVar2, gVar2, cqe, bre);
    }
}
