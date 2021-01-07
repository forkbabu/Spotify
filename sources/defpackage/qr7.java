package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.android.glue.components.toolbar.d;
import com.spotify.music.features.profile.entity.i;

/* renamed from: qr7  reason: default package */
public final class qr7 {
    private final wlf<Activity> a;
    private final wlf<d> b;
    private final wlf<lqa> c;
    private final wlf<ek7> d;
    private final wlf<i> e;
    private final wlf<hq7> f;
    private final wlf<gk7> g;
    private final wlf<il7> h;
    private final wlf<Boolean> i;

    public qr7(wlf<Activity> wlf, wlf<d> wlf2, wlf<lqa> wlf3, wlf<ek7> wlf4, wlf<i> wlf5, wlf<hq7> wlf6, wlf<gk7> wlf7, wlf<il7> wlf8, wlf<Boolean> wlf9) {
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
    }

    private static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i2));
    }

    public pr7 b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        a(layoutInflater, 1);
        LayoutInflater layoutInflater2 = layoutInflater;
        Activity activity = this.a.get();
        a(activity, 3);
        Activity activity2 = activity;
        d dVar = this.b.get();
        a(dVar, 4);
        d dVar2 = dVar;
        lqa lqa = this.c.get();
        a(lqa, 5);
        lqa lqa2 = lqa;
        wlf<ek7> wlf = this.d;
        i iVar = this.e.get();
        a(iVar, 7);
        i iVar2 = iVar;
        hq7 hq7 = this.f.get();
        a(hq7, 8);
        hq7 hq72 = hq7;
        gk7 gk7 = this.g.get();
        a(gk7, 9);
        gk7 gk72 = gk7;
        il7 il7 = this.h.get();
        a(il7, 10);
        il7 il72 = il7;
        Boolean bool = this.i.get();
        a(bool, 11);
        return new pr7(layoutInflater2, viewGroup, activity2, dVar2, lqa2, wlf, iVar2, hq72, gk72, il72, bool.booleanValue());
    }
}
