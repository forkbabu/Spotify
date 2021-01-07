package defpackage;

import android.view.ViewGroup;
import com.spotify.mobile.android.video.q;
import com.spotify.mobile.android.video.s;
import com.squareup.picasso.Picasso;

/* renamed from: uib  reason: default package */
public final class uib {
    private final wlf<s> a;
    private final wlf<q> b;
    private final wlf<sda> c;
    private final wlf<Picasso> d;

    public uib(wlf<s> wlf, wlf<q> wlf2, wlf<sda> wlf3, wlf<Picasso> wlf4) {
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

    public tib b(ViewGroup viewGroup) {
        a(viewGroup, 1);
        s sVar = this.a.get();
        a(sVar, 2);
        s sVar2 = sVar;
        q qVar = this.b.get();
        a(qVar, 3);
        q qVar2 = qVar;
        sda sda = this.c.get();
        a(sda, 4);
        sda sda2 = sda;
        Picasso picasso = this.d.get();
        a(picasso, 5);
        return new tib(viewGroup, sVar2, qVar2, sda2, picasso);
    }
}
