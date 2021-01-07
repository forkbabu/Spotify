package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.music.features.profile.profilelist.w;

/* renamed from: wt7  reason: default package */
public final class wt7 {
    private final wlf<ek7> a;
    private final wlf<gk7> b;
    private final wlf<w> c;

    public wt7(wlf<ek7> wlf, wlf<gk7> wlf2, wlf<w> wlf3) {
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

    public vt7 b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        a(layoutInflater, 1);
        LayoutInflater layoutInflater2 = layoutInflater;
        ek7 ek7 = this.a.get();
        a(ek7, 3);
        ek7 ek72 = ek7;
        gk7 gk7 = this.b.get();
        a(gk7, 4);
        gk7 gk72 = gk7;
        w wVar = this.c.get();
        a(wVar, 5);
        return new vt7(layoutInflater2, viewGroup, ek72, gk72, wVar);
    }
}
