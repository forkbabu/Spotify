package defpackage;

import android.app.Activity;
import com.spotify.music.features.followfeed.mobius.b;
import com.spotify.music.features.followfeed.mobius.d;
import com.spotify.music.features.followfeed.mobius.i;
import com.spotify.music.features.followfeed.persistence.a;

/* renamed from: s35  reason: default package */
public final class s35 {
    private final wlf<Activity> a;
    private final wlf<w51> b;
    private final wlf<d> c;
    private final wlf<i> d;
    private final wlf<a> e;
    private final wlf<b> f;
    private final wlf<d25> g;

    public s35(wlf<Activity> wlf, wlf<w51> wlf2, wlf<d> wlf3, wlf<i> wlf4, wlf<a> wlf5, wlf<b> wlf6, wlf<d25> wlf7) {
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

    public r35 b(r25 r25, Runnable runnable) {
        Activity activity = this.a.get();
        a(activity, 1);
        Activity activity2 = activity;
        w51 w51 = this.b.get();
        a(w51, 2);
        w51 w512 = w51;
        d dVar = this.c.get();
        a(dVar, 3);
        d dVar2 = dVar;
        i iVar = this.d.get();
        a(iVar, 4);
        i iVar2 = iVar;
        a aVar = this.e.get();
        a(aVar, 5);
        a aVar2 = aVar;
        b bVar = this.f.get();
        a(bVar, 6);
        b bVar2 = bVar;
        d25 d25 = this.g.get();
        a(d25, 7);
        a(r25, 8);
        a(runnable, 9);
        return new r35(activity2, w512, dVar2, iVar2, aVar2, bVar2, d25, r25, runnable);
    }
}
