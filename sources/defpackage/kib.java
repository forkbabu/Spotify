package defpackage;

import android.view.ViewGroup;
import com.spotify.mobile.android.video.q;
import com.spotify.mobile.android.video.s;
import com.squareup.picasso.Picasso;

/* renamed from: kib  reason: default package */
public final class kib {
    private final wlf<s> a;
    private final wlf<q> b;
    private final wlf<sda> c;
    private final wlf<rhb> d;
    private final wlf<Picasso> e;
    private final wlf<mhb> f;

    public kib(wlf<s> wlf, wlf<q> wlf2, wlf<sda> wlf3, wlf<rhb> wlf4, wlf<Picasso> wlf5, wlf<mhb> wlf6) {
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

    public jib b(ViewGroup viewGroup) {
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
        rhb rhb = this.d.get();
        a(rhb, 5);
        rhb rhb2 = rhb;
        Picasso picasso = this.e.get();
        a(picasso, 6);
        Picasso picasso2 = picasso;
        mhb mhb = this.f.get();
        a(mhb, 7);
        return new jib(viewGroup, sVar2, qVar2, sda2, rhb2, picasso2, mhb);
    }
}
